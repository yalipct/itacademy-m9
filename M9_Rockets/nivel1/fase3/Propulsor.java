package fase3;

public class Propulsor extends Thread{
	
	private String rocketId;
	private int potenciaMax;
	private int potenciaActual;
	private int potenciaObjetivo;

	public Propulsor(String rocketId, int potenciaMax) {
		
		this.rocketId = rocketId;
		this.potenciaMax = potenciaMax;
		this.potenciaActual = 0;
	}
	
	public String getRocketId() {
		return rocketId;
	}

	public void setRocketId(String rocketId) {
		this.rocketId = rocketId;
	}

	public int getPotenciaMax() {
		return potenciaMax;
	}
	
	
	public int getPotenciaActual() {
		return potenciaActual;
	}

	public void setPotenciaActual(int potenciaActual) {
		this.potenciaActual = potenciaActual;	
	}
	

	public int getPotenciaObjetivo() {
		return potenciaObjetivo;
	}

	public void setPotenciaObjetivo(int potenciaObjetivo) {
		this.potenciaObjetivo = potenciaObjetivo;
	}
	
	public int speedUpRocket() {
		if(potenciaActual < this.getPotenciaMax()) {
			potenciaActual++;
		}
		return potenciaActual;
	}
	
	public int stopRocket() {
		if(potenciaActual > this.getPotenciaObjetivo()) {
			potenciaActual--;
		}
		return potenciaActual;
	}
	
	
	public void run() {
		
		while (true) {			
			try {
				Thread.sleep(1000 + (int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				System.out.println("HA OCURRIDO UNA EXCEPCIÓN");
			}
			if (potenciaActual < potenciaObjetivo) {
				speedUpRocket();
				System.out.println(getRocketId() + "-" + getId() + " Potencia: " + potenciaActual
						+ " Objetivo:" + potenciaObjetivo + " de " + potenciaMax);
			} else {
				stopRocket();
				System.out.println(getRocketId() + "-" + getId() + " Potencia:"
						+ potenciaActual + " Objetivo:" + potenciaObjetivo + " de " + potenciaMax);
			}
		}		
	}
	
}
