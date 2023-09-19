package com.Patterns.Repeat;

public class TessletionPattern {

    public void tessletPattern(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++) {
                System.out.print("/\\");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n - i -1 ;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++) {
                System.out.print("\\/");
            }
            System.out.println();
        }
    }

    public void geometricPattern(int size) {
        for (int i = 0; i < size; i++) {
            // Print leading spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the left and right sides of the pattern
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j == 0 || j == i * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public void pyramidTriangle(int size) {
        
    }
}
