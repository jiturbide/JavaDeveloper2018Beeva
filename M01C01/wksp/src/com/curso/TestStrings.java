package com.curso;

public class TestStrings {

   public static void main(String ... a) {
      String s = "Hola";
      String s2 = new String("Hola");
      String s3 = new String("Hola");
      String s4 = "Hola";

      System.out.println("s == s2: " + (s==s2));
      System.out.println("s == s4: " + (s==s4));
      System.out.println("s2 == s3: " + (s2==s3));
      System.out.println("s3 equals s4: " + (s3.equals(s4)));

      String s5 = "Ho" + "la";
      System.out.println("s5 == s: " + (s5==s));

      String s6 = s5 + "";
      System.out.println("s5 == s6: " + (s5==s6));
   }


}
