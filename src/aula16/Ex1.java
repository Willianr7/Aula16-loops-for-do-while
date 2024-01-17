package aula16;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira uma nota: ");
		double notaInserida = scan.nextDouble();
		
		do {
			System.out.println("O valor inserido e invalido! Por favor, insira um valor valido!");
		} while (notaInserida < 0 && notaInserida > 10);
		
	  /*  Scanner scan = new Scanner (System.in);
		
		int nota = 0;
		
		System.out.println("Insira uma nota: ");
		nota = scan.nextInt();
	      
		while (nota <= 10 && nota >=  0) {
			System.out.println("Insira uma nota: ");
			nota = scan.nextInt();
		}
		System.out.println("Nota inserida invalida. ");
		scan.close(); */
	}

}
