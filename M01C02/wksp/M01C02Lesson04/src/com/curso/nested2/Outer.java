package com.curso.nested2;

public class Outer {

    private int x = 24;

    public int getX() {
        String message = "x is ";

        class Inner {

            private int x = this.x;

            public void printX() {
                System.out.println(message + this.x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new Outer().getX();
    }
}
