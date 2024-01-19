package aula16;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um numero inteiro para calcular o fatorial: ");
		int numeroInserido = scan.nextInt();
		int calculoFatorial = 1;
		
		for (int i = numeroInserido; i > 0 ; i--) {
			calculoFatorial *= i;
			System.out.println(i);
	}
		System.out.println("o Resultado e de: " + calculoFatorial);
	}
}
