package com.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
class One{
    static Scanner sc=new Scanner(System.in);
     private List<String> pass;
      
     private int maxpass;
     private Date lasttime;
     private Date lastlanded;

     
    public One(int nn){
        this.maxpass=nn;
        this.pass=new ArrayList<>();

    }
    public void onboard(String name){
        if(pass.size()>maxpass){
            System.out.println("there is no space");

        }
        else{
            pass.add(name);
        }
    }
    public void getpass(){
        System.out.println(pass);
    }
    public Date getoff(){
        lastlanded=new Date();
        return lastlanded;
    }
    public Date lastttime(){
        lasttime=new Date();
        return lasttime;

    }
     

    
}


public class Pass extends Thread{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        
        One o=new One(10);
        try{
        o.onboard(sc.next());
        Thread.sleep(1000);}
        catch(Exception e){
            System.out.print(e);
        }
        o.getpass();
        System.out.println(o.getoff());
        System.out.println(o.lastttime());




    }
    

}
