       Identification Division.
       Program-ID.    test9021.
       Procedure Division.
debug          perform until x > z-end - 1
debug            if  ls-disperr (x:2) = x'0d25'
debug                compute z = x - y
debug                if  z = zero
debug                    display ' '
debug                else
debug                    display ls-disperr (y:z)
debug                end-if
debug                compute y = x + 2
debug                add 1 to x
debug            end-if
debug            add 1 to x
debug          end-perform
debug          if  y < z-end
debug              compute z = (z-end + 1) - y
debug              display ls-disperr (y:z)
debug          end-if
           goback.
