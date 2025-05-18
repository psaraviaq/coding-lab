       IDENTIFICATION DIVISION.
       PROGRAM-ID. Variables.
       DATA DIVISION.
       WORKING-STORAGE SECTION.

      ** Fields ARE used TO store a single VALUE
      *^ It starts WITH a level indicator, THEN the name, the TYPE
      *! The first level should always be 01 or 77
       01 EMPLOYEE PIC X(20).
       
       PROCEDURE DIVISION.
           MOVE "John" TO EMPLOYEE.
           DISPLAY EMPLOYEE.
