package com.corso.gelateria.model;

import java.util.List;

public class Cono {

	private List<Gusto> palline;
	
	public Cono(List<Gusto> palline) {
		this.palline=palline;
	}
	
	public double getPrezzo() {
		double prezzo = 0;
		for(Gusto pallina : this.palline) {
			prezzo += pallina.getPrezzo();
		}
		return prezzo;
	}
	
	public List<Gusto> getPalline() {
		return palline;
	}
	
	public void setPalline(List<Gusto> palline) {
		this.palline = palline;
	}

	
}
