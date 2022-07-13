package com.packageDataUsed;
import java.util.*;
import java.util.stream.Collectors;
public class stringToken {
    static void asListFilterToList(String st){
        String[] strArr = st.split("[!,?._'@ ]");
        strArr = Arrays.asList(strArr).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
        System.out.println(strArr.length);
        for(String str : strArr){
            System.out.println(str);
        }
    }

    static void replaceString(String str){
        String st = str.replaceAll("[\\d]]","");
        System.out.println(st);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st  = sc.nextLine();
        //asListFilterToList(st);
        replaceString(st);
    }
}