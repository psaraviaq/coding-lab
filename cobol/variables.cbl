       IDENTIFICATION DIVISION.
       PROGRAM-ID. Variables.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       
      ** Fields are used to store a single value
      *^ It starts with a level, then the name, and the picture clause
      *! The first level should always be 01 or 77
       01 EMPLOYEE PIC X(20).
       
      ** Records are used to store multiple related fields
      *! The record never has a picture clause
       01 CUSTOMER.
      *! The subsequent levels should be greater than the record,
      *! they can go from 02 to 49
           02 CUSTOMER-NAME        PIC X(20).
           02 CUSTOMER-PASSWORD    PIC X(20).
      *^ You can even create a record inside a record
           02 CUSTOMER-ADDRESS.
               03 CUSTOMER-CITY    PIC X(20).
               03 CUSTOMER-STATE   PIC X(20).
               
       PROCEDURE DIVISION.
      ** You can use "MOVE" to assign a value
           MOVE "John" TO EMPLOYEE.
           DISPLAY EMPLOYEE.
           
           MOVE "Pedro" TO CUSTOMER-NAME.
           DISPLAY CUSTOMER-NAME.
           MOVE "Lima" TO CUSTOMER-CITY.
           DISPLAY CUSTOMER-CITY.
