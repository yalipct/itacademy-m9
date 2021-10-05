package fase2;

import java.util.*;

public class Rocket{

	private String id;
	private ArrayList<Propulsor> propulsors;
	
	public Rocket(String id) {
		
		this.id = id;
		this.propulsors = new ArrayList<Propulsor>();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTotalPropulsor() {
		int total = 0;
		
		if(this.propulsors != null)
			total = this.propulsors.size();	
		
		return total;
	}

	public void addPropulsor(Propulsor p) {
		if(p!=null)
		this.propulsors.add(p);
	}

	@Override
	public String toString() {
		//eliminar las comas Potencia Máxima propulsors[10, 30, 80]
		String cadena = propulsors.toString().replaceAll(",","");
		
		return "Rocket id=" + id + "\nPotencia Máxima propulsors" + cadena;
	}

	//cadena=cadena.replaceAll(",","")

	
}
