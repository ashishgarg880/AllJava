package com.Patterns.Repeat;

public class RepeatShades {

    public void repeatingSquare(int n){
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void checkBoard(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i % 2 == 1) {
                    System.out.print(" X");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
