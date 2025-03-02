package narrativa;

import personagem.Amigo;

public class Bosque extends Narrativa{
	String t1,t2,t3,t4;
	public Bosque (Amigo a){
		switch (a.nomeGetter()) {
		case "Barbaro":
			t1 = "Continuando sua busca por alguém ou alguma forma de curar sua família, seguindo os rastros de monstros assolados por onde era passado, ele então poderia ter certeza de que se seguisse a trilha certamente conseguiria encontrar o culpado por todo esse caos.";
			t2 = "Durante o caminho, ele acaba encontrando um antigo parceiro de  aventureiras, o arqueiro Robin, que o recomenda não adentrar pela Floresta pois por conta da queimada acabou se tornando muito difícil a sua passagem por lá, mas o Guerreiro não dá ouvidos a ele e continua a sua jornada em direção à Floresta Devastada.\r\n"
					+ "Após isso, o arqueiro preocupado com seu amigo, resolve ao menos tentar dar a ele algumas poções de vida para ajudar a jornada dele para encontrar quem fez todo esse caos e esses atos de crueldade, pois por mais que tivesse medo de que seu amigo fizesse isso ele tinha seus motivos e eles eram muito importantes, Robin então acena ao guerreiro dando a ele boa sorte em sua jornada.";
			t3 = "O Guerreiro correndo pelo Bosque procurando por mais pistas de quem teria feito aquela destruição com a sua família, ele acaba esbarrando em um Gigantesco Golem de Pedra, pronto para atacá-lo, o lutador já se prepara para batalhar contra o grande oponente, por mais que ache bem estranho haver um golem por essa região algo que quase nunca acontece.";
			t4 = "Após o guerreiro derrotar o grande inimigo, ele prossegue seguindo as pistas de corpos de monstros degolados que levam à Floresta de Epona que agora estava completamente cheia de fumaça, próximo ao bosque. \r\n"
					+ "";
			break;
		case "Mago":
			t1 = "Após fugir com sucesso, o jovem Mago acaba se vendo perdido em meio a tanta mata, e certa neblina da umidade das plantas, ele então vai em direção à Igreja temendo que o pior pudesse acontecer caso alguém acabasse abrindo aquele livro maldito.";
			t2 = "Ele encontra o Guerreiro buscando ajuda para sua família que fora machucada por um Espadachim completamente fora de si e que as duas estariam gravemente feridas, e apenas as magias de cura poderiam ser a salvação da sua família, com o O Lutador em prantos e basicamente implorando pela ajuda o Mago resolve ajudar pegando um leve desvio do seu destino para poder ajudá-lo, em troca o Bárbaro o ajudaria com algumas poções que acabaram sobrando que eram dele.\r\n"
					+ "";
			t3 = "O Mago acaba acidentalmente pisando em pedra acionando um Gigantesco Golem de Pedra, pronto para atacá-lo o mago logo se prepara para enfrentar este formidável oponente.";
			t4 = "Após o Mago derrotar o grande inimigo, ele prossegue para o próximo local, o Vilarejo Destruído, próximo ao bosque, em busca de poder ajudar a família do Guerreiro \r\n"
					+ "";
			break;
		case "Espadachim":
			t1 = "Saindo da densa névoa da Floresta, logo se adentra ao Bosque, um local lindo e majestoso como se fosse algo criado pelos deuses, ele caminha pelo local até encontrar alguns monstros destruindo a paz por aquelas árvores, o herói braveja contra as criaturas enquanto avança em direção a elas.";
			t2 = "Após muito andar e derrotar os pestilentos, ele encontra uma cabana com alguns moradores, eles \"felizmente\" convidam ele a entrar e tomar uma xicara de chá, o nobre herói agradece pois já estava muito cansado, e se senta numa cadeira que rangia bastante, ele toma uma xicara de chá e come um pedaço de bolo oferecido pelos aldeões, ele agradece e sai de lá para continuar a sua busca, mas ele acaba tendo uma dor de cabeça e vê que as pessoas antes felizes, pareciam apavoradas ao vê-lo e também a Floresta antes Harmoniosa, se torna mais tenebrosa, com um clima meio sombrio aos poucos o Cavaleiro vai se recordando de algumas memórias de antes de pegar o livro, até que tudo volta ao normal e então ele segue adiante meio desconfiado mas de cabeça erguida sem ter medo do destino.";
			t3 = "Uma voz feminina berra em direção às árvores, \"VOCÊ É UM MONSTRO, SAIA DAQUI!\", o herói, confuso, olha em sua volta procurando de onde havia vindo aquela voz misteriosa até, encontrar vindo a ele, um ataque de vinhas, ele abaixa se esquivando, o Cavaleiro estranha o comportamento da Dríade mas logo se prepara para a luta visto que ela não deixará o deixa passar, então ele logo saca sua espada, pronto para a luta.";
			t4 = "A Dríade com o resto de forças que possui, fala ao Cavaleiro, \"Esta terra, não deveria ser manchada de sangue, você está matando inocentes, você é um monstro\", e então ela cai no chão. O herói estranha sua fala e logo fica com uma forte dor de cabeça, começando a ver sangue em suas mãos e um corpo onde antes estava a Dríade, lá agora deitava-se um corpo de uma jovem Bruxa, com lágrimas em seus olhos e uma expressão triste em seu rosto gelado.\r\n"
					+ "O Cavaleiro não entende o que aconteceu e a voz de sua cabeça apenas diz para ele não se preocupar pois no final das contas, ela provavelmente devia ser uma bruxa malvada, ele aceita a história mas cada vez mais se sente indagado, \"Por que tudo isso aconteceu?\" e \"Minha memória parece tão embaçada\", esses eram os principais pensamentos dele, porém ele sentia o dever de continuar em frente pois tudo teria uma resposta, assim como nos livros que ele lia na infância... \"Eu realmente lia esses livros?\" Indagado continuou sua jornada.";
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