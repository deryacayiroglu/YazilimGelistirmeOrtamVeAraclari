package tr.edu.medipol.yazilimaraclari.deryacayiroglu;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ucretHesapla(5,30));
	}
	
	public static String ucretHesapla(int calisilanSaat, int saatlikUcret) {
		return new Ucret(calisilanSaat,saatlikUcret).toString();
	}
	
}
