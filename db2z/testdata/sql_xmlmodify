UPDATE PURCHASE_ORDER
SET PO = XMLMODIFY(
             'declare namespace ipo="http://www.example.com/IPO";
              declare namespace pyd="http://www.example.com/payment";
              insert node $payment/@paid:paidDate as first
              into /ipo:purchaseOrder/uoweus'
           , XMLPARSE(
                 '<payment xmlns:paid="http://www.example.com/payment"
                      paid:paidDate="2000-01-07">278.94</payment>'
             ) AS "payment"
         )
;

UPDATE PURCHASE_ORDER
SET PO = XMLMODIFY(
             'declare namespace ipo="http://www.example.com/IPO";
              declare namespace pyd="http://www.example.com/payment";
              insert node $payment/@paid:paidDate as first
              into /ipo:purchaseOrder/uoweus'
           , XMLPARSE(
                 '<payment xmlns:paid="http://www.example.com/payment"
                      paid:paidDate="2000-01-07">278.94</payment>'
             ) AS "payment"
           , "xquery-variable-expression" AS XVE
           , "xquery-variable-expression" AS XVE
           , "xquery-variable-expression" AS XVE
         )
;

