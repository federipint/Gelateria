package com.corso.gelateria;

import java.util.Scanner;
import com.corso.gelateria.model.*;

public class Main {

	public static void main(String[] args) {
		
		String scelta;
		
		do {
			// TODO Auto-generated method stub
			System.out.println("Benvenuto nella interfaccia della gelateria, cosa vuoi fare?");
			System.out.println("1. Aggiungi Gusto");
			System.out.println("2. Acquista Cono");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("0. Esci");
			
			Scanner myScanner = new Scanner(System.in);
			
			scelta = myScanner.nextLine();
			
			switch(scelta) {
			case "1":
				controllerAddGusto(myScanner);
				break;
			case "2":
				//controllerBuyCono(myScanner);
				break;
			case "3":
				//controllerAddUtente(myScanner);
				break;
			case "4":
				//controllerAddNoleggio(myScanner);
				break;
			case "0":
				System.out.println("Buona giornata!");
				break;
			default:
				System.out.println("Non è una scelta valida!!");
			}
		} while(!scelta.equals("0"));
		
	}
	
	public static void controllerAddGusto(Scanner scanner) {
		
		String nome;
		String ingredienti;
		double prezzo;
		double quantita;
		
		System.out.println("----------------- Add Gusto --------------------");
		System.out.println("Inserisci i dati:");
		
		System.out.println("Nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Ingredienti: ");
		ingredienti = scanner.nextLine();
		
		System.out.println("Prezzo: ");
		prezzo = scanner.nextLine();
		
		System.out.println("Quantità: ");
		ingredienti = scanner.nextLine();
		
		System.out.println("-------------------------------------");
		
		GustoFactory factory = GustoFactory.getInstance();
		
		factory.add(nome, prezzo, ingredienti, quantita);

	}

	

}
