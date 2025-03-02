package narrativa;

import personagem.Amigo;

public class Floresta extends Narrativa{
	String t1,t2,t3,t4;
	public Floresta (Amigo a){
		switch (a.nomeGetter()) {
		case "Barbaro":
			t1 = "O Bárbaro continua sua procura implacável para tentar achar quem tinha feito aquela destruição, ele furiosamente corre pela região esfumaçada derrotanto todos os inimigos que ousassem ficar em sua frente.";
			t2 = " O guerreiro encontra pelos escombros, um Druida procurando o que pudesse salvar após todos os acontecimentos das queimadas e também do Soldado Possesso, o lutador ajudar ele procurando algumas plantas que fossem ser de ajuda, o Druida então o recompensa, ele o ajuda com o pouco que lhe restou de ervas medicinais, recuperando parcialmente a vida do lutador, e indo em direção à casa do guerreiro para que pudesse ajudar a sua família o quanto antes.";
			t3 = "O guerreiro encontra um foco de incêndio recente ele percebe que este foco aparenta estar muito mais forte que nas outras áreas, então ele decide investigar, ele encotnra um Ifrit, um gênio de fogo, incendiando toda a região da floresta, podendo escutar os choros de alguns animais e criaturas que ainda estavam no meio do local, o lutador resolve derrotá-lo, pois ele não quer que sofram as mesmas coisas que ele sofreu, perdendo sua casa e quase perdendo a sua família, por isso ele avança com um soco direto na cara da criatura vil e cruel.";
			t4 = "O Bárbaro consumido pela raiva e pelo ódio, encontra rastros de destruição parecidas com as que foram encontradas na vila, indo então em direção à Igreja que fora igualmente destruída. \r\n"
					+ "";
			break;
		case "Druida":
			t1 = "Finalmente chegando na Floresta de Epona, o Druida revê aquela destruição de sua terra natal, o mesmo lugar por onde ele sempre andou e brincou com seus amigos e feras, tudo isso agora estava debaixo de cinzas, isto aperta o coração do Druida fazendo o encher ainda mais de determinação para impedir que o Mago faça ainda mais coisas desse tipo.\r\n"
					+ "";
			t2 = "Um Bárbaro furioso o ajuda removendo escombros e lhe dá certas plantas que a ele não parecia útil, o Druida acaba curando ele e o guerreiro que implorara para que ele pudesse ajudar a sua família que também se mantinha extremamente ferida e dizia também que o tal Mago que era procurado por toda a destruição da Floresta teria passado pelo Vilarejo, dando ainda mais motivação para ele acabar indo para o local.";
			t3 = "O Druida encontra um foco de incêndio recente ele percebe que este foco aparenta estar muito mais forte que nas outras áreas, então ele decide investigar, pois ele teme que outras pessoas passem o mesmo que ele tenha passado anteriormente com o seu avô, observando melhor ele descobre que o que estava causando isso era um Ifrit, um gênio do fogo, ele incendeia aquelas matas, não se importando com qualquer tipo de vida que esteja no local. Isso preocupa ainda mais o Druida que resolve derrotar o Ifrit eliminando a ameaça de causar ainda mais dores para a mãe natureza.";
			t4 = "Com o Inimigo Poderoso derrotado, o Druida segue em direção ao vilarejo para impedir o mago de destruir a harmonia dos ciclos. \r\n"
					+ "";
			break;
		case "Espadachim":
			t1 = "Saindo pelo túnel, o Cavaleiro vai se adentrando numa Floresta completamente cheia de névoa, ele então vai se guiando pelas árvores e assim procurando uma saída em direção ao Mausoléu.";
			t2 = "O Cavaleiro encontra alguns Elfos caídos, que foram derrubados por alguns troncos, o nobre herói decide ajudá-los pois o código de honra dele jamais deixaria alguém passando necessidades sozinho. Então, ele levanta os troncos ajudando uma pobre família de elfos que vivia pela floresta, eles agradecem, \"tremendo de alegria\" eles dão algumas poções de cura para o grandioso herói que aparentava estar levemente debilitado, ele as bebe, recuperando parcialmente sua vida, felizmente, ele volta para a rota que seguia, feliz por ter ajudado alguém o herói segue a rota marcada.";
			t3 = "Um enorme incêndio aparece em meio à floresta, a cabeça do nobre começa a latejar e ele então encontra um enorme inimigo, flamejante, com um corpo extremamente forte, voador e com um grande par de chifres sobrevoando a sua cabeça, um Ifrit. O Herói, em choque, logo tenta atacar o inimigo, mas seu ataque não surte efeito, uma voz em sua cabeça profere palavras das quais o herói de nada entende, e então a sua espada começa a brilhar magicamente, dando a capacidade de atacar o inimigo a sua frente, a batalha finalmente se inicia.";
			t4 = "Com certa dificuldade, o herói vence a batalha contra o inimigo, podendo então prosseguir para adiante com o destino para o Mausoléu.";
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