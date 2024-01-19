package aula16;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
			
		
		Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Insira um numero inteiro para calcular o fatorial (limite: 0 a 15) ");
            int numeroInserido = scan.nextInt();

            if (numeroInserido == -1) {
                System.out.println("Encerrando o programa.");
                break;
            }

            if (numeroInserido < 0 || numeroInserido > 15) {
                System.out.println("Por favor, digite um número entre 0 e 15.");
                continue;
            }

            int calculoFatorial = 1;

            for (int i = numeroInserido; i > 0; i--) {
                calculoFatorial *= i;
            }

            System.out.println("O fatorial de " + numeroInserido + " é: " + calculoFatorial);
        }
	} 

}
