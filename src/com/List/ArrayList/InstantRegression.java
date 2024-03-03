package com.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}

public class InstantRegression {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<B>();
        System.out.println(listA.getClass() == listB.getClass());

        int a=8;
        for(int i=0;i<a;i++)
        {
            i+=1;
            System.out.println(i);
        }
    }
}
