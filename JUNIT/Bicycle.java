package com.example;
import java.util.Scanner;
interface Bp{
    void tyres();
    void maxspeed();

}
interface  Bo{
    void applybreak(int dec);
    void speedup(int incre);

}
public class Bicycle implements Bp,Bo{
    int gears;
    int spd;

    Bicycle(int ger,int sp){
       this. gears=ger;
       this.spd=sp;

    }
    public void tyres(){
        System.out.println("it has types"+this.gears);
    }
    public void maxspeed(){
        System.out.print("max speed is"+this.spd);
    }

    public void applybreak(int dec){
        System.out.println("speed decremented by "+dec);
    }
    public void speedup(int ic){
        System.out.println("Speeed Incremented by "+ic);
    }
    void bicycledesc(){
        System.out.println(this.gears+" "+this.spd);
    }


}
class MoutainBike extends Bicycle{
    int seatHeight;

    public MoutainBike(int seth,int gerr,int sss) {
        super(gerr, sss);
        this.seatHeight=seth;

    }
    void sethe(int seh){
        this.seatHeight=seh;
    }
    void bicycledesc(){
        System.out.println(this.gears+" "+this.spd+" "+this.seatHeight);
    }

    
}

  class Moutain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MoutainBike mo=new MoutainBike(10,sc.nextInt(),sc.nextInt());
        mo.speedup(100);
        mo.bicycledesc();
    }

}
