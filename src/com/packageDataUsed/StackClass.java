package com.packageDataUsed;

import java.util.Stack;

public class StackClass {
    public static Stack<Integer> ascOrder(Stack<Integer> stk){
        Stack<Integer> tempStack = new Stack<>();
        while(!stk.isEmpty()) {
//            System.out.println("stk.pop"+stk.pop());
            int temp = stk.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
//                 System.out.println("TempStack"+tempStack.pop());
                stk.push(tempStack.pop());
//                System.out.println("Stack is:"+stk);
            }
            tempStack.push(temp);
//            System.out.println("After tempStack"+tempStack);
        }
        return tempStack;
    }
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
//        Stack<String> stk = new Stack<>();
//        stk.add("Hello");
//        stk.add("How Are u ");
//        stk.add("I am");
//        stk.add("Thanks u");
//        pushBottom("I am",stk);
//        System.out.println("POSITION OF-> "+stk.search("I am"));
//        reverse(stk);
//        while(!stk.isEmpty()){
//            System.out.println(stk.peek());
//            stk.pop();
//        }
        Stack<Integer> stk1 = new Stack<>();
        stk1.push(20); stk1.push(21);stk1.push(3);stk1.push(0);
        stk1.push(91);
        Stack<Integer> tempStack = ascOrder(stk1);
        while(!tempStack.empty()){
            System.out.println(tempStack.pop()+" ");
        }
    }
}
