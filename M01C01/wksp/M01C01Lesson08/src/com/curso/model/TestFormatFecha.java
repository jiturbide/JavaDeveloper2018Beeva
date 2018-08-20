package com.curso.model;

import java.util.Date;

public class TestFormatFecha {
    public static void main(String[] args) {
        // aaaa-mm-dd
        //FormatFecha f = new FormatFecha();
        String s = FormatFecha.format(FormatFecha.FMT_ISO, new Date());
        System.out.println("Fecha: " + s);
        //"10/6/2010"   2010-06-10
    }
}
