package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Mapss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Map<Integer,String> color=new HashMap<>();
        for(int i=0;i<5;i++){

            color.put(sc.nextInt(),sc.next());
        }
        System.out.println(color.remove(101));
        System.out.println(color.containsValue("red"));
        System.out.println(color.size());
        




    }

}
