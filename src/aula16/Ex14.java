package aula16;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Insira um numero: ");
			int numeroUm = scan.nextInt();
			int par = 0;
			int impar = 0;
			
			if (numeroUm % 2 == 0) {
				par++;
				
				
			} else {
				impar++;
				
			}
			System.out.println("O numero inserido e par! " + "Total de numeros pares: " +par);
			System.out.println("O numero inserido e impar! " + "Total de numeros impares: " +impar);
		}
		
		

	}

}
