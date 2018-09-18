package com.curso.lesson03.classdesign.example;

import com.curso.lesson03.clapatternsentmodule.PaymentStrategy;
import java.util.Collection;

/**
 * @author JLIL
 */
public class PointOfSaleService implements IPointOfSaleService{
    public Collection buyTicket(PaymentStrategy ps, Purchase purchase) {
        //Validar evento, asientos, cantidad a pagar
        // TBD ...
        //Registrar compra 
        // TBD ...
        
        //Pagar en efectivo u medio de pago
        ps.pay(purchase.calculateTotal());
                
        //Generar tickets adicionales
        // TODO Generar tickets adicionales y devolverlos
        // Siempre generar una promo
        // Si se pago con tarjeta generar Voucher
        // El orden de los boletos es Promo, Ticket, Voucher si aplica
        
        return null;
    }
}

interface IPointOfSaleService {
    Collection buyTicket(PaymentStrategy ps, Purchase purchase);
}