package fase2;

public class Propulsor {

	private int potenciaMax;

	public Propulsor(int potencia) {
		this.potenciaMax = potencia;
	}

	public int getPotencia() {
		return potenciaMax;
	}

	public void setPotencia(int potencia) {
		this.potenciaMax = potencia;
	}

	@Override
	public String toString() {
		return "" + potenciaMax ;
	}
	
	
	
}
