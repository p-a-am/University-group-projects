package personagem;

public abstract class Inimigo implements Personagem {
	protected byte atq = Inimigo.atk;
	protected int inimigoVida = Inimigo.vida;
	protected byte inimigoDefesa = Inimigo.defesa;

	protected byte tmp = 0;
	protected int danoAoAmigo;
	protected String nomes;
	
	//default
	protected Inimigo() {
		this.atq = 0;
		this.inimigoDefesa = 0;
		this.inimigoVida = 0;
		this.nomes = "";
	
	}
	//construtor
	protected Inimigo(byte atk, byte dfs, int vida, String nome) {
		this.atq = atk;
		this.inimigoDefesa = dfs;
		this.inimigoVida = vida;
		this.nomes = nome;
	}
	

	//ataque ou defesa
	public boolean ataqueOUdefesa(Amigo amigo) {
		
		//turno
		this.turnoInimigo(amigo);
		System.out.println("Entrou no ataque ou defesa");
		
		if(this.tmp == 1 || this.tmp == 0) {
		int random = rand.nextInt(1,3);
		System.out.println("Turno do inimigo...");
		
		switch (random) {
		//ataque
		case 1:
			System.out.println("...O inimigo atacou! "+"\nE deu..."+ this.atq+" de dano");
			
			switch(amigo.defendeuOuAtacou) {
			case 0:
				break;
			case 1:
				//o amigo atacou
				amigo.vidas -= this.atq;
				break;
			case 2:
				//o amigo defendeu
				break;
			}
			return false;
			
		//defesa
		case 2:
			System.out.println("o inimigo defendeu... ");
			
			if(this.inimigoDefesa >= amigo.atq) {
				System.out.println("... Com sucesso! ");
				
				if(amigo.temp > 0) {
				int total = this.inimigoDefesa - amigo.atq;
				this.inimigoVida += total;
				}
				else {
				}
				
				System.out.println(this.inimigoVida);
			}
			else {
				System.out.println("...Sem sucesso. ");
				
				this.inimigoVida -= amigo.temp;
			}
			return false;
			
		default:
			return false;
		}
			
		}
		
		else if (this.tmp == 2){
			System.out.println("Você venceu à "+ this.nomes);
			return true;
		}
		else {
			System.out.println("entrou aqui!");
			return false;
		}
	}
	
	
	//danoContinúo
	public int danoContinuo(int dano) {
		
		if(this.tmp < 1) {
			return dano - dano;
		}
		else {
			return dano;
		}
	}
	
	//turnos
	public void turnoInimigo(Amigo amigo) {
		switch(amigo.turnoAmigo(this)) {
		case 0:
			System.out.println("Temp é 1");
			this.tmp = 1;
			break;
		case 1:
			System.out.println("Temp é 0");
			this.tmp = 0;
			break;
		case 2:
			System.out.println("Temp é 2");
			this.tmp = 2;
			break;
		case 3:
			System.out.println("Você perdeu! ");
			System.exit(0);
			break;
		default:
			System.out.println("O temp é 1.0");
			this.tmp = 1;
		}
	}
	 //métodos para tirar vida do amigo
	
	  public void tiraAmigoVida(Amigo amigo){
	    if (amigo.defesas >= this.atq) {

	      amigo.defesas -= this.atq;
	      System.out.println(amigo.defesas);
	    } else {
	      int total = amigo.defesas - this.atq;
	      amigo.vidas += total;
	      System.out.println(amigo.vidas);
	    }
	  }
	  
	  public void tiraVidaAmigo(Amigo amigo) {
		    amigo.vidas -= this.atq;
		  }
	  

	//gettersEsetters
	public String retornaNome() {
		return this.nomes;
	}
	
	public byte retornaAtk() {
		return this.atq;
	}
	
	public byte retornaDefesa() {
		return this.inimigoDefesa;
	}
	
	public int retornaVida() {
		return this.inimigoVida;
	}
	
	public void retornaTudo() {
		System.out.println(this.atq);
		System.out.println(this.inimigoDefesa);
		System.out.println(this.inimigoVida);
		
	}
	public void resetTemp(byte temp) {
		this.tmp = temp;
	}
}
