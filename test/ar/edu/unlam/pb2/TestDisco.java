package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testQueCreaDisco() {
		
		Disco miDisco = new Disco(4.0,2.0); //int -ext
		
		Double esperado=2.0;
		Double obtenido=miDisco.getRadioInterior();
		assertEquals(esperado,obtenido);//si el radio coincide se creo bien
	}

	@Test
	public void testQueCalculaPerimetroInterior() {
		
		Disco miDisco = new Disco();
		Double obtenido = miDisco.perimetroInterior(3.0, 2.0);
		Double esperado = 12.5;
		
		assertEquals(esperado, obtenido,0.1);
	}

	@Test
	public void testQueCalculaPerimetroExterior() {
		
		Disco miDisco = new Disco();
		Double obtenido = miDisco.perimetroExterior(3.0,2.0);
		Double esperado = 18.89;
		
		assertEquals(esperado, obtenido,0.1);
	}


	@Test
	public void testQueCalculaSuperficie() {
		
		Disco miDisco = new Disco(3.0,2.0);
		Double obtenido = miDisco.superficie(3.0);
		Double esperado = 28.27;
		
		assertEquals(esperado, obtenido,0.1);
	}
	
	@Test
	public void testQueFallaPorMismoRadio() {
		
		Disco miDisco = new Disco();
		Double obtenido = miDisco.perimetroExterior(3.0,3.0);
		Double esperado = 1.0;
		
		assertTrue(esperado.equals(obtenido));
	}

}
