package com.curso.lesson03.clapatternsentmodule;

/**
 * Curso Design Paterns
 *
 * @author JLIL 21/01/2017
 */
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit/debit card");
    }

}
