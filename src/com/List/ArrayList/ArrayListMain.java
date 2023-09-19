package com.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
//        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
//        isPerfectNumber.isPerfectNumber(6);

//       FindItinerary findItinerary = new FindItinerary();
//        List<List<String>> list = new ArrayList<>();
//        int[] arr = {};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 512, 45, 2, 7, 5));
        Collections.sort(list1); // Sort the list in ascending order

        list1.add(3); // Add an element to the list
        list1.add(1); // Add another element to the list

        System.out.println(list1);

//        list1.add("MUC");
//        list1.add("LHR");
//        list.add(list1);
//        list1 = new ArrayList<>();
//        list1.add("JFK");
//        list1.add("JFK");
//        list.add(list1);
//        list1 = new ArrayList<>();
//        list1.add("SFO");
//        list1.add("SJC");
//        list.add(list1);
//        list1 = new ArrayList<>();
//        list1.add("LHR");
//        list1.add("LHR");
//        list.add(list1);
//        Collections.sort(list1);
//        list1.add(3);
//        list1.add(1);
//        System.out.println(list1);
//        findItinerary.findItinerary(list1);
    }
}

