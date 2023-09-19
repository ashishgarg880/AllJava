package com.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IsPerfectNumber {
    public static int isPerfectNumber(long N) {
        List<Integer> list = new ArrayList<>();
        // code here
        for(int i=1;i<=N;i++) {
            if(N % i == 0) {
                list.add(i);
            }
        }

//        System.out.println(list.stream()..count());
        return 1;
    }
}
