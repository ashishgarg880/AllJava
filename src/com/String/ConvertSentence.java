package com.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertSentence {

    public String printSequence(String sentence)
    {
//        Map<Character, String> keypadMapping = new HashMap<>();
//        keypadMapping.put('A', "2");
//        keypadMapping.put('B', "2");
//        keypadMapping.put('C', "2");
//        keypadMapping.put('D', "3");
//        keypadMapping.put('E', "3");
//        keypadMapping.put('F', "3");
//        keypadMapping.put('G', "4");
//        keypadMapping.put('H', "4");
//        keypadMapping.put('I', "4");
//        keypadMapping.put('J', "5");
//        keypadMapping.put('K', "5");
//        keypadMapping.put('L', "5");
//        keypadMapping.put('M', "6");
//        keypadMapping.put('N', "6");
//        keypadMapping.put('O', "6");
//        keypadMapping.put('P', "7");
//        keypadMapping.put('Q', "7");
//        keypadMapping.put('R', "7");
//        keypadMapping.put('S', "7");
//        keypadMapping.put('T', "8");
//        keypadMapping.put('U', "8");
//        keypadMapping.put('V', "8");
//        keypadMapping.put('W', "9");
//        keypadMapping.put('X', "9");
//        keypadMapping.put('Y', "9");
//        keypadMapping.put('Z', "9");
//        keypadMapping.put(' ', "0");
//
//        StringBuilder numericSequence = new StringBuilder();
//
//        // Convert the sentence to uppercase and loop through each character
//        sentence = sentence.toUpperCase();
//        for (char c : sentence.toCharArray()) {
//            if (keypadMapping.containsKey(c)) {
//                numericSequence.append(keypadMapping.get(c));
//            }
//        }
//
//        return numericSequence.toString();

        // code here
         String str = "";
         Map<String,Integer> list = new HashMap<>();
         list.put("ABC", 2);
         list.put("DEF", 3);
         list.put("GHI", 4);
         list.put("JKL", 5);
         list.put("MNO", 6);
         list.put("PQRS", 7);
         list.put("TUV", 8);
         list.put("WXYZ", 9);
         list.put(" ",0);


//         Iterator<String> itr = list.keySet().iterator();
//        System.out.println(itr.next());
        for(Character c : sentence.toCharArray()) {
            for (Map.Entry<String,Integer> entry : list.entrySet()) {
                String key = entry.getKey();
                for(int i=0;i<key.length();i++) {
                        if(key.charAt(i) == c) {
                            int j = i;
//                            if(i==0) {
//                                str += list.get(key);
//                            } else {
                                while (j -->= 0) {
                                    str += list.get(key);
//                                }
                            }
                        }
                    }
                }
            }
        return str;
    }
}
