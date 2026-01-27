package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Listss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<5;i++){
            al.add(sc.next());

        }
        for(int i=0;i<5;i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.print(al.get(3));
        System.out.println(al.contains("sai"));
        System.out.println(al.size());
        System.out.println(al.remove(3));
        System.out.println(al.size());

    }

}
