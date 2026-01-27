package com.example;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Act14 {
    public static void main(String args[]) throws IOException{
        File f1=new File("qe-java\\src\\main\\resources\\Helo.txt");
        boolean fstatus=f1.createNewFile();
        System.out.println(fstatus);
        System.out.println(FileUtils.readFileToString(f1,"UTF-8"));
        File destdir=new File("qe-java\\src\\main\\resources");
        FileUtils.copyFileToDirectory(f1, destdir);

    }

}
