package com.example;
class Custom extends Exception{
   private String msg;

    public Custom(String mss) {
        this.msg=mss;

    }
    @Override
    public String getMessage(){
        return msg;
    }
   



}
public class Except {
    public void exceptionTest(String ss) throws Custom{
        if(ss.isEmpty()){
            throw new Custom("exception raised");
        }
        else{
            System.out.println(ss);
            
        }

    }
    public static void main(String[] args) throws Custom {
        Custom c=new Custom("hey");
       String demo= c.getMessage();
       Except e=new Except();
       
       e.exceptionTest(demo);       
          
   
    }



}
