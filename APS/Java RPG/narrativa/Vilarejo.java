package narrativa;

import personagem.Amigo;

public class Vilarejo extends Narrativa{
	String t1,t2,t3,t4;
	public Vilarejo (Amigo a){
		switch (a.nomeGetter()) {
		case "Barbaro":
			t1 = "O Guerreiro busca por alguma forma de curar a sua família que acabou sendo gravemente ferida, seja procurando alguém que possa usar magias para curar ou com algumas ervas medicinais, enquanto procura, ele limpa toda a região infestada de monstros que viram a queda da segurança do vilarejo como uma possibilidade de ataque suscetível.";
			t2 = "O guerreiro se depara com um jovem mago que acaba passando perto do vilarejo, então ele implora a ele que cure ou ao menos tente tratar a sua família, porém o mago responde que talvez não tenha mana o suficiente para tratar as feridas profundas o bastante mas ele tenta o seu melhor, conseguindo estancar as feridas que antes sangravam descontroladamente, o mago aproveita e cura parcialmente o guerreiro que também estava ferido por combater os inimigos que encontrava pelo caminho.\r\n"
					+ "O lutador então continua procurando mais alguém que pudesse ajudá-lo a curar a sua família e também encontrar quem fosse o culpado pelo incidente.\r\n"
					+ "";
			t3 = "Uma gigantesca pilha de Lodo vai se formando com todo o sangue e fogo misturados por conta do acidente, o Lodo ÍgniSanguineo aparece, tendo aproximadamente 5 metros de altura, ele é enorme parece ser um slime porém muito mais perigoso. O Guerreiro sendo impedido de passar por conta da criatura e para proteger a sua família resolve derrotar este monstro.";
			t4 = "Após a pilha de lodo se desmanchar, o lutador procura mais ajuda de alguém que estivesse na região e também busca por mais pistas de quem deveria ser o culpado, encontrando assim alguns vestígios vindo do Bosque Lamurioso, fazendo esta ser a sua próxima destinação. \r\n"
					+ "";
			break;
		case "Mago":
			t1 = "Chegando na região, o Mago vai tentando limpar o caminho infestado de monstros que acabaram querendo se aproveitar do claro estado vulnerável do vilarejo.\r\n"
					+ "";
			t2 = "O Mago acaba encontrando a casa do Bárbaro em meio a tanta casa destroçada pelo fogo, pôde-se ouvir múrmuros leves em direção à casa, ao abrir a porta, o jovem feiticeiro encontra a esposa do Bárbaro segurando fortemente a ferida da criança supostamente filha do guerreiro, então, o Mago às pressas prepara uma magia de cura o mais forte possível para poder estancar a ferida na barriga da pobre garota. Com sucesso, ele rapidamente já cura a mulher com o resto de mana que ele possui, antes de desmaiar com a cabeça na grama queimada pelo fogo, esgotado e cansado, o jovem cai de bruços. A esposa do Bárbaro que antes estava machucada tenta ajudar o salvador dela tentando curá-lo utilizando ataduras e algumas poções que eles possuíam em sua casa. Restaurado e parcialmente aliviado por ter conseguido salvar pessoas que foram machucadas por culpa dele, O Mago agradece, pede desculpas por todo o ocorrido e corre em direção à Igreja, para finalmente conseguir completar seu objetivo.";
			t3 = "Uma gigantesca pilha de Lodo vai se formando com todo o sangue e fogo misturados por conta do acidente, o Lodo ÍgniSanguineo aparece, tendo aproximadamente 5 metros de altura, ele é enorme parece ser um slime porém muito mais perigoso. O mago acaba não tendo outra escolha senão acabar com esse inimigo vil, para passar para a próxima região.";
			t4 = "Em meio a todas aquela bagunça o jovem corre em direção à igreja temendo que o livro possa acabar caindo em mãos erradas e acabe com o mundo. Durante a corrida, o mago continua sentindo uma sensação estranha como se alguém estivesse o observando correr pelo campo, mas ele tenta ignorar pois ele deveria focar em seu objetivo principal. ";
			break;
		case "Druida":
			t1 = "Ao se aproximar do Vilarejo, logo ele encontra uma quantidade imensurável de bandidos cruéis e criaturas se aproveitando do estado frágil do local para atacar e saquear itens que possam ser vendidos. O Druida vendo essa imoralidade se sente no dever de proteger essas pessoas para que não sintam mais dor do que já estão sentindo ao ter suas casas destruídas e incendiadas.";
			t2 = "O Druida acaba encontrando a casa do Bárbaro em meio a tanta casa destroçada pelo fogo, pôde-se ouvir múrmuros leves em direção à casa, ao abrir a porta, o jovem encontra a esposa do Bárbaro segurando fortemente a ferida da criança supostamente filha do guerreiro, então, ele logo junta algumas ervas medicinais que sobraram e expõe sob a ferida da pobre garota, ela se contorce de dor, as feridas de queimadura nela foram extremamente graves, em seus braços, o Druida encontra um vaso de girassol abraçados pela garota.\r\n"
					+ "Ela agarra aquele vaso com toda sua força enquanto começa a retornar a consciência pelo efeito das ervas medicinais, ela ainda continua com uma respiração extremamente lenta e uma febre altíssima, o jovem alerta as duas para que tentem pedir ajuda aos elfos do bosque pois eles o conhecem e poderiam ajudá-las com mais precisão, ainda muito eufórica com toda a situação a mãe da criança a leva para o bosque, agradecendo pela ajuda do Druida, ela oferece a ele algumas poções de cura que sobraram em sua casa. Ele com um sorriso no rosto agradece e continua a sua jornada recuperando parcialmente sua vida. \r\n"
					+ "";
			t3 = "Uma gigantesca pilha de Lodo vai se formando com todo o sangue e fogo misturados por conta do acidente, o Lodo ÍgniSanguineo aparece, tendo aproximadamente 5 metros de altura, ele é enorme parece ser um slime porém muito mais perigoso. O Druida acaba não tendo outra escolha senão acabar com esse inimigo vil.";
			t4 = "O Druida anda por toda a vila e não acaba encontrando o mago apenas alguns vestígios de magia espalhados por alguns monstros caídos que traçam um caminho até uma antiga Igreja onde se era ensinado magia e religião para pequenos órfãos fazendo-os ter novos propósitos de vida. Ele então segue e o caminho mortal feito pelo mago pela rota, até que ele escuta um barulho muito alto na região afrente, dando certeza de que algo lá não estava certo";
			break;
		}
	}
	public void narrativa01() {
		System.out.println(t1);
	}
	public void narrativa02() {
		System.out.println(t2);
	}
	public void narrativa03() {
		System.out.println(t3);
	}
	public void narrativa04() {
		System.out.println(t4);
	}
}

