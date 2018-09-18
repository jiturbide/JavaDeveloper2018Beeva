package com.curso.lesson03.clapatternsentmodule;

/**
 * Curso Design Paterns
 *
 * @author JLIL 21/01/2017
 */
public class PayPalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PayPalStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Paypal");
    }

}
