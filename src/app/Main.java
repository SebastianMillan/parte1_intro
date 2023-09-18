package app;

public class Main {

	public static void main(String[] args) {

		Personaje ganador = Batalla.luchar(new Personaje("Sebastián"), new Personaje("Fernando"));
		System.out.println("GANADOR: "+ganador);
	}

}
