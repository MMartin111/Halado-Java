package hu.me.krz.haladojava;

import java.util.List;
import java.util.Random;

public class Astronomer {
	
	private String name;
	
	private List<Planet> DiscoveredPlanets;
	
	public Astronomer(String name, List<Planet> DiscoveredPlanets) {
		super();
		this.name = name;
		this.DiscoveredPlanets = DiscoveredPlanets;
	}
	
	public List<Planet> getDiscoveredPlanets() {
		return DiscoveredPlanets;
	}
	
	public void observeTheSky() {
		Random rand = new Random();
		
		
	}
}
