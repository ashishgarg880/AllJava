package com.Arr;
import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ArrayList> list = new ArrayList<>();
        for(int i=0;i<t;i++){
            int d = sc.nextInt();
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int j=0;j<d;j++){
                list1.add(sc.nextInt());
            }
            list.add(list1);
            sc.nextLine();
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            sc.nextLine();
            if(x<list.size() && y<list.get(x).size()){
                System.out.println(list.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
