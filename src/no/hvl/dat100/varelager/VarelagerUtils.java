package no.hvl.dat100.varelager;

import java.util.Arrays;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		Vare billigst = null;
		for (Vare vare : varer) {
			if (billigst == null) {
				billigst = vare;
			} else {
				if (vare.erBilligereEnn(billigst)) {
					billigst = vare;
				}
			}
		}
		return billigst;
	}
	
	public static double totalPris(Vare[] varer) {		
		double pris = 0;
		for (Vare vare : varer) {
			pris += vare.getPris();
		}
		return pris;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		int[] varenumre = new int[varer.length];
		for (int i = 0; i < varer.length; i++) {
			varenumre[i] = varer[i].getVarenr();
		}
		return varenumre;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		double[] prisDiff = new double[varer.length - 1];
		int i = 0;
		int j = 1;
		while (i < prisDiff.length) {
			prisDiff[i] = varer[j].getPris() - varer[i].getPris();
			i++;
			j++;
		}
		return prisDiff;
	}
}
