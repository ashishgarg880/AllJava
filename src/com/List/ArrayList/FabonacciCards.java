package com.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FabonacciCards {
    public static void main(String[] args) {
        int totalCards = 52;
        int playersPerRound = 4;
        List<Integer> fibonacciNumbers = generateFibonacciUpTo(totalCards);

        if (fibonacciNumbers.contains(playersPerRound)) {
            distributeCards(totalCards, playersPerRound);
        } else {
            System.out.println(playersPerRound + " players is not a valid Fibonacci number. Using closest Fibonacci number greater than or equal to " + playersPerRound);
        }
    }

    private static List<Integer> generateFibonacciUpTo(int limit) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 1, b = 1;
        fibonacciNumbers.add(a);
        fibonacciNumbers.add(b);

        while (true) {
            int next = a + b;
            if (next > limit) {
                break;
            }
            fibonacciNumbers.add(next);
            a = b;
            b = next;
        }

        return fibonacciNumbers;
    }

    private static void distributeCards(int totalCards, int playersPerRound) {
        int rounds = totalCards / playersPerRound;
        int cardsPerPlayer = totalCards / (playersPerRound * rounds);

        System.out.println("Distributing " + totalCards + " cards to " + playersPerRound + " players in " + rounds + " rounds.");
        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round " + i + ":");
            for (int j = 1; j <= playersPerRound; j++) {
                System.out.println("Player " + j + " gets " + cardsPerPlayer + " cards.");
            }
        }
    }
}
