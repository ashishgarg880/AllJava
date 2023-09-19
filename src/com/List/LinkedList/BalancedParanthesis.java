package com.List.LinkedList;

public class BalancedParanthesis {
    public static boolean isValid(String str) {
        if(str.length() == 0 && str == null){
            return true;
        }
        int count = 0;int i=0;
        while(i<str.length()){
            char ch = str.charAt(i);
            if(ch == '{'){
                count++;
            }
            else if(ch == '}'){
                if(count==0){
                    return false;
                }
                count--;
            }
            i++;
        }
        if(count!=0){
            return false;
        }
        return true;
    }

    public static void stringIsPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println(rev);
            System.out.println("String is not Palindrome");}
    }
    public static void main(String[] args) {
        String str = "";
        System.out.println("String is Valid "+isValid(str));
        str = "{}{}{}{}{}{}";
        System.out.println("String is Valid "+isValid(str));
        str = "MOM";
        stringIsPalindrome(str);
    }
}
