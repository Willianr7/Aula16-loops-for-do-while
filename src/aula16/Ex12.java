package aula16;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o numero da taboada correspondente: ");
		int numeroDaTaboada = scan.nextInt();
		
		for (int i = 1; i<=10; i++) {
			System.out.println(numeroDaTaboada + " X " + i + " = " +(numeroDaTaboada*i));
			
		}
		
		

	}

}
