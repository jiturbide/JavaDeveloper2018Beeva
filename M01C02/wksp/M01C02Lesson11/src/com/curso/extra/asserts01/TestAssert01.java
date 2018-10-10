package com.curso.extra.asserts01;

public class TestAssert01 {
    public static void main(String[] args) {
        long ini=0, fin=0,lapso = 0;
        
        ini = System.nanoTime();
        fin = System.nanoTime();
        lapso = fin -ini;
        System.out.println("Lapso: " + lapso);
        
        assert lapso > 0 : "Lapso tiene un valor invalido: " + lapso;  

        //if(lapso <= 0) throw new AssertionError("Lapso tiene un valor invalido: " + lapso);  

    }
}

/*
java -ea com.curso.extra.asserts01.TestAssert01
java -ea:com.curso com.curso.extra.asserts01.TestAssert01
java -ea:com.curso... com.curso.extra.asserts01.TestAssert01

set CLASSPATH=C:\JavaDeveloper2018Beeva\M01C02\wksp\M01C02Lesson11\build\classes 
java -ea:com.curso -cp com.curso.extra.asserts01.TestAssert01
java -ea:com.curso... -da:com.curso.extra.asserts01... com.curso.extra.asserts01.TestAssert01
java -ea:com.curso.extra.asserts01.TestAssert01 com.curso.extra.asserts01.TestAssert01

 

*/
        