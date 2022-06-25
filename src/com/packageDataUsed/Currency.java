package com.packageDataUsed;
import java.io.*;
import java.util.*;
import java.text.*;
public class Currency {
    static void Solve(Double payment){
        String us="";NumberFormat n;
        n = NumberFormat.getCurrencyInstance(Locale.US);
        us = n.format(payment);
        System.out.println("US: " + us);
        n = NumberFormat.getCurrencyInstance(new Locale(
                "en","IN"));
        us = n.format(payment);
        System.out.println("India: "+ us);
        n = NumberFormat.getCurrencyInstance(Locale.CHINA);
        us = n.format(payment);
        System.out.println("China: "+ us);
        n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        us = n.format(payment);
        System.out.println("France: "+ us);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Double pay = sc.nextDouble();
        Solve(pay);
    }
}
