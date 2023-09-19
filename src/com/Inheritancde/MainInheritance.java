package com.Inheritancde;

public class MainInheritance {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.name + " " + parent.message());
    }
}
