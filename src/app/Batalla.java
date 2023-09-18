package app;

import java.util.Random;

public class Batalla {
	
	public static Personaje luchar(Personaje luchador1, Personaje luchador2) {
		Random rnd = new Random();
		int golpe;
		luchador1.agregarAMochila("Botiquin");
		luchador2.agregarAMochila("Botiquin");
		while(luchador1.getPuntosVida()>0 && luchador2.getPuntosVida()>0) {
			
			if(luchador1.getPuntosVida()<=30) {
				System.out.println("**Jugador 1 curado**");
				System.out.println("Vida actual : "+luchador1.curar());
			}
			if(luchador2.getPuntosVida()<=30) {
				System.out.println("**Jugador 2 curado**");
				System.out.println("Vida actual : "+luchador2.curar());
			}
			golpe = (rnd.nextInt(3-1+1)+1)*luchador1.getPuntosFuerza();
			System.out.println("Jugador 1 recibe daño: -"+luchador1.recibirGolpe(golpe));
			golpe = (rnd.nextInt(3-1+1)+1)*luchador2.getPuntosFuerza();
			System.out.println("Jugador 2 recibe daño: -"+luchador2.recibirGolpe(golpe));
			
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
