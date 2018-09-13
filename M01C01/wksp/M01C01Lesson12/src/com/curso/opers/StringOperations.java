package com.curso.opers;

public class StringOperations {
    public static void main(String[] args) {
        String email = "homero.simpson@springfield.com"; //args[0];
        //Validar si la cadena tiene es diferente de null y tiene alguna longitud
        
        
        //Calcular la longitud real de la cadena. 
        // java StringOperations "   jluis@hotmail.com    "
        String email02 = email.replace(" ", "");//email.trim();
        
        //Validar si el correo es de homero.simpson@springfield.com usando equals, compareTo 
        //                                   012345678901234567890123456789
        boolean isHomer = email02.compareTo("homero.simpson@springfield.com") == 0?true: false;
        
        //Imprimir informacion del correo:
        //Mostrar solo el nombre del usuario, imprimir solo el dominio del correo
        int posArroba = email02.indexOf("@");
        String user = email02.substring(0, posArroba);
        //String dominio = email02.substring(posArroba+1);
        String dominio = email02.substring(posArroba+1, email02.length());

        //Informar si el dominio es .com sin usar substring
        boolean terminaDotCom = email02.endsWith(".com");
    }
}
/*
length()
charAt()
indexOf()
substring()
toLowerCase() and toUpperCase()
equals() and equalsIgnoreCase()
startsWith() and endsWith()
contains()
replace()
trim()
compareTo()
*/