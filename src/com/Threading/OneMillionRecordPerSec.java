package com.Threading;


import java.util.List;

public class OneMillionRecordPerSec {
    public static void main(String[] args) {
        MatchingEngine engine = new MatchingEngine();

        List<Order> orders = List.of(
                new Order(1, "BUY", 100.5, 10),
                new Order(2, "SELL", 100.8, 5),
                new Order(3, "BUY", 100.7, 15)
        );

        engine.processOrders(orders);
        engine.matchOrder(100.6);
    }
}
