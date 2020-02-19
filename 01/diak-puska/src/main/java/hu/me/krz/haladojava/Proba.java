package hu.me.krz.haladojava;

import java.util.concurrent.ThreadLocalRandom;

public class Proba {

	public static void main(String[] args) {
		
		if (args.length !=1) {
			System.exit(0);
		}
		
	Diak[] diak = new Diak[args.length];
	
	int minKor = 18;
	int maxKor = 25;
	int randomSzKor;
	int minPuska = 0;
	int maxPuska = 5;
	int randomSzPuska;
	
	for (int i = 0; i < args.length; i++) {
		randomSzKor = ThreadLocalRandom.current().nextInt(minKor,maxKor +1);
		randomSzPuska = ThreadLocalRandom.current().nextInt(minPuska,maxPuska +1);
		diak[i] = new Diak("diák"+i,randomSzKor,randomSzPuska);
		System.out.println(diak[i]);
	}
		

	}

}
