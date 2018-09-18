package com.curso.lesson03.clapatternsentmodule;

/**
 * Curso Design Paterns
 * @author JLIL 21/01/2017
 */
@FunctionalInterface
public interface PaymentStrategy {

	public void pay(double amount);
}