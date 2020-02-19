package hu.me.krz.haladojava;

import java.util.List;
import java.util.Random;

public class Astronomer {
	
	private String name;
	
	private List<Planet> DiscoveredPlanets;
	
	public Astronomer(String name) {
		this.name = name;
	}
	
	public List<Planet> getDiscoveredPlanets() {
		return DiscoveredPlanets;
	}
}
