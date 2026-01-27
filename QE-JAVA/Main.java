package com.example;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;

 

public class Main {
    public static void main(String[] args) {
          Random r=new Random();
         System.out.print(r.nextBoolean());
         System.out.print(r.nextDouble());
         File fi=FileUtils.getFile("qe-java\\src\\main\\resources\\Helo.txt");
         File input=new File("qe-java\\src\\main\\resources\\Helo.txt");

    }
}