package com.Threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ----------------- Matching Engine Using Virtual Threads -------------------
class MatchingEngine {
    private final OrderBook orderBook = new OrderBook();
    ExecutorService executor = Executors.newCachedThreadPool(Thread.ofVirtual().factory());

    public void processOrders(List<Order> orders) {
        List<CompletableFuture<Void>> tasks = new ArrayList<>();
        for (Order order : orders) {
            tasks.add(CompletableFuture.runAsync(() -> {
                orderBook.addOrder(order);
                System.out.println("Processed Order: " + order);
            }, executor));
        }
        tasks.forEach(CompletableFuture::join);
    }

    public void matchOrder(double price) {
        CompletableFuture.supplyAsync(() -> orderBook.matchOrder(price), executor)
                .thenAccept(order -> System.out.println("Matched Order: " + order));
    }
}
