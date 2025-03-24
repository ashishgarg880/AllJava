package com.Abstract;

public class ExampleWithAbstract {
        public static void main(String[] args) {
            ExampleWithAbstract e = new ExampleWithAbstract() {};
            System.out.println(e.getClass().getSimpleName());


            Object obj = "Hello";
            if (obj instanceof String s) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(((String)obj).toUpperCase());
            }
        }

}
