#!/usr/bin/env bash

# Check if both arguments are provided
if [ $# -ne 2 ]; then
    echo "Usage: $0 source_package target_package"
    echo "Example: $0 com.tools com.oracle.utils"
    exit 1
fi

# Get source and target packages from arguments
SOURCE_PACKAGE=$1
TARGET_PACKAGE=$2

# Convert package notation to directory paths
SOURCE_DIR=$(echo $SOURCE_PACKAGE | sed 's/\./\//g')
TARGET_DIR="src/main/java/$(echo $TARGET_PACKAGE | sed 's/\./\//g')"

# Create target directory structure
mkdir -p "./$TARGET_DIR"

# Find all Java files in source directory and save paths to array
# Using readarray (mapfile) to store file paths
readarray -t JAVA_FILES < <(find "./$SOURCE_DIR" -name "*.java" 2>/dev/null)

# Print what we found
echo "Found ${#JAVA_FILES[@]} Java files to process"

# Process each Java file
for file in "${JAVA_FILES[@]}"; do
    # Get just the filename without path
    filename=$(basename "$file")
    # Create target filepath
    target_file="./$TARGET_DIR/$filename"
    
    echo "Processing: $file -> $target_file"
    
    # Create temporary file for content manipulation
    temp_file=$(mktemp)
    
    # Check if file has package declaration
    if grep -q "^package" "$file"; then
        # Replace existing package declaration
        sed "s/package $SOURCE_PACKAGE;/package $TARGET_PACKAGE;/" "$file" > "$temp_file"
    else
        # Add package declaration at the beginning
        echo "package $TARGET_PACKAGE;" > "$temp_file"
        cat "$file" >> "$temp_file"
    fi
    
    # Move file to new location
    if mv "$temp_file" "$target_file" 2>/dev/null; then
        echo "Successfully moved and updated: $filename"
    else
        echo "Error moving file: $filename"
        rm -f "$temp_file"
        continue
    fi
done

# Move all .g4 files to target directory
find "./$SOURCE_DIR" -name "*.g4" -exec cp {} "./$TARGET_DIR/" \; 2>/dev/null

echo "Migration completed!"
