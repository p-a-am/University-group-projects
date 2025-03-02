package narrativa;

import personagem.Amigo;

public class Castelo extends Narrativa{
	String t1,t2,t3,t4;
	public Castelo (Amigo a){
		switch (a.nomeGetter()) {
		case "Mago":
			t1 = "Em busca de conversar com o Rei e se desculpar com ele por todo o ocorrido, o Mago busca conversar pacificamente com o Rei, discutindo sobre o que deveria ser feito com Vossa Majestade, é decidida que haverá a execução do criminoso por incendiar as matas e ele deveria ficar lá por 5 aparições do Sol (5 dias).\r\n"
					+ "Então chegando à masmorra abaixo do Castelo, o jovem aprendiz acaba se deparando com um Aventureiro Insano, também preso, companheiro de sua cela, sempre cochichando bem baixo, falando sozinho dizendo que deveria salvar a cidade, o ingênuo Mago tenta ajudá-lo a sair dessa confusão mental mas isso leva apenas a fazer ele se soltar da prisão utilizando um graveto e seus punhos. Livrando o Mago das grades da masmorra, mesmo se ele não quisesse os guardas já estavam indo em direção aos dois que fugiam e corriam livremente querendo fugir de lá. Inevitavelmente o Mago acaba se perdendo do Espadachim que estava euforicamente correndo, sem se importar com o que estivesse acontecendo, diferente do jovem aprendiz que não resiste correr por periodos prolongados, fazendo-os pegarem rotas alternativas do castelo.";
			t2 = "Na metade da Fase, é encontrado uma área de descanso ao lado de uma biblioteca e nessa área acaba encontrando-se comidas e poções de vida fresquinhas para o Mago poder se restaurar, e na biblioteca ele acaba encontrando informações sobre um tal livro misterioso e super poderoso que seria capaz de fazer coisas surreais, como reviver os mortos e controlá-los da forma como quisesse, sendo esse, o grande Necronomicon. Ele acaba se lembrando que esse livro provavelmente estaria na Igreja, porém o Padre não fazia a menor ideia do motivo de terem enviado aquele livro na biblioteca da Igreja, então para evitar um mal maior o jovem aprendiz buscou voltar para lá temendo que o pior acontecesse \r\n"
					+ "";
			t3 = "O Mago se depara com um cavaleiro alto, largo e forte com uma armadura grossa, ele segura a espada e aponta em sua direção, murmurando palavras das quais ele não conseguia entender, mas no final uma coisa ele compreendia com total clareza, apenas um sairia vivo de lá, ou ele ou o Grande Cavaleiro.";
			t4 = "Após o Mago derrotar o grande inimigo, ele prossegue para um túnel com uma luz ao fim dele, a luz do sol, ele estará livre passando por lá.";
			break;
		case "Druida":
			t1 = "O Druida em busca de mais informações do criminoso que fosse o culpado da queimada, tenta entrar no castelo, mas logo é impedido por guardas que apontando suas armas contra ele, sem entender o que diziam, o Druida os ataca tentando se aprofundar pelo castelo em busca de informações de quem seria o tal mago.";
			t2 = "Conforme ele se adentra mais ele ouve barulhos de passos e metais batendo um contra outro abaixo dele, visto que o Druida queria apenas mais informações ele segue por outra direção tentando evitar combates desnecessários, até ele acabar encontrando uma sala cheia de poções de cura e bandagens para feridas, o jovem logo se cura utilizando os itens da sala e recupera parcialmente sua vida seguindo em diante para a busca de mais informações.";
			t3 = "O Druida encontra um cavaleiro alto, largo e forte com uma armadura grossa, ele segura a espada e aponta ao Druida, dizendo que ele apenas seguiria se  passasse por cima do cavaleiro, porém utilizando uma língua conhecida pelo jovem, fazendo o entender o que fora dito. Para se defender o Druida já se prepara para batalhar contra o Grande Cavaleiro.";
			t4 = "Após derrotado, o cavaleiro derruba seu capacete, revelando ser um Ogro, o Druida logo pergunta se ele teria alguma informação sobre algum mago que causou uma queimada pela região da Floresta, o derrubado inimigo diz que este mago havia escapado recentemente da prisão e estaria fugindo neste exato momento da masmorra. O Druida agradece o Ogro e rapidamente corre em direção à floresta para encontrar o Mago que provavelmente acabaria passando por lá. \r\n"
					+ "";
			break;
		case "Espadachim":
			t1 = "O Cavaleiro se liberta após receber uma espada de um poderoso Mago que estava ao seu lado da prisão, ele usa essa espada para cortar as grades da masmorra e se libertar das garras do reino invasor, derrotando todos os inimigos que ele encontra pela frente, indo em direção por onde ele sente ser o local certo e seguindo o que essa voz estranha acaba dizendo para ele seguir.\r\n"
					+ "A Voz diz que ele deve seguir até chegar ao Mausoléu, lá ele encontraria o grande artefato que faria ele ser completamente poderoso, com muita força e coragem o herói segue tentando sair do castelo do invasor do reino.";
			t2 = "O Cavaleiro encontra um quarto com muitos suprimentos, incluindo poções de vida, o herói que estava machucado rapidamente corre para pegar uma das poções para se recuperar e ter uma parte da sua força recuperada a mais. Ele regenera parcialmente sua vida e continua a sua jornada, um herói nunca pode ficar parado, pois os inimigos estão sempre à espreita tentando fazer maldades, o nosso herói é o único capaz de impedir que isso ocorra, então ele segue adiante.";
			t3 = "O Herói se depara com uma Gárgula Gigante, murmurando palavras das quais ele não conseguia entender, mas no final uma coisa ele compreendia com total clareza, apenas um sairia vivo de lá, ou ele ou o a Gárgula Gigante e certamente não será o nosso herói.";
			t4 = "Após o Herói derrotar o grande inimigo, ele prossegue para um túnel com uma luz ao fim dele, a luz do sol, ele estará livre passando por lá. \r\n"
					+ "";
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
