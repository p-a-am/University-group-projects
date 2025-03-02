package cenarios;

import armas.Chance_drop;
import narrativa.*;
import personagem.Amigo;
import personagem.Escolha_personagem;
import personagem.Personagem;

public class Principal {

	public static void main(String[] args) {
		Narrativa n1,n2,n3,n4;
		Chance_drop c = new Chance_drop();
		Cenarios a = new Cenarios();
		Escolha_personagem es1 = new Escolha_personagem();
		Amigo a1 = es1.Escolha();
		
		switch (a1.nomeGetter()) {
			case "Barbaro":
				//Primeira Fase
				n1 = new Vilarejo(a1);
				a.Village(n1, a1);
				c.drop4();
				
				//Segunda Fase
				n2 = new Bosque(a1);
				a.RainForest(n2,a1);
				c.drop4();
				
				//Terceira Fase
				n3 = new Floresta(a1);
				a.Forest(n3, a1);
				c.drop4();
				
				//Quarta Fase
				n4 = new Igreja(a1);
				a.Church(n4, a1);
				break;
				
			case "Mago":
				//Primeira Fase
				n1 = new Castelo(a1);
				a.Castle(n1, a1);
				c.drop3();
				
				//Segunda Fase
				n2 = new Bosque(a1);
				a.RainForest(n2,a1);
				c.drop3();
				
				//Terceira Fase
				n3 = new Vilarejo(a1);
				a.Village(n3, a1);
				c.drop3();
				
				//Quarta Fase
				n4 = new Igreja(a1);
				a.Church(n4, a1);
				break;
				
			case "Druida":
				//Primeira Fase
				n1 = new Castelo(a1);
				a.Castle(n1, a1);
				c.drop2();
				
				//Segunda Fase
				n2 = new Floresta(a1);
				a.Forest(n2,a1);
				c.drop2();
				
				//Terceira Fase
				n3 = new Vilarejo(a1);
				a.Village(n3, a1);
				c.drop2();
				
				//Quarta Fase
				n4 = new Igreja(a1);
				a.Church(n4, a1);
				break;
				
			case "Espadachim":
				//Primeira Fase
				n1 = new Castelo(a1);
				a.Castle(n1, a1);
				c.drop1();
				
				//Segunda Fase
				n2 = new Floresta(a1);
				a.Forest(n2,a1);
				c.drop1();
				
				//Terceira Fase
				n3 = new Bosque(a1);
				a.RainForest(n3, a1);
				c.drop1();
				
				//Quarta Fase
				n4 = new Igreja(a1);
				a.Church(n4, a1);
				break;
				
		}
	}

}
