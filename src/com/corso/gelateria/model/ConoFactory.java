package com.corso.gelateria.model;

import java.util.ArrayList;
import java.util.List;

public class ConoFactory {
		
		private static ConoFactory singleton;
		private List<Cono> listaConi;
		
		private ConoFactory() {
			listaConi = new ArrayList<Cono>();
			
		}
		
		public static ConoFactory getInstance() {
			if(singleton == null) {
				singleton = new ConoFactory();
			}
			
			return singleton;
		}
		
		public void addCono(List<Gusto> palline) {
			Cono newCono= new Cono(palline);
			listaConi.add(newCono);
		}
}

