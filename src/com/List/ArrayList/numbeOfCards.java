package com.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class numbeOfCards {
    public static void main(String[] args) {
//        public static void main (String [] args) {
            System.out.println ('j' + 'a' + 'v' + 'a');
//        }

        System.out.println('j' + 'a');
        int numberOfCards = 52; // Total number of cards
        int numberOfPersons = 5; // Number of persons

        List<Integer> fibonacciSeries = generateFibonacciSeries(numberOfCards);
        System.out.println("Fibonacci Series: " + fibonacciSeries);

        int[] distribution = distributeCards(numberOfCards, numberOfPersons, fibonacciSeries);
        System.out.println("Card distribution among " + numberOfPersons + " persons:");
        for (int i = 0; i < distribution.length; i++) {
            System.out.println("Person " + (i + 1) + ": " + distribution[i] + " cards");
        }
    }

    private static List<Integer> generateFibonacciSeries(int limit) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int a = 0, b = 1;
        while (a + b <= limit) {
            fibonacciSeries.add(a + b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        return fibonacciSeries;
    }


    // Distribute cards among persons based on Fibonacci numbers
    private static int[] distributeCards(int numberOfCards, int numberOfPersons, List<Integer> fibonacciSeries) {
        int[] distribution = new int[numberOfPersons];
        int currentIndex = 0;
        for (int i = fibonacciSeries.size() - 1; i >= 0; i--) {
            int currentFibonacci = fibonacciSeries.get(i);
            while (numberOfCards >= currentFibonacci) {
                distribution[currentIndex] += currentFibonacci;
                numberOfCards -= currentFibonacci;
                currentIndex = (currentIndex + 1) % numberOfPersons;
            }
        }
        return distribution;
    }
}
