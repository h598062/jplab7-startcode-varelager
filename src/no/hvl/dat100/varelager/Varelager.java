package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		this.varer = new Vare[n];
		this.antall = 0;
	}

	public Vare[] getVarer() {
		return this.varer;
	}
	
	public boolean leggTilVare(Vare v) {
		if (this.antall < this.varer.length) {
			this.varer[this.antall] = v;
			this.antall++;
			return true;
		}
		return false;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		Vare nyVare = new Vare(varenr, navn, pris);
		return leggTilVare(nyVare);
	}
	
	public Vare finnVare(int varenr) {
		for (Vare vare : this.varer) {
			if (vare.getVarenr() == varenr) {
				return vare;
			}
		}
		return null;
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
		System.out.println(SEP);
		for (Vare vare : this.varer) {
			System.out.println(vare.toString());
		}
		System.out.println(SEP);
	}
}
