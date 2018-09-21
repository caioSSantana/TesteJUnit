package Teste;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TesteJUnit {
	ClasseTeste c = new ClasseTeste();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSomar() {
		assertEquals(6, c.somar(4, 2));
	}

	@Test
	public void testMaior() {
		assertEquals(7 ,c.maior(2, 7));
		assertEquals(null, c.maior(5, 5));
		assertEquals(-3 ,c.maior(-3, -6));
	}

	@Test
	public void testPotencia() {
		assertEquals(-8, c.potencia(-2, 3));
		assertEquals(1, c.potencia(36, 0));
	}

}
