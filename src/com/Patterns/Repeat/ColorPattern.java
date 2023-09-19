package com.Patterns.Repeat;

public class ColorPattern {

    public void colorPattern(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 0) {
                        System.out.print(" Blue ");
                    } else {
                        System.out.print(" Red ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(" Red ");
                    } else {
                        System.out.print(" Blue ");
                    }
                }
            }
            System.out.println();
        }
    }
}
