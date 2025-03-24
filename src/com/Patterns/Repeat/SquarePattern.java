package com.Patterns.Repeat;

public class SquarePattern {
    public void squarePattern(int square) {
        for(int i=0; i<=square; i++) {
            for(int j=0; j<=square; j++) {
                if(i % square == 0 || j % square == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
