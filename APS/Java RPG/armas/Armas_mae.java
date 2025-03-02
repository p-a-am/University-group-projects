package armas;

import java.util.Random;

import personagem.Amigo;

public abstract class Armas_mae {
	protected int dano;
	protected int dano_cont;
	protected int vida;


	public void setArma(int dano,int vida,int dano_cont) {
		
		this.dano=dano;
		this.vida=vida;
		this.dano_cont=dano_cont;
		
	}

	public void levels(int dano,int vida,int dano_cont) {
		
		this.dano += dano;
		this.vida += vida;
		this.dano_cont += dano_cont;
	}
	
	public void armaAdd(Amigo amigo) {
		amigo.vidaSetter(this.vida);
		amigo.danoSetter(this.dano);
		  
	  }
	
}

