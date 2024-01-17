package aula16;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
        
        boolean inform = false;
        do {
		
		System.out.println("Insira o seu nome de usuario: ");
		String nomeUsuario = scan.next();
		
		System.out.println("Insira sua senha: ");
		String senhaUsuario = scan.next();
		
		if (nomeUsuario.equalsIgnoreCase(senhaUsuario)) {
			System.out.println("A senha nao pode ser igual ao nome de usuario! insira novamente. ");
			
		 } else {
			 inform = true;
			 System.out.println("A Senha e o Usuario sao permitidos!");
		 }
        } while (!inform);
	}
	

}
