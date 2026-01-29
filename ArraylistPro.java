package demos;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;

public class ArraylistPro {

    Scanner sc = new Scanner(System.in);

    ArrayList<String> al;

    @BeforeEach
    public void run() {
        al = new ArrayList<>();
        al.add("raju");
        al.add("maxu");
        al.add("hell");
    }

    @org.junit.jupiter.api.Test
    public void size() {
        Assert.assertEquals(3, al.size());
        for (int i = 0; i < al.size(); i++) {
            Assert.assertEquals(4, al.get(i).length());
        }
    }

    @org.junit.jupiter.api.Test
    public void replace() {
        al.set(1, "ramu");
        Assert.assertEquals(4, al.size());
        Assert.assertEquals("ramu", al.get(1));
    }

}
