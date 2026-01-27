package com.example;
import java.util.Scanner;


 abstract class Hey{
    String title;
     
    abstract void settit(String titt);
    String gettit(){
        return this.title;
    }

}

 class Ab extends Hey{
    void settit(String titt){
        title=titt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ab a=new Ab();
        a.settit(sc.next());
        String s=a.gettit();
        System.out.println(s);

        
    }

}
