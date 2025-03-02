package personagem;

public abstract class Amigo implements Personagem {
  protected byte vidas = Amigo.vida;
  protected byte atq = Amigo.atk;
  protected byte defesas = Amigo.defesa;
  protected int inimigoVida = Inimigo.vida;
  protected int sabedorias = Amigo.sabedoria;
  protected static byte defendeuOuAtacou = 0;
  protected String nomes;
  protected int temp = 0;
  protected int status;
  protected Amigo amigo;
  public void habilidade(Inimigo um_inimigo) {
	  
  }

  //construtor default
  Amigo() {
    this(Amigo.atk, Amigo.defesa, Amigo.nome, Amigo.vida, Amigo.sabedoria);
  }
  //construtor
  Amigo(byte atk, byte dfs, String nome, int vida, byte sabedoria) {
    this.atq = atk;
    this.defesas = dfs;
    this.nomes = nome;
    this.vidas =(byte) vida;
    this.sabedorias = sabedoria;
  }

  //atacar
  public void atacar(int n, Inimigo inimigo) {
    //é o nosso turno?
    int turno = this.turnoAmigo(inimigo);
    
    if (turno == 0) {
    	inimigo.resetTemp((byte)0);

      this.defendeuOuAtacou = 1;
      if (n == 1) {

        System.out.println("Você atacou!");

        int random = rand.nextInt(1, 9);
        //ataque acumulado
        int ataque = 0;

        //rolagem de dados
        switch (random) {
        /*12.5% de chance de receber um dano crítico
         */
        case 1:
          System.out.println("Dano crítico! ");
          random = rand.nextInt(1, 9);
          /*50% de chance de receber um crítico que 
           * adiciona mais 30% de dano ao ataque
           * atual
           */
          if (random <= 4) {
            ataque = (int)(this.atq + (30 / 100) * this.atq);
          }
          /*25% de chance de receber um crítico que 
           * adiciona mais 40% de dano ao ataque
           * atual
           */
          else if (random > 4 || random <= 6) {
            ataque = (int)(this.atq + (40 / 100) * this.atq);
          }
          /*8% de chance de receber um crítico que 
           * adiciona mais 50% de dano ao ataque
           * atual
           */
          else if (random == 7) {
            ataque = (int)(this.atq + (50 / 100) * this.atq);
          }
          
          else {
            random = rand.nextInt(1, 4);
            if (random < 3) {
              ataque = (int)(this.atq + (50 / 100) * this.atq);
            }
            /*4% de chance de receber um crítico que 
             * adiciona mais 2 vezes de dano ao ataque
             * atual
             */
            else {
              System.out.println("Super crítico!");
              ataque = (2 * this.atq);
            }
          }
          break;
        case 2:
          ataque = (int)(this.atq + (20 / 100) * this.atq);
          break;
        case 3:
          ataque = (int)(this.atq + (10 / 100) * this.atq);
          break;
        case 4:
          break;
        case 5:
          if (this.atq >= 10) {
            ataque = this.atq - (int)((10 / 100) * this.atq);
          } else {
            ataque = 0;
          }
          break;
        case 6:
          if (this.atq >= 20) {
            ataque = this.atq - (int)(20 / 100 * this.atq);
          } else {
            ataque = 0;
          }
          break;
        case 7:
          if (this.atq >= 30) {
            ataque = this.atq - (int)(30 / 100 * this.atq);
          } else {
            ataque = 0;
          }
          break;
        case 8:

          this.vidas = (byte)(this.vidas - 10 / 100 * this.vidas);
          System.out.println("Você perdeu 10% de vida!" + "\nVida total: " + this.vidas);
          ataque = 0;
          break;
        }
        this.temp = ataque;
        inimigo.inimigoVida -= (ataque + this.sabedorias);
        System.out.println("O dano dado foi..." + "\n" + (ataque + this.sabedorias));
      } else {

      }
    } else if (turno == 1) {
      inimigo.resetTemp((byte)1);
    }
  }

  //defender
  public void defender(int n, Inimigo inimigo) {
    //é o nosso turno?
    int turno = this.turnoAmigo(inimigo);

    switch (turno) {
    case 0:

      this.defendeuOuAtacou = 2;
      //é a opção escolhida pelo player?
      if (n == 2) {
        System.out.println("Você tentou se defender...");
        int random = rand.nextInt(1, 3);

        //rolagem de dados
        switch (random) {
        case 1:
          System.out.println("...Você conseguiu!");
          inimigo.tiraAmigoVida(this);
          break;
        case 2:
          System.out.println("...Você fracassou. ");
          inimigo.tiraVidaAmigo(this);

          System.out.println(inimigo.inimigoVida + ";" + this.vidas + ";" + this.atq);
          break;
        }

      } else {

      }
      break;
    case 3:
    	System.out.println("Você perdeu! ");
		System.exit(0);
    }
  }
  //dano continuo no inimigo
  public int danoContinuo(int dano, Inimigo inimigo) {
	    int turno = this.turnoAmigo(inimigo);

		if(turno == 0) {
			return dano - dano;
		}
		else {
			System.out.println("Voce deu "+dano+" de dano ao inimigo!");
			return dano;
		}
	}
  
  
  //turnos 
  public int turnoAmigo(Inimigo inimigo) {
    //o personagem tem vida?
    if (this.vidas > 0) {
    	System.out.println("Temos vidas");
      //o inimigo tem vida?
      if (inimigo.inimigoVida >= 0) {
    	  System.out.println("O inimigo tem vidas");
        //turno do amigo ou do inimigo?
        if (this.temp == 0) {
        	System.out.println("É o nosso turno");
          //amigo
          return 0;
        } else {
        	System.out.println("é o turno do inimigo");
          //inimigo
          return 1;
        }
      }
      //inimigo não tem vida
      else {
    	  System.out.println("O inimigo não tem vidas");
        return 2;
      }
    }
    //amigo não tem vida
    else {
      return 3;
    }
  }

public String nomeGetter() {
	return this.nomes;
	}

public void vidaSetter(int i) {
	this.vidas += i;
	
}

public void danoSetter(int dano) {
	this.atq += dano;
	
}
}