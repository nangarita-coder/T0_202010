package model.logic;

import model.data_structures.ArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo<T> {
	/**
	 * Atributos del modelo del mundo
	 */
	private ArregloDinamico<T> datos;

	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico<T>(7);
	}

	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico<T>(capacidad);
	}

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(T dato)
	{	
		datos.agregar(dato);
	}

	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public T buscar(T dato)
	{
		return (T) datos.buscar(dato);
	}

	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public T eliminar(T dato)
	{
		return datos.eliminar(dato);
	}
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */

	public String toString ()
	{   String cadena = null;
	for (int i = 0; i < datos.darTamano(); i++) 
	{
		if(datos.darElemento(0)==null) 
		{
			cadena=null;
		}
		else 
		{
			cadena = cadena + datos.darElemento(i);
		}


	}
	return cadena;

	}




}
