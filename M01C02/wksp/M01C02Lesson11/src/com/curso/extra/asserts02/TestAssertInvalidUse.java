package com.curso.extra.asserts02;

public class TestAssertInvalidUse {
    private static long calls = 0;
    public static void main(String[] args) {
        assert writeLog("Iniciando programa");
        new Person().changeName("Pablito");

        assert writeLog("Todo ok");
        
        assert writeLog("Fin del programa");

    }
    
    public static boolean writeLog(String msg) {
        System.out.println(calls++ + " : " + msg);
        return true;
    }
}

class Person {
    private String name;
    private String ssn;
    private int age;

    private void checkAge() {
        assert age >= 18 && age < 150;  //Cual es el problema aqui?
    }

    public void changeName(String fname) {
        checkAge();
        name = fname;
    }
}
