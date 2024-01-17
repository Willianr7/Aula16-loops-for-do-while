package aula16;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int numeroInserido;
		int maiorNumero = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++);{
			System.out.println("Insira um numero: ");
			numeroInserido = scan.nextInt();
			
			if(numeroInserido > maiorNumero) {
				maiorNumero = numeroInserido;
			}
		}
		System.out.println(" O maior numero digitado foi: " +maiorNumero);
	}

}
