package com.Exception;

public class TryFinally {
    public TryFinally() {
        int x = 5;
        int y = 10;
        try {
            y /= x;
        } catch (Exception e) {
            ++x;
        } finally {
            x++;
        }
        x++;
        System.out.println("X>>>"+ x);
    }
}
