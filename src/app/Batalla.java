package app;

import java.util.Random;

public class Batalla {
	
	public static Personaje luchar(Personaje luchador1, Personaje luchador2) {
		Random rnd = new Random();
		int golpe = rnd.nextInt(3-1+1)+1;
		while(luchador1.getPuntosVida()>0 && luchador2.getPuntosVida()>0) {
			if(luchador1.getPuntosVida()<=30) {
				System.out.println("Jugador 1 curado: "+luchador1.curar());
			}
			if(luchador2.getPuntosVida()<=30) {
				System.out.println("Jugador 2 curado: "+luchador2.curar());
			}
			System.out.println("Jugador 1 recibe daño: "+luchador1.recibirGolpe(golpe));
			System.out.println("Jugador 2 recibe daño: "+luchador2.recibirGolpe(golpe));
		}
		if(luchador1.getPuntosVida()<=0) {
			return luchador2;
		}else if(luchador2.getPuntosVida()<=0) {
			return luchador1;
		}else {
			return null;
		}
		
	}
}
