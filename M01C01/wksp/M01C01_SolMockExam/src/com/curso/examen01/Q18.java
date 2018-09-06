package com.curso.examen01;

public class Q18 {
    public static void main(String[] args) {
        Q18 o = new Q18();
        String s[] = {"",""};
        //System.out.println("o.howMany(): " + o.howMany());
        System.out.println("o.howMany(true): " + o.howMany(true));
        System.out.println("o.howMany(true, true): " + o.howMany(true, true));
        System.out.println("o.howMany(true, true, true): " + o.howMany(true, true, true));
        //System.out.println("o.howMany(true, {true}): " + o.howMany(true, {true}));
        //System.out.println("o.howMany(true, {true, true}): " + o.howMany(true, {true, true}));
        System.out.println("o.howMany(true, new boolean[2]): " + o.howMany(true, new boolean[2]));
        
    }
    public int howMany(boolean b, boolean... b2) {
      return b2.length;
    }
}
/*
18. Given the following method, which of the method calls return 2?
(Choose all that apply)
public int howMany(boolean b, boolean... b2) {
return b2.length;
}
A. howMany();
B. howMany(true);
C. howMany(true, true);
D. howMany(true, true, true);
E. howMany(true, {true});
F. howMany(true, {true, true});
G. howMany(true, new boolean[2]);
R: D,G
*/