package Lista_3;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalTestForaDosLimites {
	
	/**
	 * OBSERVAÇÂO: Aqui os erros se dão pelo simples fato dos métodos
	 * do programa não fazerem tratamento da entradas, apenas o método
	 * main faz essa verificação o qual não é invocado nestes testes
	 */

	@Test
	public void test1() {
		Cal cal = new Cal();
		
		assertNull(cal.jan1(0));
	}
	
	@Test
	public void test2() {
		Cal cal = new Cal();
		
		assertNull(cal.jan1(-1));
	}
	
	@Test
	public void test3() {
		Cal cal = new Cal();
		
		assertNull(cal.jan1(1000));
	}
	
	@Test
	public void test4() {
		Cal cal = new Cal();
		
		assertNull(cal.isLeap(0));
	}
	
	@Test
	public void test5() {
		Cal cal = new Cal();
		
		assertNull(cal.isLeap(-1));
	}
	
	@Test
	public void test6() {
		Cal cal = new Cal();
		
		assertNull(cal.firstOfMonth(0, -1));
	}
	
	@Test
	public void test7() {
		Cal cal = new Cal();
		
		assertNull(cal.firstOfMonth(-1, -1));
	}
	
	@Test
	public void test8() {
		Cal cal = new Cal();
		
		assertNull(cal.numberOfDays(-1, 0));
	}
	
	@Test
	public void test9() {
		Cal cal = new Cal();
		
		assertNull(cal.numberOfDays(0, -1));
	}
	

}
