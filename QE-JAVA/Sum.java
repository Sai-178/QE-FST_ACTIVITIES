package com.example;
import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==10){
                sum=sum+arr[i];
            }
        }
        if(sum==30){
            System.out.print("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }

}
