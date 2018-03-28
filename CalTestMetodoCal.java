package Lista_3;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalTestMetodoCal {

	@Test
	public void testAnoBissextoDoisMil() {
		Cal cal = new Cal();
		
		String s = "       1  2  3  4  5"
				+ "\n 6  7  8  9 10 11 12"
				+ "\n13 14 15 16 17 18 19"
				+ "\n20 21 22 23 24 25 26"
				+ "\n27 28 29 ";
		
		assertEquals(s, cal.cal(2, 29));
	}
	
	@Test
	public void testSetembroGregoriano() {
		Cal cal = new Cal();
		
		String s = "       1  2 14 15 16"
				+ "\n17 18 19 20 21 22 23"
				+ "\n24 25 26 27 28 29 30";
		
		assertEquals(s, cal.cal(2, 19));
	}
	
	@Test
	public void testMesComTrintaDias() {
		Cal cal = new Cal();
		
		String s = "       1  2  3  4  5"
				+ "\n 6  7  8  9 10 11 12"
				+ "\n13 14 15 16 17 18 19"
				+ "\n20 21 22 23 24 25 26"
				+ "\n27 28 29 30 ";
		
		assertEquals(s, cal.cal(2, 30));
	}
	
	@Test
	public void testMesComTrintaEUmDias() {
		Cal cal = new Cal();
		
		String s = "       1  2  3  4  5"
				+ "\n 6  7  8  9 10 11 12"
				+ "\n13 14 15 16 17 18 19"
				+ "\n20 21 22 23 24 25 26"
				+ "\n27 28 29 30 31 ";
		
		assertEquals(s, cal.cal(2, 31));
	}
	
	/**
	 * OBSERVAÇÂO: Aqui os erros se dão pelo simples fato dos métodos
	 * do programa não fazerem tratamento da entradas, apenas o método
	 * main faz essa verificação o qual não é invocado nestes testes
	 */
	
	@Test
	public void testMesNumeroDiaDaSemanaInvalido() {
		Cal cal = new Cal();
		
		assertNull(cal.cal(-1, 1));
		
	}
	
	@Test
	public void testMesNumeroDeDiasInvalido1() {
		Cal cal = new Cal();
		
		assertNull(cal.cal(0, 32));
		
	}
	
	@Test
	public void testMesNumeroDeDiasInvalido2() {
		Cal cal = new Cal();
		
		assertNull(cal.cal(0, -1));
		
	}

}
