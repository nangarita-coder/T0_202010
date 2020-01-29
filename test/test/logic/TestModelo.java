package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}
	
	public void setUp2() {
		modelo= new Modelo(CAPACIDAD);
		
			modelo.agregar("a");
			modelo.agregar("b");
			modelo.agregar("c");
			modelo.agregar("d");
		
	}
	
	public void setUp3() {
		modelo= new Modelo(CAPACIDAD);
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}
	
	
	

	@Test
	public void testModelo() {
		setUp1();
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO Completar la prueba
		setUp1();
		assertEquals(0, modelo.darTamano());
		
		setUp2();
		assertEquals(4, modelo.darTamano());
		
		setUp3();
		assertEquals(200, modelo.darTamano());
		
		
	}

	@Test
	public void testAgregar() {
		
		// TODO Completar la prueba
		setUp1();
		modelo.agregar("prueba");
		assertEquals(1, modelo.darTamano());
		
		setUp2();
		modelo.agregar("prueba");
		assertEquals(5, modelo.darTamano());
		
		setUp3();
		modelo.agregar("prueba");
		assertEquals(101, modelo.darTamano());
		
		
		
	}

	@Test
	public void testBuscar() {
		
		// TODO Completar la prueba
		setUp1();
		assertEquals(null, modelo.buscar("prueba"));
		modelo.agregar("prueba");
		assertEquals("prueba", modelo.buscar("prueba"));
		
		setUp2();
		assertEquals("a", modelo.buscar("a"));
		assertEquals("b", modelo.buscar("b"));
		assertEquals("c", modelo.buscar("c"));
		assertEquals("d", modelo.buscar("d"));
		modelo.agregar("1");
		assertEquals("1", modelo.buscar("1"));
			
	}

	@Test
	public void testEliminar() {
		
		// TODO Completar la prueba
		
		setUp1();
		modelo.agregar("prueba");
		modelo.eliminar("prueba");
		assertEquals(0, modelo.darTamano());
		modelo.agregar("prueba");
		modelo.eliminar("a");
		assertEquals(1, modelo.darTamano());
		
		setUp2();
		modelo.eliminar("a");
		assertEquals(3, modelo.darTamano());
		modelo.eliminar("a");
		assertEquals(3, modelo.darTamano());
		
		
		
	}

}
