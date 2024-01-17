package aula16;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeroInserido;
		int mediaInserida;
		int somaInserida = 0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Insira um numero: ");
			numeroInserido = scan.nextInt();
			somaInserida += numeroInserido;
		}
		mediaInserida = somaInserida / 5;
		System.out.println("Soma: "+ somaInserida);
		System.out.println("Media: "+ mediaInserida);
		
		

	}

}
