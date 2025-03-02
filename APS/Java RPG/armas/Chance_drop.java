package armas;

import java.util.*;

public class Chance_drop {
	public Armas_mae drop1() {
		Random rand = new Random();
		int randomico = rand.nextInt(1, 5);
		
		switch(randomico) {
		case 1:
			Espada e1 = new Espada();
			System.out.println("Espada comum");
			return e1;
			
		case 2:
			Espada e2 = new Espada();
			e2.levels(3, 10, 0);
			System.out.println("Espada rara");
			return e2;
				
		case 3:
			Espada e3 = new Espada();
			e3.levels(4, 15, 1);
			System.out.println("Espada épica");
			return e3;
		
		case 4:
			Espada e4 = new Espada();
			e4.levels(7, 17, 0);
			System.out.println("Parabéns! Espada lendária...");
			return e4;
		
		default:
			return null;
		}
	}
		public Armas_mae drop2() {
			Random rand = new Random();
			int randomico = rand.nextInt(1, 5);
			
			switch(randomico) {
			case 1:
				Adaga a1 = new Adaga();
				System.out.println("Adaga comum");
				return a1;
				
			case 2:
				Adaga a2 = new Adaga();
				a2.levels(3, 10, 0);
				System.out.println("Adaga rara");
				return a2;
					
			case 3:
				Adaga a3 = new Adaga();
				a3.levels(4, 15, 1);
				System.out.println("Adaga épica");
				return a3;
			
			case 4:
				Adaga a4 = new Adaga();
				a4.levels(7, 17, 0);
				System.out.println("Parabéns! Adaga lendária...");
				return a4;
			
			default:
				return null;
			}
		}
		
			public Armas_mae drop3() {
				Random rand = new Random();
				int randomico = rand.nextInt(1, 5);
				
				switch(randomico) {
				case 1:
					Lanca l1 = new Lanca();
					System.out.println("Cajado comum");
					return l1;
					
				case 2:
					Lanca l2 = new Lanca();
					l2.levels(3, 10, 0);
					System.out.println("Cajado rara");
					return l2;
						
				case 3:
					Lanca l3 = new Lanca();
					l3.levels(4, 15, 1);
					System.out.println("Cajado épica");
					return l3;
				
				case 4:
					Lanca l4 = new Lanca();
					l4.levels(7, 17, 0);
					System.out.println("Parabéns! Cajado lendária...");
					return l4;
				
				default:
					return null;
				}
	}
			public Armas_mae drop4() {
				Random rand = new Random();
				int randomico = rand.nextInt(1, 5);
				
				switch(randomico) {
				case 1:
					Adaga a1 = new Adaga();
					System.out.println("Luvas comum");
					return a1;
					
				case 2:
					Adaga a2 = new Adaga();
					a2.levels(3, 10, 0);
					System.out.println("Luvas rara");
					return a2;
						
				case 3:
					Adaga a3 = new Adaga();
					a3.levels(4, 15, 1);
					System.out.println("Luvas épica");
					return a3;
				
				case 4:
					Adaga a4 = new Adaga();
					a4.levels(7, 17, 0);
					System.out.println("Parabéns! Luvas lendária...");
					return a4;
				
				default:
					return null;
				}
			}

}
