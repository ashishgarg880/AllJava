package com.List.ArrayList;

import java.util.*;

public class FindItinerary {
    private static Map<String, List<String>> flightGraph;

    public static List<String> findItinerary() {
        List<String> list = new ArrayList<>();
        return list;
    }
    public static List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);

            flightGraph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        }

        for (List<String> destinations : flightGraph.values()) {
            destinations.sort(Collections.reverseOrder());
        }

        list.add("JFK");
        for(Map.Entry<String,String> mp : map.entrySet()) {
//            list.add(map.get(list.get(list.size() - 1)));
        }

//        System.out.println(map);
        System.out.println(list);
        return list;
    }
}
