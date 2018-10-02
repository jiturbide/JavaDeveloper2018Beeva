package com.curso.solexamen;

/**
 * @author JLIL
 */
public class Cap03Q18 {

}

class A {}
class B extends A {}
class C extends B {}
class D<C> {
// INSERT CODE HERE
    A a1 = new A();
    A a2 = new B();

    A a3 = new C();
    C c1 = new A();
    C c2 = new B();
    C c3 = new C();    
}

