package aula16;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     
		
		 System.out.print("Insira a quantidade do conjunto de numeros: ");
	        int numeroInserido = scan.nextInt();

	        
	        System.out.println("Insira os numeros para ser calculado o menor, maior e a soma de todos os valores: ");

	        int numeroMenor = 0;
	        int numeroMaior = 0;
	        int somaTotal = 0;

	        for (int i=0; i < numeroInserido; i++) {
	            int numero = scan.nextInt();

	            
	            if (numeroMaior < numeroMenor) {
	                numeroMenor = numero;
	            }
	            if (numero > numeroMaior) {
	                numeroMaior = numero;
	            }

	            somaTotal += numero;
	        }

	        
	        System.out.println("Menor valor: " + numeroMenor);
	        System.out.println("Maior valor: " + numeroMaior);
	        System.out.println("Soma dos valores: " + somaTotal);

	}

}
