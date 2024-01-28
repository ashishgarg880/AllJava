package com.String;

public class CountHomogenous {
    public int countHomogenous(String s) {
//        Map<Character,Integer> map = new HashMap<>();
        int modulo = 1000000007;
        int result = 0;
        // for(Character c : s.toCharArray()) {
        for(int i=0;i<s.length();i++) {
            // map.put(map.getOrDefault(c,0) + 1);
            int count = 1;
            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count += 1;
                i++;
            }
            result += (count * (count + 1)) / 2;
            result = result % modulo;
        }
        return result;
    }
}
