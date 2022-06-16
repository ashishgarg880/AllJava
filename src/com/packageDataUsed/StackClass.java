package com.packageDataUsed;

import java.util.Stack;

public class StackClass {
    public static void pushBottom(String data,Stack<String> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        String top = s.pop();
        pushBottom(data,s);
        s.push(top);
    }

    public static void reverse(Stack<String> s){
        if(s.isEmpty()){
            return;
        }
        String top = s.pop();
        reverse(s);
        pushBottom(top,s);
    }
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.add("Hello");
        stk.add("How Are u ");
        stk.add("I am");
        stk.add("Thanks u");
        pushBottom("I am",stk);
        System.out.println("POSITION OF-> "+stk.search("I am"));
        reverse(stk);
        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
