package Lista_3;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalTestMetodoJan1 {

	@Test
	public void testAnoBissextoRegraQuatrocentos() {
		Cal cal = new Cal();
		
		assertEquals(6, cal.jan1(2000));
	}
	
	@Test
	public void testAnoBissexto() {
		Cal cal = new Cal();
		
		assertEquals(1, cal.jan1(1996));
	}
	
	@Test
	public void testAnoGregoriano() {
		Cal cal = new Cal();
		
		assertEquals(3, cal.jan1(1752));
	}
	
	@Test
	public void testAnoNaoBissexto() {
		Cal cal = new Cal();
		
		assertEquals(5, cal.jan1(1999));
	}
	
	@Test
	public void testAnoNaoBissextoMasDivisivelPorQuatro() {
		Cal cal = new Cal();
		
		assertEquals(3, cal.jan1(100));
	}

}
