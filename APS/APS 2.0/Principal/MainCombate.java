package Principal;

import java.util.Scanner;

import personagem.Amigo;
import personagem.Inimigo;

public class MainCombate{
	
	
	public Amigo combate(Inimigo inimigo, Amigo amigo) {
		Scanner scan = new Scanner(System.in);
		int venceuOUnao = 0;
	
	int atqEdefesa = 3;
	do {
		System.out.println("\nVocê quer..."+"\n1-) Atacar o inimigo"+"\n2-) Se Defender de " + inimigo.retornaNome());

		
			atqEdefesa = scan.nextInt();
			scan.nextLine();
			switch (atqEdefesa) {
			case 1:
			
				amigo.atacar(atqEdefesa, inimigo);
				boolean booleano = inimigo.ataqueOUdefesa(amigo);
				if(booleano == true){
					venceuOUnao = 1;
				}
				else {
					venceuOUnao = 0;
				}
				break;
			case 2:
			
				amigo.defender(atqEdefesa, inimigo);
				booleano = inimigo.ataqueOUdefesa(amigo);
				if(booleano == true) {
					venceuOUnao = 1;
				}
				else {
					venceuOUnao = 0;
				}
				break;
				
			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}
		}while (venceuOUnao == 0);
	return amigo;
	}
}



