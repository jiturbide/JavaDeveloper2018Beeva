package com.curso.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * @author JLIL
 */
public class TestLambdas01 {
    public static void main(String[] args) {
    }
}

/*



() -> true // 0 parameters
a -> {return a.startsWith("test");} // 1 parameter
(String a) -> a.startsWith("test") // 1 parameter
(int x) -> {} // 1 parameter
(int y) -> {return;} // 1 parameter
*/

interface One{ boolean algo(); }
interface Two{ boolean algo(String a);}
interface Three{ boolean algo(String a);}
interface Four{ void algo(int x);}
interface Five{ void algo(int y);}




/*

a, b -> a.startsWith("test") // DOES NOT COMPILE
c -> return 10; // DOES NOT COMPILE
a -> { return a.startsWith("test") } // DOES NOT COMPILE


Duck d -> d.quack() // DOES NOT COMPILE
a,d -> d.quack() // DOES NOT COMPILE
Animal a, Duck d -> d.quack() // DOES NOT COMPILE



(int y, z) -> {int x=1; return y+10; } // DOES NOT COMPILE

(String s, z) -> { return s.length()+z; } // DOES NOT COMPILE

(a, Animal b, c) -> a.getName() // DOES NOT COMPILE

(a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE

*/



