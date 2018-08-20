package com.curso;

public class TiposDato {
    int i;
    public static void main(String [] a) {
        {
          int i=5;
        } //scope

        int i = 0;
        System.out.println("i es: " + i);

        byte b1 = 1;
        byte b2 = 127;
        byte b3 = (byte)128;
        System.out.println("byte 128 cast: " + b3);

        short s1 = b1;
        //b1 = s1;

        b1 = (byte) (b1 + 1);
        //b1 = b1 + 1;
        b1 += 1+1;   // b1 = (byte) (b1 + (1+1));
        b1++; // b1 = (byte) (b1 + 1);

        float f1 = 1.2F;
        double d1 = 2.3;

        double l1 = 1e2; //1/100.0
        System.out.println("1e-2: " + l1);

        float f2 = 1e-20f;

        long l3 = 1000_000_000;
        long _1000_000_000 = 1;
        long l4 = _1000_000_000;
        long l5 = 1000_000_0_______00;

        int i4 = 10;
        int i5 = 0x000A;
        int i6 = 077;

        int i7 = 0x010;
        int i8 = 10;
        int i9 = 010;
        int i10 = 0b0000_1000_1010;






        //  null,  true,  false   //literales keywords
    }
}
