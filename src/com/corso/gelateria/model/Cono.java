package com.corso.gelateria.model;

import java.util.List;

public class Cono {
	private double prezzo;
	private List<String> gusti;
	public Cono(double prezzo, List<String> gusti) {
		this.prezzo=prezzo;
		this.gusti=gusti;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public List<String> getGusti() {
		return gusti;
	}
	public void setGusti(List<String> gusti) {
		this.gusti = gusti;
	}

	
}
