package com.example;
import java.util.*;

class Act {
      Scanner sc=new Scanner(System.in);
    String color=sc.next();
    String trans=sc.next();
    int make=sc.nextInt();
    int tyres;
    int doors;

   Act( ){
     this.tyres=4;
    this.doors=4;
       }
    void displaychar(){
        System.out.print(color+" "+trans+" "+make+" "+tyres+" "+doors);
    }
    void acce(){
        System.out.println("Car is moving forward");
    }
    void brake(){
        System.out.println("car is stopped");
    }





}
public class Car{
    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        Act ac=new Act();
        ac.displaychar();
        ac.acce();
        ac.brake();


    }
}