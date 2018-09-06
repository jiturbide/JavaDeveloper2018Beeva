package com.curso.examen01;

public class Q41 {
}

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
void roar() throws HasSoreThroatException;
}
class Lion implements Roar {
// INSERT CODE HERE
// public void roar(){}     //A
// public void roar() throws Exception{} //B
// public void roar() throws HasSoreThroatException{} //C
// public void roar() throws IllegalArgumentException{} //D
// public void roar() throws TiredException{}       //E
}
/*
41. Which of the following can be inserted into Lion to make this code compile?
(Choose all that apply)
class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
void roar() throws HasSoreThroatException;
}
class Lion implements Roar {
// INSERT CODE HERE
}
A. public void roar(){}
B. public void roar() throws Exception{}
C. public void roar() throws HasSoreThroatException{}
D. public void roar() throws IllegalArgumentException{}
E. public void roar() throws TiredException{}
R: A,C,D,E
*/