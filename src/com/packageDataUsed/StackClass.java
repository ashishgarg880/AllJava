package com.packageDataUsed;

import java.util.Queue;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.add("Hello");
        stk.add("How Are u ");
        stk.add("I am");
        stk.add("Thanks u");
        System.out.println("POSITION OF-> "+stk.search("I am"));
        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
