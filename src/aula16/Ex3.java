package aula16;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		boolean informacao = false;
		String nomeInserido, sexoInserido, solteiroOuCasado;
		int idadeInserido;
		double salarioInserido;
		
		
		do {
			System.out.println("Digite o seu nome: ");
			nomeInserido = scan.next();
			
			if (nomeInserido.length() >= 3) {
				informacao = true;
			} else {
				System.out.println("O nome inserido nao e valido! Necessita 3 caracteres. ");
			}
		
	} while (!informacao);
		
		informacao = false;
		
		do {
			System.out.println("Digite a sua idade: ");
			idadeInserido = scan.nextInt();
			
			if (idadeInserido >= 0 && idadeInserido <= 150) {
				informacao = true;
			} else {
				System.out.println("A idade inserida nao e valido! Necessita ser entre 0 ate 150. ");
			}
		
	} while (!informacao);
		
		informacao = false;
		do {
			System.out.println("Digite o seu salario: ");
			salarioInserido = scan.nextDouble();
			
			if (salarioInserido > 0) {
				informacao = true;
			} else {
				System.out.println("O salario nao e valido! Necessita ser maior que 0. ");
			}
		
	} while (!informacao);
		
		do {
			System.out.println("Digite o seu sexo: ");
			sexoInserido = scan.next();
			
			if (sexoInserido.equalsIgnoreCase("m") || sexoInserido.equalsIgnoreCase("m")) {
				informacao = true;
			} else {
				System.out.println("O sexo inserido nao e valido! precisa ser 'f' ou 'm'! ");
			}
		
	} while (!informacao);
		
		informacao = false;
		do {
			System.out.println("Digite como esta seu estado civil atualmente:  ");
			solteiroOuCasado = scan.next();
			
			if (solteiroOuCasado.equalsIgnoreCase("s") || solteiroOuCasado.equalsIgnoreCase("c") || solteiroOuCasado.equalsIgnoreCase("v") || solteiroOuCasado.equalsIgnoreCase("d")) {
				informacao = true;
			} else {
				System.out.println("O estado civil precisa ser 's', 'c', 'v' ou 'd' ");
			}
		
	} while (!informacao);
		
	}		
}
