package com.example;
import java.util.Scanner;
public class Seconds {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long seconds=1000000000;
        double es=31557600;
        double ms=0.2408467;
        double vs=0.61519726;
        double mas=1.8808158;
        double js=11.862615;
        double ss=29.447498;
        double us=84.016846;
        double ns=164.79132;
        System.out.println(seconds/es +"earth years old");
        System.out.println(seconds/(es*ms)+" mercury years old");
        System.out.println(seconds/(es*vs)+" venus years old");
        System.out.println(seconds/(es*mas)+" marse years old");
        System.out.println(seconds/(es*js)+" jupitor years old");
        System.out.println(seconds/(es*ss)+" saturn years old");
        System.out.println(seconds/(es*us)+" uranus years old");
        System.out.println(seconds/(es*ns)+" neptune years old");




    }

}
