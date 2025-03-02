package personagem;

import java.util.*;

public class Escolha_personagem {
	public Amigo Escolha() {
		int variavel = 0;
		do {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual classe voce quer escolher?");
		System.out.println("1-) Mago");
		
		System.out.println("2-) Druida");
		
		System.out.println("3-) Lutador");
		
		System.out.println("4-) Espadachim");
		
		
		int escolhido = scan.nextInt();
		
		switch(escolhido) {
		case 1:
			Mago m1 = new Mago();
			return m1;
		case 2:
			Druida d1 = new Druida();
			return d1;
		case 3:
			Lutador l1 = new Lutador();
			return l1;
		case 4:
			Espadachim e1 = new Espadachim();
			return e1;
		default:
			System.out.println("escolha uma opcao valida!");
			variavel = 1;
			return null;
			
			}
		}while(variavel == 1);
	}

}
