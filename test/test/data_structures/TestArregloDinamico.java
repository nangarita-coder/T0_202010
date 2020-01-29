package test.data_structures;

import model.data_structures.ArregloDinamico;
import model.logic.Modelo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico arreglo;
	private static int TAMANO=100;

	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico(TAMANO);
	}
	public void setUp2() {
		arreglo= new ArregloDinamico(TAMANO);

		arreglo.agregar("a");
		arreglo.agregar("b");
		arreglo.agregar("c");
		arreglo.agregar("d");

	}

	public void setUp3() {
		arreglo= new ArregloDinamico(TAMANO);
		for(int i =0; i< TAMANO;i++){
			arreglo.agregar(""+i);
		}
	}
	public void setUp4() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}
	
	@Test
	public void testArregloDinamico() {
		// TODO Completar la prueba
		setUp1();
		assertTrue(arreglo!=null);
		assertEquals(0, arreglo.darTamano());  // Modelo con 0 elementos presentes.

	}

	@Test
	public void testDarElemento() {
	
		// TODO Completar la prueba
		setUp1();
		assertEquals(null, arreglo.darElemento(0));
		assertEquals(null, arreglo.darElemento(1));
		assertEquals(null, arreglo.darElemento(2));
		assertEquals(null, arreglo.darElemento(3));

		setUp2();
		assertEquals("a", arreglo.darElemento(0));
		assertEquals("b", arreglo.darElemento(1));
		assertEquals("c", arreglo.darElemento(2));
		assertEquals("d", arreglo.darElemento(3));

		setUp3();
		assertEquals(""+"0", arreglo.darElemento(0));
		assertEquals(""+"1", arreglo.darElemento(1));
		assertEquals(""+"2", arreglo.darElemento(2));
		assertEquals(""+"3", arreglo.darElemento(3));
	}

	@Test
	public void testDarTamano() {
		// TODO Completar la prueba
		setUp1();
		assertEquals(0, arreglo.darTamano());

		setUp2();
		assertEquals(4, arreglo.darTamano());

		setUp3();
		assertEquals(200, arreglo.darTamano());


	}

	@Test
	public void testAgregar() {

		// TODO Completar la prueba
		setUp1();
		arreglo.agregar("prueba");
		assertEquals(1, arreglo.darTamano());
		assertEquals(100, arreglo.darCapacidad());

		setUp2();
		arreglo.agregar("prueba");
		assertEquals(5, arreglo.darTamano());
		assertEquals(100, arreglo.darCapacidad());

		setUp3();
		arreglo.agregar("prueba");
		assertEquals(101, arreglo.darTamano());
		assertEquals(200, arreglo.darCapacidad());



	}

	@Test
	public void testBuscar() {

		// TODO Completar la prueba
		setUp1();
		assertEquals(null, arreglo.buscar("prueba"));
		arreglo.agregar("prueba");
		assertEquals("prueba", arreglo.buscar("prueba"));

		setUp2();
		assertEquals("a", arreglo.buscar("a"));
		assertEquals("b", arreglo.buscar("b"));
		assertEquals("c", arreglo.buscar("c"));
		assertEquals("d", arreglo.buscar("d"));
		arreglo.agregar("1");
		assertEquals("1", arreglo.buscar("1"));

	}

	@Test
	public void testEliminar() {

		// TODO Completar la prueba

		setUp1();
		arreglo.agregar("prueba");
		arreglo.eliminar("prueba");
		assertEquals("Se elimino el elemento", arreglo.eliminar("prueba"));
		assertEquals(0, arreglo.darTamano());
		assertEquals(100, arreglo.darCapacidad());
		
		arreglo.agregar("prueba");
		arreglo.eliminar("a");
		assertEquals("No se elimino el elemento", arreglo.eliminar("prueba"));
		assertEquals(1, arreglo.darTamano());
		assertEquals(100, arreglo.darCapacidad());

		setUp2();
		arreglo.eliminar("a");
		assertEquals("Se elimino el elemento", arreglo.eliminar("prueba"));
		assertEquals(3, arreglo.darTamano());
		assertEquals(100, arreglo.darCapacidad());
		
		arreglo.eliminar("a");
		assertEquals("No se elimino el elemento", arreglo.eliminar("prueba"));
		assertEquals(3, arreglo.darTamano());
		assertEquals(100, arreglo.darCapacidad());



	}



}
