package com;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RedBlink {
    public static void occurrence(String[] inputArray) {
        Map<String, Long> frequencyMap = Arrays.stream(inputArray)
                .collect(Collectors.groupingBy(
                        // Group by the character itself
                        c -> c,
                        // Count occurrences within each group
                        Collectors.counting()
                ));

        frequencyMap.forEach((character, count) -> {
            System.out.println(character + " - " + count);
        });
    }

    public static void main(String[] args) {
        String[] c = {"a", "b", "a", "c", "b", "e", "f", "c", "e"};
        occurrence(c);

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        HashMap<Integer,Integer> map = new HashMap();
//        while(t--> 0) {
//            System.out.print("Enter the number of players: ");
//            int numPlayers = sc.nextInt();
//
//            System.out.print("Enter the number of cards: ");
//            int numCards = sc.nextInt();
//
//            map.put(numPlayers, map.getOrDefault(numPlayers, 0) + numCards);
//        }
//
//        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards: ");
        int numCards = scanner.nextInt();

        int[] playerCards = new int[numPlayers];

        IntStream.rangeClosed(1, numCards)
                .forEach(card -> {
                    int currentPlayer = (card - 1) % numPlayers;
                    playerCards[currentPlayer] += card;
                });

        IntStream.range(0, numPlayers)
                .forEach(player -> System.out.println("Player " + (player + 1) + " - " + playerCards[player]));
    }
}

class DivideCards{
    private void Solve() {
        IntStream.rangeClosed(1, 4)
                .forEach(n -> {
                    int result = n * (n - 1);
                    System.out.println(n + " - " + result);
                });

        IntStream.rangeClosed(1, 4)
                .forEach(n -> {
                    int result = n * (n + 1) * 3;
                    System.out.println(n + " - " + result);
                });
    }



    public static List<Integer> generateFibonacciSequence(int length) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        for (int i = 2; i < length; i++) {
            int nextFibonacci = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(nextFibonacci);
        }
        return sequence;
    }
    public static void main(String[] args) {
        int numberOfCards = 10; // Change this to the number of cards you have.

        List<Integer> fibonacciSequence = generateFibonacciSequence(numberOfCards);
        List<Integer> cards = Stream.iterate(0, n -> n + 1)
                .limit(numberOfCards)
                .map(i -> fibonacciSequence.get(i))
                .collect(Collectors.toList());

        System.out.println("Fibonacci Sequence: " + fibonacciSequence);
        System.out.println("Distributed Cards: " + cards);

//        int numPeople = 2; // Change this to the number of people you have.
//
//        int totalCards = 52; // Assuming a standard deck of 52 cards.
////        DivideCards divideCards = new DivideCards();
////        divideCards.Solve();
//        int[] cardSequence = new int[numPeople];
//        cardSequence[0] = 1;
//        cardSequence[1] = 1;
//        List<List<Integer>> list1 = new ArrayList<>();
//        int totalNumber = 0;
//        boolean iterate = true;
//        while (totalCards-- > 0) {
//            List<Integer> list = new ArrayList<>();
//            for (int i = 2; i < numPeople; i++) {
//                cardSequence[i] = cardSequence[i - 1] + cardSequence[i - 2];
//            }
//
//            for (int i : cardSequence) {
//                list.add(i);
//                totalNumber += i;
//            }
//
//            totalCards -= totalNumber;
//
//            if (totalNumber <= totalCards && iterate) {
//                cardSequence[0] = cardSequence[numPeople - 2] + cardSequence[numPeople - 1];
//                cardSequence[1] = cardSequence[0] + cardSequence[numPeople - 1];
//                list1.add(list);
////                System.out.println("if >>" + list1);
//            } else {
//                cardSequence[0] = cardSequence[numPeople - 2] + cardSequence[numPeople - 1] + 1;
//                cardSequence[1] = cardSequence[0] + cardSequence[numPeople - 1];
//                iterate = false;
////                System.out.println(">>>>" + list1);
//            }
//
//            if (!iterate) {
//                list1.add(list);
//            }
//        }
//        list1.stream().forEach(n -> System.out.println(n));
    }
}
