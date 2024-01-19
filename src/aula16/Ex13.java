package aula16;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira a base e o expoente:  ");
		int numeroBase = scan.nextInt();
		int numeroExpoente = scan.nextInt();
		
		if (numeroExpoente < 0) {
			System.out.println("O expoente nao pode ser negativo ");
		}
		
		int resultado = numeroBase;
		for (int i=1; i<numeroExpoente; i++) {
			resultado *= numeroBase;
		}
		
		System.out.println("Resultado: " + resultado);
		

	}

}
