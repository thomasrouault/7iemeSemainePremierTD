package SeptiemeSemaine.FirstTD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class firstClassTest{
	
	@Test
	public  void additionTest() {
		int sum = Hello.addition();
		assertEquals(80, sum);
	}
	
	@Test
	public  void soustractionTest() {
		int sum = Hello.soustraction();
		assertEquals(44, sum);
	}
}