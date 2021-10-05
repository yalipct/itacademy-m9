package fase3;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		Rocket rocket1 = new Rocket("32WESSDS");
		rocket1.addPropulsors(new Propulsor(rocket1.getId(), 10));
		rocket1.addPropulsors(new Propulsor(rocket1.getId(), 30));
		rocket1.addPropulsors(new Propulsor(rocket1.getId(), 80));

		Rocket rocket2 = new Rocket("LDSFJA32");
		rocket2.addPropulsors(new Propulsor(rocket2.getId(), 30));
		rocket2.addPropulsors(new Propulsor(rocket2.getId(), 40));
		rocket2.addPropulsors(new Propulsor(rocket2.getId(), 50));
		rocket2.addPropulsors(new Propulsor(rocket2.getId(), 50));
		rocket2.addPropulsors(new Propulsor(rocket2.getId(), 30));
		rocket2.addPropulsors(new Propulsor(rocket2.getId(), 10));
						
		rocket1.iniciaRocket();
		rocket2.iniciaRocket();		
		
		System.out.println("Introduce potencia objetivo: ");

		while (true) {
			int nuevo = sc.nextInt();
			rocket1.setObjetivo(nuevo);
			rocket2.setObjetivo(nuevo);
		}

	}

}
