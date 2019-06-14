package com.corso.gelateria.model;

import java.util.ArrayList;

public class Gusto {
	
	private String nome;
	private double prezzo;
	private ArrayList<String> ingredienti;
	private double quantita;
	
			
	public Gusto(String nome, double prezzo, ArrayList<String> ingredienti, double quantita) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		this.quantita = quantita;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public ArrayList<String> getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(ArrayList<String> ingredienti) {
		this.ingredienti = ingredienti;
	}
	public double getQuantita() {
		return quantita;
	}
	public void setQuantita(double quantita) {
		this.quantita = quantita;
	}
	
	@Override
	public String toString() {
		return this.getNome() + "  " +  this.getPrezzo() + "Euro‚  " +  this.getQuantita() + "g  Ingr: " +  this.getIngredienti();
	}

	

}
