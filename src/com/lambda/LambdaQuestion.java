package com.lambda;

import java.util.function.IntBinaryOperator;

public class LambdaQuestion {
    IntBinaryOperator operation = (a, b) -> a * b;
    public int Solve(int a,int b) {
        int result = operation.applyAsInt(5, 3);
        System.out.println(result);
        return result;
    }
}
