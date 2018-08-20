package com.curso;

import java.util.Random;
//import HolaMundo;

public class Foliador {

	/*
	   Genera un numero numero de folio con el formato
	   AAAAMMDD000
	*/
     public long getFolio() {
		return new Random().nextInt(1000);
	 }

    static public void main(String ... a) {
	    Foliador f = new Foliador();
		//HolaMundo h = null;

		System.out.println("Folio: " + f.getFolio() );
	}
}
