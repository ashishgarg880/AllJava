package com.Looping;

public class ForLoop {

    public void forLoop() {
        int i = 0;
        loop:
        for (; true; i++) {
            for (; i < 5; i++) {
                if (i == 3) break loop;
            }
        }
        System.out.println(i);
    }
}
