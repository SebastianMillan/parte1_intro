package app;

import java.util.Arrays;
import java.util.Objects;

public class Personaje {

	private String nombre;
	private int puntosVida;
	private int puntosObt;
	private String [] mochila;
	private int puntosFuerza;
	
	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
		this.puntosVida = 100;
		this.puntosObt = 0;
		//this.mochila[] = {"Botiquin, Espada"};
	}
	
	public Personaje() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getPuntosObt() {
		return puntosObt;
	}

	public void setPuntosObt(int puntosObt) {
		this.puntosObt = puntosObt;
	}

	public String[] getMochila() {
		return mochila;
	}

	
	public int getPuntosFuerza() {
		return puntosFuerza;
	}

	public void setPuntosFuerza(int puntosFuerza) {
		this.puntosFuerza = puntosFuerza;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mochila);
		result = prime * result + Objects.hash(nombre, puntosFuerza, puntosObt, puntosVida);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Arrays.equals(mochila, other.mochila) && Objects.equals(nombre, other.nombre)
				&& puntosFuerza == other.puntosFuerza && puntosObt == other.puntosObt && puntosVida == other.puntosVida;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", puntosVida=" + puntosVida + ", puntosObt=" + puntosObt + ", mochila="
				+ Arrays.toString(mochila) + ", puntosFuerza=" + puntosFuerza + "]";
	}

	public int agregarAMochila(String herramienta) {
		if(mochila.length==10) {
			System.out.println("YA NO PUEDES CONSEGUIR MÁS ELEMENTOS PUES TU MOCHILA ESTÁ COMPLETA");
			return 0;
		}else{
			for(int i=0;i<mochila.length;i++) {
				if(mochila[i].isEmpty()) {
					mochila[i]=herramienta;
				}
			}
			return mochila.length;
		}
	}
	
	public int recibirGolpe(int daño) {
		if(puntosVida>=0) {
			puntosVida-=daño;
			return daño;
		}else {
			return 0;
		}
	}
	
	public int curar() {
		for(int i=0;i<mochila.length;i++) {
			if(mochila[i].compareToIgnoreCase("Botiquin")==0) {
				puntosVida+=10;
			}else {
				System.out.println("LO SIENTO, PERO NO TIENES NINGUNA POCIÓN DE BOTIQUÍN");
			}
		}
		return puntosVida;
	}
	
	
}
