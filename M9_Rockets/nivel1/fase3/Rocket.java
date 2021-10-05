package fase3;

import java.util.*;

public class Rocket{

	private String id;
	private ArrayList<Propulsor> propulsors;
	
	public Rocket(String id) {
		
		this.id = id;
		this.propulsors = new ArrayList<Propulsor>();
		
	}
	/*
	public void speedUpRocket() {
		for(Propulsor p: propulsors) {	
			p.speedUpRocket();
		}
	}
	
	public void stopRocket(){
		for(Propulsor p: propulsors) {
			p.stopRocket();
		}
	}*/
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public void addPropulsors(Propulsor p) {
		if(p!=null)
		this.propulsors.add(p);
	}
	
	public void iniciaRocket() {
		if(this.propulsors != null) {
			for(Propulsor p: this.propulsors) {				
				p.start();
			}
		}
	}

	public void setObjetivo(int nuevo) {
		for(Propulsor p: propulsors) {
			p.setPotenciaObjetivo(nuevo);
		}
		
	}
	public ArrayList<Propulsor> getAllPropulsors() {
		return propulsors;		
	}
	
	
}
