package Glorantha;

public abstract class Personaje {

	protected CaracterísticasBasicas caracteristiacasBasicas;
	protected int estamina;
	protected int inteligencia;
	protected int vida;
	protected int reintentos;
	
	public abstract boolean esHabilidoso();
	public abstract boolean esSiniestro();
	public abstract boolean esAgil();
	public abstract void entrenar();
	public abstract void revivir();
	public abstract  void practicarAtaque();
	
	public int getEstamina() {
		return estamina;
	}
	public abstract void setEstamina(int estamina);
	
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getReintentos() {
		return reintentos;
	}
	public void setReintentos(int reintentos) {
		this.reintentos = reintentos;
	}
	
	
}
