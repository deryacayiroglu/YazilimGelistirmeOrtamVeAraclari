package tr.edu.medipol.yazilimaraclari.deryacayiroglu;

import org.junit.Test;
import junit.framework.Assert;

public class MuhasebeProgramiTest {

	@Test
	public void testUcretHesapla() {
		
		int calisilanSaat = 5;
		int saatlikUcret = 40;
		
		String ucretHesaplaSonuc = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		
		Assert.assertEquals("5*40=200", ucretHesaplaSonuc);
		
	}
	
}
