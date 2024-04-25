package com.Threading;

public class TestException {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            return 0;
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            return 1;
        }
    }
}
