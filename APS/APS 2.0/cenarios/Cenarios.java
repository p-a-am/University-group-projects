package cenarios;

import java.util.*;

import Principal.MainCombate;
import armas.Armas_mae;

import armas.Chance_drop;

import armas.Espada;
import narrativa.Narrativa;
import narrativa.Personagens_narr;
import personagem.*;

public class Cenarios {
	Personagens_narr pn1 = new Personagens_narr();
	Scanner scan = new Scanner(System.in);
	
	//Vilarejo Destruido
	public void Village( Narrativa narrativa, Amigo a1) {
		//fase 01
		//Narração Introdutória da Fase
		System.out.println("Vilarejo Destruido: "
				+ "A paisagem é deprimente, os únicos que continuam vivos, clamam e berram por ajuda e pela piedade pelos seus Deuses, sabendo que aquele pode ser o seu último dia de vida. O cheiro ardente das casas e da vegetação, queima e dificulta a respiração ao meio das casas, a visão é parcialmente barrada em meio à toda fumaça que paira pelo ar, a única coisa que pode-se sentir com total clareza é a sensação de pavor pelo amanhã.");
		Kobold k1 = new Kobold();
		//nível 1
		narrativa.narrativa01();
		MainCombate subfase1 = new MainCombate();
		subfase1.combate(k1, a1);
		
		Bandido b1 = new Bandido();
		//nível 2
		MainCombate subfase2 = new MainCombate();
		subfase2.combate(b1, a1);
		
		//pausa para recuperar vida
		narrativa.narrativa02();
		a1.vidaSetter(30);
		
		Oni o1= new Oni();
		//nível 3
		MainCombate subfase3 = new MainCombate();
		subfase3.combate(o1, a1);
		
		Lodo l1 = new Lodo();
		//Boss
		narrativa.narrativa03();
		MainCombate subfase4 = new MainCombate();
		subfase4.combate(l1, a1);
		narrativa.narrativa04();
		}
	
	//Floresta de Epona/Floresta Nebulosa
	public void Forest( Narrativa narrativa, Amigo a1) {
		//fase 01
		//Narração Introdutória da Fase
		if (a1.nome == "Espadachim") {
			System.out.println("A Floresta Nebulosa: Silenciosa, envolta de neblina, extremamente difícil de se observar qualquer coisa que esteja a mais de 5 palmos de você então deve haver todo cuidado possível, com árvores extremamente finas e um cheiro peculiar, o Cavaleiro caminha por aquelas terras ainda úmidas por conta das árvores em sua volta, a região parece extremamente quente por algum motivo estranho, por mais que ajam diversas árvores todas elas estão com pouca ou nenhuma árvore.\r\n"
					+ "Ao observar o local, a sua cabeça lateja fazendo você sentir um cheiro estranho, talvez seja melhor você sair o mais rápido daí, \"a névoa do local pode ser venenosa ou não, mas é melhor não se arriscar\", o Cavaleiro pensa consigo mesmo.");
		} else {
			System.out.println("A Floresta de Epona (Floresta Devastada): Antes vista como a floresta mais verdejantes e férteis do reino, sendo o principal lar para os Elfos, Druidas e Animais, agora só se restam fumaça, cinzas e muitos seres vivos mortos e outros em lar. O fogo já devastou o suficiente para matar mais da metade da fauna, restam poucas plantas, ervas e animais em meio a toda queimada, também se encontram elfos, druidas e alguns monstros em meio a escombros e cinzas de árvores. O cheiro que resta das cinzas é deprimente e asfixiante fazendo muitos animais que viviam pela região acabarem morrendo em meio a tanta fumaça, enquanto a visão é completamente barrada, só é possível ver o que está a 1 metro de distância dos olhos.\r\n"
					+ "Contudo, alguns elfos não temem o futuro da Floresta pois ela certamente se recuperará como uma fênix revive das cinzas, pois ao que dizem as lendas, nada está perdido quando se confia em Epona, a Deusa da Fertilidade da Terra. \r\n"
					+ "");
		}
		Javali j1 = new Javali();
		//nível 1
		narrativa.narrativa01();
		MainCombate subfase1 = new MainCombate();
		subfase1.combate(j1, a1);
		
		Fogo f1 = new Fogo();
		//nível 2
		MainCombate subfase2 = new MainCombate();
		subfase2.combate(f1, a1);
		
		//pausa para recuperar vida
		narrativa.narrativa02();
		a1.vidaSetter(30);
		
		Ursoruja u1 = new Ursoruja();
		//nível 3
		MainCombate subfase3 = new MainCombate();
		subfase3.combate(u1, a1);
		
		Ifrit i1 = new Ifrit();
		//Boss
		narrativa.narrativa03();
		MainCombate subfase4 = new MainCombate();
		subfase4.combate(i1, a1);
		narrativa.narrativa04();

		}
	
