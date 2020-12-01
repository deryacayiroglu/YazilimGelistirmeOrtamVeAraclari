package tr.edu.medipol.yazilimaraclari.deryacayiroglu;

public class Ucret {

	private int calisilanSaat;
	private int saatlikUcret;
	private int ucret;
	
	public Ucret(int calisilanSaat,int saatlikUcret) {
		this.calisilanSaat = calisilanSaat;
		this.saatlikUcret = saatlikUcret;
		this.ucret = calisilanSaat*saatlikUcret;
	}
	
	public String toString() {
		return ""+calisilanSaat+"*"+saatlikUcret+"="+ucret+"";
	}
	
}
