package Lista_3;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalTestGregoriano {

	@Test
	public void testGregoriano() {
		Cal cal = new Cal();
		
		/**
		 * OBSERVAÇÂO: Diferente do cal apresentado para o teste de
		 * caixa preta o qual apresentava falha para todos os meses
		 * do ano 1752 anteriores ao mês de setembro, este código
		 * usado para o teste de caixa preta não apreenta tal falha
		 */
		
		//Caso de Teste 38
		// N: 1
		assertEquals("31", String.valueOf(cal.numberOfDays(8, 1752)));
		
		//Caso de Teste 39
		// N: 2
		assertEquals("19", String.valueOf(cal.numberOfDays(9, 1752)));
		
		//Caso de Teste 40
		// N: 3
		assertEquals("31", String.valueOf(cal.numberOfDays(10, 1752)));
		
		//Caso de Teste 41
		// N: 4
		assertEquals("30", String.valueOf(cal.numberOfDays(9, 1751)));
		
		//Caso de Teste 42
		// N: 5
		assertEquals("30", String.valueOf(cal.numberOfDays(9, 1753)));
			
	}
	

}
