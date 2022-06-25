package com.packageDataUsed;

import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
import java.lang.*;

public class CalenderDate {
    static String Solve(int day,int month, int year){
        Calendar c = Calendar.getInstance();
        c.set(year,month,day);
        return LocalDate.of(year,month,day).getDayOfWeek().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        Solve(Day,month,year);
    }
}
