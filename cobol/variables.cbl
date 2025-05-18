       IDENTIFICATION DIVISION.
       PROGRAM-ID. Variables.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       
      ** Fields ARE used TO store a single VALUE
      *^ It starts WITH a level indicator, THEN the name, the TYPE
      *! The first level should always be 01 or 77
       01 EMPLOYEE PIC X(20).
       
      ** Records are used to store multiple related fields
       01 CUSTOMER.
           02 CUSTOMER-NAME        PIC X(20).
           02 CUSTOMER-PASSWORD    PIC X(20).
           
       PROCEDURE DIVISION.
      ** You can use "MOVE" to assign a value
           MOVE "John" TO EMPLOYEE.
           DISPLAY EMPLOYEE.
           
           MOVE "Pedro" TO CUSTOMER-NAME.
           DISPLAY CUSTOMER-NAME.
