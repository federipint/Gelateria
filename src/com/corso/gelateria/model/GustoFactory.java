package com.corso.gelateria.model;

import java.util.ArrayList;




public class GustoFactory {

	private static GustoFactory singleton;
	private ArrayList<Gusto> listaGusti;
	
	
	
	private GustoFactory() {
		listaGusti= new ArrayList<Gusto>();
		
	}
	public static GustoFactory getInstance() {
		if(singleton == null) {
			singleton = new GustoFactory();
		}
		
		return singleton;
	}
	
		
	public void addGusto(String nome, double prezzo, String ingredienti, double quantità) { 
		
		Gusto gusto = new Gusto(nome, prezzo, ingredienti, quantità);
		listaGusti.add(gusto);
	}

	
	
	
}
