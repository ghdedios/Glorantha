package Glorantha;

public abstract class Personaje {

	private CaracterísticasBasicas caracteristiacasBasicas;
	private int estamina;
	private int inteligencia;
	private int vida;
	private int reintentos;
	
	public abstract boolean esHabilidoso();
	public abstract boolean esSiniestro();
	public abstract boolean esAgil();
	public abstract void entrenar();
	public abstract void revivir();
	public abstract  void practicarAtaque();
	
	
}
