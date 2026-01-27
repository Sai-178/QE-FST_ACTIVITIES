package com.example;
interface Addable{
    int add(int n,int m);

}

public class Act12 {

    public static void main(String[] args) {
        Addable ad1=(a,b)->(a+b);
             
 
        Addable ad2=(a,b)->{
            return (a+b);
        };
        ad2.add(10,20);
        ad1.add(20,30);
        
    }

}
