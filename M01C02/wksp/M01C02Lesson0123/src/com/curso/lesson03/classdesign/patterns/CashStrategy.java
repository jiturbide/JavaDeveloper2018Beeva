package com.curso.lesson03.clapatternsentmodule;

/**
 * Curso Design Paterns
 *
 * @author JLIL 21/01/2017
 */
public class CashStrategy implements PaymentStrategy {
    private final double bills;
    
    public CashStrategy(double bills) {
        this.bills = bills;
    }

    @Override
    public void pay(double amount) {
        new StringBuffer().append("Paid using Cash, bills: ").append(bills).
                append(", amount: ").append(amount).
                append(", change: ").append(this.bills - amount);
    }

}
