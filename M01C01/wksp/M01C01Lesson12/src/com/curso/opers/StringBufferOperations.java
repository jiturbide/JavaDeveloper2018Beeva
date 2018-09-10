package com.curso.opers;

import static java.lang.System.exit;

public class StringBufferOperations {
    public static void main(String[] args) {
        String in = args[0];
        if(null == in){
            System.out.println("se requiere el argumento de correo");
            exit(0);
        }
        StringBuffer email = new StringBuffer(in);
        if(email.length() == 0){
            System.out.println("Longitud no puede ser vacia");
            exit(0);   
        }
        email.trimToSize();
        //Calcular la longitud real de la cadena. 
        // java StringOperations "    jluis@hotmail.com     "
        System.out.println("Longitud: " + email.length());
        
        //Validar si el correo es de homero.simpson@springfield.com usando equals, compareTo
        System.out.println("equals   : " + email + " es igual a homero.simpson@springfield.com: " + ("homero.simpson@springfield.com".equalsIgnoreCase(email.toString())));
        System.out.println("compareTo: " + email + " es igual a homero.simpson@springfield.com: " + ("homero.simpson@springfield.com".compareToIgnoreCase(email.toString())));
        
        //Imprimir informacion del correo:
        //Mostrar solo el nombre del usuario, imprimir solo el dominio del correo
        int index = email.indexOf("@");
        if(index>0){
            System.out.println("usuario: " + email.substring(0, index));
            System.out.println("dominio: " + email.substring(index + 1));
        }
        //Informar si el dominio es .com sin usar substring
        index = email.reverse().indexOf("moc.");
        System.out.println("el dominio es .com: " + (index == 0));
    }
}

/*
charAt(), indexOf(), length(), and substring()
append()
insert()
delete() and deleteCharAt()
reverse()
toString()
*/