	//Bosque Lamurioso/Bosque Radiante
	public void RainForest( Narrativa narrativa, Amigo a1) {
		//fase 01
		//Narração Introdutória da Fase
		if (a1.nome == "Espadachim") {
			System.out.println("O Bosque Harmonioso: Um lindo e belo bosque radiantemente verde e ensolarado, visivelmente vívido com o canto dos pássaros sussurrando lindos cantos melódicos pelas árvores, enquanto peixes pulam pelo lago, ao seu ver parece ser uma perfeita harmonia entre os animais, pois todos parecem conseguir viver perfeitamente pelo local.\r\n"
					+ "Até as criaturas da floresta cuidam e tratam bem os animais, porém ao horizonte se encontram algumas feras que estão fora de si e querem arruinar com a alegria local, o Cavaleiro com sua espada se sente no dever de proteger a harmonia desse local para que ele continue da forma que está.");
		} else {
			System.out.println("O Bosque Lamurioso: Toda a fumaça dessas destruições acabou indo em direção ao Bosque que antes era verdejante e vívido, agora se assemelha mais a um cemitério, muitos animais que antes viviam pela Floresta acabaram se mudando para cá, fazendo alguns predadores se tornarem presas enquanto outros começaram a ser extintos. A visão é bem melhor que nas outras duas situações e o ar continua bem limpo com as plantas do local ainda conseguindo purificar muito bem todas as impurezas ao redor, enquanto se ouve os passarinhos melodicamente cantando junto com outras criaturas do Bosque. ");
		}
		Slime s1 = new Slime();
		//nível 1
		narrativa.narrativa01();
		MainCombate subfase1 = new MainCombate();
		subfase1.combate(s1, a1);
		
		Goblins g1 = new Goblins();
		//nível 2
		MainCombate subfase2 = new MainCombate();
		subfase2.combate(g1, a1);
		
		//pausa para recuperar vida
		narrativa.narrativa02();
		a1.vidaSetter(30);
		
		Harpia h1 = new Harpia();
		//nível 3
		MainCombate subfase3 = new MainCombate();
		subfase3.combate(h1, a1);
		
		Driade d1 = new Driade();
		Golem gm1 = new Golem();
		
		//Boss
		narrativa.narrativa03();
		if (a1.nomeGetter() == "Espadachim") {
		MainCombate subfase4 = new MainCombate();
		subfase4.combate(d1, a1);
			}
		else {
			MainCombate subfase5 = new MainCombate();
			subfase5.combate(gm1, a1);
			}
		narrativa.narrativa04();
		}
	
