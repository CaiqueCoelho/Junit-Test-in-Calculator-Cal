package Lista_3;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalTestBissexto {

	@Test
	public void testBissexto() {
		Cal cal = new Cal();

		//Caso de Teste 44
		// N: 1
		assertTrue(cal.isLeap(4));
		assertEquals("29", String.valueOf(cal.numberOfDays(2, 4)));
		
		//Caso de Teste 46
		// N: 2
		assertFalse(cal.isLeap(3));
		assertEquals("28", String.valueOf(cal.numberOfDays(2, 3)));
		
		//Caso de Teste 48
		// N: 3
		assertFalse(cal.isLeap(5));
		assertEquals("28", String.valueOf(cal.numberOfDays(2, 5)));
		
		//Caso de Teste 49
		// N: 4
		assertTrue(cal.isLeap(2000));
		assertEquals("29", String.valueOf(cal.numberOfDays(2, 2000)));
		
		//Caso de Teste 50
		// N: 5
		assertTrue(cal.isLeap(9996));
		assertEquals("29", String.valueOf(cal.numberOfDays(2, 9996)));
		
		//Caso de Teste 52
		// N: 6
		assertFalse(cal.isLeap(9995));
		
		//Caso de Teste 53
		// N: 7
		assertFalse(cal.isLeap(9997));
		
		//Caso de Teste 43
		// N: 8
		assertEquals("31", String.valueOf(cal.numberOfDays(1, 4)));
		assertEquals("2", String.valueOf(cal.firstOfMonth(1, 4)));
		
		//Caso de Teste 45
		// N: 9
		assertEquals("31", String.valueOf(cal.numberOfDays(3, 4)));
		assertEquals("6", String.valueOf(cal.firstOfMonth(3, 4)));
		
		//Caso de Teste 47
		// N: 10
		assertEquals("31", String.valueOf(cal.numberOfDays(3, 3)));
		assertEquals("4", String.valueOf(cal.firstOfMonth(3, 3)));
		
		//Caso de Teste 51
		// N: 11
		assertEquals("31", String.valueOf(cal.numberOfDays(3, 9996)));
		assertEquals("5", String.valueOf(cal.firstOfMonth(3, 9996)));
	}
	
	@Test
	/**
	 * OBS: Importante observar que se fosse usado o comando cal
	 * do Linux como Oráculo o resultado retornado seria true,
	 * o que é incorreto, uma vez que 1000 quando divido por 100
	 * temos resto igual a zero, portanto não é bissexto
	 */
	public void testBissextoExtraNumberOfDays1() {
		Cal cal = new Cal();
		
		//Caso de Teste Extra 1
		assertEquals("28", String.valueOf(cal.numberOfDays(2, 100)));
		
	}
	
	@Test
	/**
	 * OBS: Importante observar que se fosse usado o comando cal
	 * do Linux como Oráculo o resultado retornado seria true,
	 * o que é incorreto, uma vez que 100 quando divido por 100
	 * temos resto igual a zero, portanto não é bissexto
	 */
	public void testBissextoExtraIsLeap1() {
		Cal cal = new Cal();
		
		//Caso de Teste Extra 2
		assertSame(false, cal.isLeap(100));
		
	}
	
	@Test
	/**
	 * OBS: Importante observar que se fosse usado o comando cal
	 * do Linux como Oráculo o resultado retornado seria true,
	 * o que é incorreto, uma vez que 1000 quando divido por 1000
	 * temos resto igual a zero, portanto não é bissexto
	 */
	public void testBissextoExtraNumberOfDays2() {
		Cal cal = new Cal();
		
		//Caso de Teste Extra 3
		assertEquals("28", String.valueOf(cal.numberOfDays(2, 1000)));
		
	}
	
	@Test
	/**
	 * OBS: Importante observar que se fosse usado o comando cal
	 * do Linux como Oráculo o resultado retornado seria true,
	 * o que é incorreto, uma vez que 1000 quando divido por 1000
	 * temos resto igual a zero, portanto não é bissexto
	 */
	public void testBissextoExtraIsLeap2() {
		Cal cal = new Cal();
		
		//Caso de Teste Extra 4
		assertSame(false, cal.isLeap(1000));
		
	}
	
	@Test
	/**
	 * OBS: Importante observar que se fosse usado o comando cal
	 * do Linux como Oráculo o resultado retornado seria correto,
	 * o que não é verdade, uma vez que 100 quando divido por 100
	 * temos resto igual a zero, portanto não é bissexto
	 */
	public void testBissextoExtraFirstOfMonth1() {
		Cal cal = new Cal();
		
		//Caso de Teste Extra 4
		assertEquals(6, cal.firstOfMonth(3, 100));
		
	}
	
	@Test
	/**
	 * OBS: Importante observar que se fosse usado o comando cal
	 * do Linux como Oráculo o resultado retornado seria correto
	 */
	public void testBissextoExtraFirstOfMonth2() {
		Cal cal = new Cal();
		
		//Caso de Teste Extra 4
		assertEquals(4, cal.firstOfMonth(3, 1000));
		
	}

}
