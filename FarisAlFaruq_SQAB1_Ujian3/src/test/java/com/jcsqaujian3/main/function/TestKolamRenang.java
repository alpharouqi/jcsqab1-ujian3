package com.jcsqaujian3.main.function;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)

public class TestKolamRenang {

	KolamRenang function;

	@Before
	public void setUp() throws Exception {
		function = new KolamRenang();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/kelilingkolam.csv")
	public void testKelilingKolam(double panjang, double lebar, double tinggi, double hasil) {
		System.out.println(hasil);
		assertEquals(hasil, function.kelilingKolam(panjang, lebar, tinggi), 0.0);
	}
	
	@Test
	@FileParameters("src/test/resources/kelilingkolam.csv")
	public void testAngkaNegatif(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(-80, function.kelilingKolam(-10, -5, -5), 0.0);
	}
	
	@Test
	@FileParameters("src/test/resources/kelilingkolam.csv")
	public void testTidakAdaAngka(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(0, function.kelilingKolam(0, 0, 0), 0.0);
	}

	@Test
	@FileParameters("src/test/resources/volumekolam.csv")
	public void testVolumeKolam(double panjang, double lebar, double tinggi, double hasil) {
		System.out.println(hasil);
		assertEquals(hasil, function.volumeKolam(panjang, lebar, tinggi), 0.0);
	}
	
	@Test
	@FileParameters("src/test/resources/volumekolam.csv")
	public void testAngkaNegatif2(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(-250, function.volumeKolam(-10, -5, -5), 0.000000001);
	}
	
	@Test
	@FileParameters("src/test/resources/volumekolam.csv")
	public void testTidakAdaAngka2(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(0, function.volumeKolam(0,0,0), 0.000000001);
	}
	
	@Test
	public void testBukanAngka(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals("abc", function.kelilingVolume("abc"));
	}
	
	@Test
	public void testBukanAngka2(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals("abc", function.kelilingVolume("abc"));
	}

}
