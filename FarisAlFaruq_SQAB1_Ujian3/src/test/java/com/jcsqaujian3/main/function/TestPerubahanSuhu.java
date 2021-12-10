package com.jcsqaujian3.main.function;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)

public class TestPerubahanSuhu {

	PerubahanSuhu function;

	@Before
	public void setUp() throws Exception {
		function = new PerubahanSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	@FileParameters("src/test/resources/suhu.csv")
//	public void testSuhuFahrenheit(double fahrenheit, double hasil) {
//		System.out.println(hasil);
//		assertEquals(hasil, function.suhuCelcius(fahrenheit), -0.0);
//	}
//	
//	@Test
//	@FileParameters("src/test/resources/suhu.csv")
//	public void testAngkaNegatif(double fahrenheit, double hasil) {
//		assertEquals(hasil, function.suhuCelcius(fahrenheit), -0.0);
//	}
	
	@Test
	public void testBukanAngka(double fahrenheit, double hasil) {
		assertEquals("abc", function.suhuCelcius2("abc"));
	}
	
	@Test
	@FileParameters("src/test/resources/suhu.csv")
	public void testTidakAdaAngka(double fahrenheit, double hasil) {
		assertEquals(0, function.suhuCelcius(0), 0.0);
	}
	
}
