package com.constructsio;

import org.junit.Assert;
import org.junit.Test;

public class BatimentTest {

	@Test
	// test du prix global, c'est à dire prix de base + options
	public void prixGlobal() {
		Batiment batiment1 = new Batiment(150000);
		int prixGlobalCalcule = batiment1.prixGlobal();
		Assert.assertEquals(153000, prixGlobalCalcule);
	}

	@Test(expected = RuntimeException.class)
	// test du prix < 0 et de l'exception
	public void batimentTest() {
		new Batiment(-1);
	}
}
