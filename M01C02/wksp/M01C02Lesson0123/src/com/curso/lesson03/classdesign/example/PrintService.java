package com.curso.lesson03.classdesign.example;

//TODO Cpnvertir a lambda
public class PrintService <T extends Printable>{
    public void print(T printable) {
        System.out.println(printable.getPrintableInfo());
    }
}

