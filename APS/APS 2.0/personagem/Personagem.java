package personagem;

import java.util.*;

public interface Personagem {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	public String nome ="";
	static byte sabedoria = 25;
	static int vida = 25;
	static byte atk = 25;
	static byte defesa = 25;
	
}
