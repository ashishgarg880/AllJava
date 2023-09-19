package com.Arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class stringGet {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("Amit");
        list.add("Garg");
        list.add("Ashish");
        list.add("Gupta");

        Collections.sort(list);
        ListIterator<String> li = list.listIterator();
        System.out.println("Start List");
        while (li.hasNext()){
            System.out.println("Index: "+li.nextIndex()+" Name ="+li.next());
        }

        System.out.println("Reverse List");
        while(li.hasPrevious()){
            System.out.println("Index: "+li.previousIndex()+" Name ="+li.previous());
        }
    }
}
