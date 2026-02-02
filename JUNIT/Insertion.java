package com.example;
import java.util.Scanner;


public class Insertion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0&&arr[j]>key;j--){
                 arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
    }

}
