package com.example;
  class Genericss <T,U>{
    T key;
    U value;

    public Genericss(T keey,U Val) {
        this.key=keey;
        this.value=Val;

    }
    public void getmessage(){
        System.out.println(key+" "+value);
    }

    

}
public class Genericsss {
    public static void main(String[] args) {
        Genericss<Integer,String> gen=new Genericss(10,"sai");
        gen.getmessage();

    }
}
