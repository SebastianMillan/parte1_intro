package app;

public class Main {

	public static void main(String[] args) {

		Personaje ganador = Batalla.luchar(new Personaje("Sebastián", 2), new Personaje("Fernando", 2));
		System.out.println("GANADOR: "+ganador.getNombre());
	}

}
