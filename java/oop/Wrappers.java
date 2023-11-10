package oop;

import java.util.ArrayList;

public class Wrappers {
    
    public static void main(String[] args) {
        
        //* Wrappers are versions of primitive types that are objects, which are used in collections
        Integer i = 5;
        Byte b = 1;
        Short s = 2;
        Long l = 3L;
        
        Float f = 1.0f;
        Double d = 2.0;
        
        Boolean bool = true;
        
        Character c = 'a';
        //? "String" was already an object
        
        
        //* -------------------- Autoboxing --------------------
        //* When converting a primitive type to a wrapper and vice versa automatically
        int num = i;
        
        //* You can perform operations between primitives and wrappers
        // Integer i = 5;
        i++;
        
        //* It works for arguments and return types too
        sum(2, 4);
        
        //* Even when adding and removing from collections
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num);
        int sameNum = numbers.get(0);
        
        //* And also for conditional statements
        Boolean expression = true;
        if (expression) {
            System.out.println("!");
        }
        
        //* -------------------- Parsing --------------------
        int num1 = Integer.parseInt("123");
        double num2 = Double.parseDouble("123.45");
        boolean bool1 = Boolean.parseBoolean("TruE");
    }
    
    public static int sum(Integer a, Integer b) {
        return a + b;
    }
}
