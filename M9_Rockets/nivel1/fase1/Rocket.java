package fase1;


public class Rocket{

	private String id;
	private int propulsors;
	
	public Rocket(String id, int propulsors) {
		
		this.id = id;
		this.propulsors = propulsors;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPropulsors() {
		return propulsors;
	}

	public void setPropulsors(int propulsors) {
		this.propulsors = propulsors;
	}

	@Override
	public String toString() {
		return "Rocket id=" + id + ": Te " + propulsors + " propulsors";
	}

	
}
