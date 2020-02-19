package hu.me.krz.haladojava;

public class Diak extends Szemely implements Comparable<Diak> {
	
	private int puska;
	
	public Diak(String nev,int kor,int puska) {
		super(nev,kor);
		this.puska = puska;
	}
	
	public int getPuska() {
		return puska;
	}
	
	@Override
	public String toString() {
		return "Diak [getNev=" +getNev() +", puska=" + puska + ", getKor()=" + getKor() + "]";
	}

	@Override
	public int compareTo(Diak that) {
		if (this.puska < that.puska) {
			return this.getKor();
		}
		else {
			return that.getKor();
		}
	}
	
	

}
