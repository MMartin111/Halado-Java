package hu.me.krz.haladojava;

public final class Planet {
	private int position,radius;
	private String[] name;
	
	public Planet(int position, int radius, String[] name) {
		super();
		this.position = position;
		this.radius = radius;
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public int getRadius() {
		return radius;
	}

	public String[] getName() {
		return name;
	}

}
