package com.curso.extra.generics;

/**
 * @author JLIL
 */
public class TestGenericsInterfaces {

}

interface Auditable<T> {
void audit(T t);
}

//Caso 01
class SaleOperationServ implements Auditable<Sale> {
public void audit(Sale t) { }
}

//Caso 02
class Transaction<Sale> implements Auditable<Sale> {
public void audit(Sale t) { }
}

//Caso 03
class TraceOperation implements Auditable {
public void audit(Object t) { }
}

class Sale{}