	//Igreja/Mausoléu
	public void Church( Narrativa narrativa, Amigo a1) {
		//fase 01
		//Narração Introdutória da Fase
		if (a1.nome == "Espadachim") {
			System.out.println("O Mausoléu: Com diversos, túmulos enfileirados um na frente do outro, a visão é assustadora, repleto de fantasmas e alguns acólitos enfeitiçados pelo impiedoso Devorador de Mentes, é bem escuro e apertado, a pouca luz que se tem são de velas que foram acesas por antigos visitantes e em sua maior parte já derreteram por completo, das janelas pouco se vê a menos que as janelas sejam quebradas, assim a poeira e a sujeira em excesso sairiam dela. O ar é horrível, cheio de poeira, ele aparenta estar muito velho, parece que poucas pessoas usam e mesmo assim o Devorador de Mentes quis vir para esse lugar que irônico. \r\n"
					+ "");
		} else {
			System.out.println("A Igreja: Com bancos quebrados, pequenos aprendizes de clérigos caídos no chão depois de tanto tentarem usar magia e alguns até mortos decepados por alguma espada, a visão é apavorante dando arrepio até no mais corajoso dos humanos, os poucos sobreviventes que restaram, se escondem com medo de terem o mesmo fim que seus colegas e amigos. Enquanto é fácil de se respirar pelo local, porém é difícil de se locomover perante tantos destroços sem esbarrar em algum corpo. Além do horrendo odor de sangue que empesteia o local, sem ter muita escolha o ar não circula tão bem pois o local é muito fechado, por isso o cheiro perdura por tanto tempo.");
		}
		Fantasma f1 = new Fantasma();
		//nível 1
		narrativa.narrativa01();
		MainCombate subfase1 = new MainCombate();
		subfase1.combate(f1, a1);
		
		Banshee b1 = new Banshee();
		//nível 2
		MainCombate subfase2 = new MainCombate();
		subfase2.combate(b1, a1);
		
		//pausa para recuperar vida
		narrativa.narrativa02();
		a1.vidaSetter(30);
		
		Draegloth d1 = new Draegloth();
		Acolito al1 = new Acolito();
		//nível 3
		if(a1.nomeGetter() == "Espadachim") {
			
		MainCombate subfase3 = new MainCombate();
		subfase3.combate(al1, a1);
		}
		else {
			MainCombate subfase3 = new MainCombate();
			subfase3.combate(d1, a1);
		}
		Primata p1 = new Primata();
		Empireo e1 = new Empireo();
		Necromante n1 = new Necromante();
		Posesso po1 = new Posesso();
		
		narrativa.narrativa03();
		switch(a1.nomeGetter()) {
		case "Mago":
			MainCombate subfase4 = new MainCombate();
			subfase4.combate(p1, a1);
			break;
		case "Espadachim":
			MainCombate subfase5 = new MainCombate();
			subfase5.combate(e1, a1);
			break;
		case "Druida":
			MainCombate subfase6 = new MainCombate();
			subfase6.combate(n1, a1);
			break;
		case "Lutador":
			MainCombate subfase7 = new MainCombate();
			subfase7.combate(po1, a1);
			break;
		}
		narrativa.narrativa04();
		boolean ok=false;
		while (!ok) {
			try {
				int resp = scan.nextInt();
				switch (resp) {
				case (1):
					narrativa.narrativa05();
					System.exit(0);
					break;
				case (2):
					narrativa.narrativa06();
					System.exit(0);
				}
			} catch (InputMismatchException e) {
				System.out.println("Insira um número de 1 a 2");
			}
		}
	}

	//Castelo
	public void Castle( Narrativa narrativa, Amigo a1) {
		//fase 01
		//Narração Introdutória da Fase
		System.out.println("O Castelo da Reino: Gigantesco e majestoso, com sua linda arquitetura feita pelos grandes inventores, o castelo cheira à riqueza e poder, com cada cômodo da casa tendo algum tipo de cortina ou senão um tapete, todos os cantos do lugar eram iluminados por algum tipo de fonte, seja a luz do luar ou seja a luz do sol ou as luzes das velas que aparentavam ser mais fortes do que o comum. Por onde passara, sentira o cheiro de tecido novo e limpo, diferente do odor que era expelido da região fora do castelo, havia iluminação por todo canto, não muito conforme se aproximava das áreas mais profundas e mais próximas das masmorras, as únicas coisas que podem ser escutadas pelo castelo são os ecos das cantigas cantadas pelos bardos contratados pelo rei para o entretê-lo. \r\n"
				+ "");
		Ratazana r1 = new Ratazana();
		//nível 1
		narrativa.narrativa01();
		MainCombate subfase1 = new MainCombate();
		subfase1.combate(r1, a1);
		
		Cavaleiro c1 = new Cavaleiro();
		Armadura ar1 = new Armadura();
		//nível 2
		switch (a1.nomeGetter()) {
		case "Espadachim":
			MainCombate subfase2 = new MainCombate();
			subfase2.combate(ar1, a1);
			break;
		default:
			MainCombate subfase2_1 = new MainCombate();
			subfase2_1.combate(c1, a1);
			break;
		}
		
		//pausa para recuperar vida
		narrativa.narrativa02();
		a1.vidaSetter(30);
		
		Cavalaria ca1 = new Cavalaria();
		//nível 3
		MainCombate subfase3 = new MainCombate();
		subfase3.combate(ca1, a1);
		
		Gargola g1 = new Gargola();
		GrandeCav gc1 = new GrandeCav();
		//nivel 4
		if(a1.nomeGetter() == "Espadachim") {
			
			MainCombate subfase4 = new MainCombate();
			subfase4.combate(g1, a1);
			}
			else {
				MainCombate subfase4 = new MainCombate();
				subfase4.combate(gc1, a1);
			}
		narrativa.narrativa04();
	}
}
