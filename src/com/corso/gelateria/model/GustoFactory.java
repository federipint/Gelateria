package com.corso.gelateria.model;

import java.util.ArrayList;
import java.util.Arrays;

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
	
		
	public void addGusto(String nome, double prezzo, String ingredienti, double quantita) { 

		
		// creo ArrayList dando al costruttore una lista creata tramite metodo statico asList della
		// classe Arrays. Divido la stringa ingredienti con il metodo split dando come parametro
		// i caratteri con cui separare la stringa.
		
		Gusto gusto = new Gusto(nome, prezzo, new ArrayList<String>(Arrays.asList(ingredienti.split(", "))), quantita);
		listaGusti.add(gusto);
	}

	// Metodo di prova
	public Gusto getGusto(int i) {
		return listaGusti.get(i);
	}
	
	
	
}
