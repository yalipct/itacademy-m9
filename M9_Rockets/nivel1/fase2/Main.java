package fase2;

public class Main {

	public static void main(String[] args) {
		
		Rocket rocket1 = new Rocket("32WESSDS");
		rocket1.addPropulsor(new Propulsor(10));
		rocket1.addPropulsor(new Propulsor(30));
		rocket1.addPropulsor(new Propulsor(80));
		
		Rocket rocket2 = new Rocket("LDSFJA32");
		rocket2.addPropulsor(new Propulsor(30));
		rocket2.addPropulsor(new Propulsor(40));
		rocket2.addPropulsor(new Propulsor(50));
		rocket2.addPropulsor(new Propulsor(50));
		rocket2.addPropulsor(new Propulsor(30));
		rocket2.addPropulsor(new Propulsor(10));
		
		System.out.println(rocket1);
		System.out.println(rocket2);
	}	

}
