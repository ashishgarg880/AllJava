package com.Threading;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.StampedLock;

// ----------------- Red-Black Tree for Price Sorting -------------------
class OrderBook {
    private final NavigableMap<Double, ConcurrentSkipListSet<Order>> priceTree = new ConcurrentSkipListMap<>();
    private final StampedLock lock = new StampedLock();

    public void addOrder(Order order) {
        long stamp = lock.writeLock();
        try {
            priceTree.computeIfAbsent(order.price(), k -> new ConcurrentSkipListSet<>(Comparator.comparingLong(Order::orderId))).add(order);
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    public Order matchOrder(double price) {
        long stamp = lock.readLock();
        try {
            Map.Entry<Double, ConcurrentSkipListSet<Order>> entry = priceTree.ceilingEntry(price);
            if (entry != null && !entry.getValue().isEmpty()) {
                return entry.getValue().first();
            }
            return null;
        } finally {
            lock.unlockRead(stamp);
        }
    }
}
