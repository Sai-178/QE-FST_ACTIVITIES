package com.example;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Hashhhh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<6;i++){
            hs.add(sc.next());
        }
        System.out.println(hs.size());
        System.out.println(hs.remove("sai"));
        System.out.println(hs.remove("sai"));
        System.out.println(hs.contains("ram"));
        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
