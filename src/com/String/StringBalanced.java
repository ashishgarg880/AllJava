package com.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class StringBalanced {
    static LinkedList<Integer> Solve(LinkedList<String> list) {
        LinkedList<Integer> link = new LinkedList<>();
        int count = 0;
        for (String str : list) {
            Stack<Character> stk = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
//                System.out.println(stk);
//                System.out.println(str.charAt(i));
                if (stk.isEmpty()) {
                    count = 0;
                }
                if (stk.contains(str.charAt(i))) {
//                    System.out.println(" " + str.charAt(i));
//                    System.out.println("After" + stk);
                    stk.pop();
                    count++;
                } else {
//                    System.out.println(" " + str.charAt(i));
                    stk.push(str.charAt(i));
                }
            }
            if (count%2==1) {
                link.add(1);
            } else {
                link.add(0);
            }
        }
        return link;
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("add");
        list.add("boook");
        list.add("break");
        System.out.println(Solve(list));
    }
}
