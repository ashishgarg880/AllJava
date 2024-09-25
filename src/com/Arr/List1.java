package com.Arr;

import java.util.ArrayList;

public class List1 {
    static class Stack{
        static ArrayList<String> list = new ArrayList<>();

        public static void push(String data){
            list.add(data);
        }

        public static boolean isValid(){return list.size() == 0; }

        public static String pop(){
            if(isValid()){
                return "False";
            }
            String top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static String peek(){
            if(isValid()){
                return "False";
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push("1");
        s1.push("2");
        s1.push("3");
        s1.push("4");
        while(!s1.isValid()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
