package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Vasarlas {

	public static void main(String[] args) {
		ArrayList<Tanulo> tanulo = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Tanulo diak = new Tanulo("Martin"+i);
			tanulo.add(diak);

		}
		System.out.println(tanulo);
		int min = 1500;
		int max = 3000;
		int csokkent = 0;
		
		for (int i = 0; i < 6; i++) {
			csokkent = ThreadLocalRandom.current().nextInt(min , max + 1);
			tanulo.get(i).fogyasztas(csokkent);
			System.out.println(tanulo.get(i).penz());
			
			if (tanulo.get(i).fogyasztas(csokkent)) {
				tanulo.remove(i);
			}
		

	}
	}
}
	


