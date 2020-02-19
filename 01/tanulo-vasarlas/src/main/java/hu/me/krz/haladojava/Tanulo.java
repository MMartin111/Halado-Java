package hu.me.krz.haladojava;

public class Tanulo { 
	private String nev;
	private int penz;
	private int tanulok;
	
	public String getNev() {
		return nev;
	}

	public double penz() {
		return penz;
	}
	
	public void setPenz(int penz) {
		this.penz = penz;
	}
	
	private Tanulo(String nev, int penz) {
		this.nev = nev;
		this.penz = penz;
		this.tanulok++;
	}
	
	public int osszestanulo() {
		return tanulok;
	}
	
	public Tanulo(String nev) {
		super();
		this.nev = nev;
		this.penz = 10000;
	}
	
	@Override
	public String toString() {
		return "Tanuló: " + nev + " pénz:" + penz + " Ft;";
	}
	
	public boolean fogyasztas(int csokkent) {
		this.penz = this.penz - csokkent;
		if(this.penz == 0) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	

}
