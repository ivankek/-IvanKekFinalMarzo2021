package ar.edu.unlam.pb2.ordenes;

import java.util.Set;

/*
 * Mantiene una colecci�n de Productos, los cuales no pueden
 * estar duplicados. Adem�s, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * �Cu�l es la colecci�n adecuada?
	 */
	
	
	
	/*
	 * Agregar producto al cat�logo.
	 * No se permiten Productos duplicados. Criterio: n�mero de Producto. 
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {
		return null;
		
	}
	
	/*
	 * Remueve Producto del Cat�logo.
	 * Lanza una Excepci�n si el Producto no se encuentra en el Cat�logo.
	 */
	public Boolean quitarProducto(Producto producto) {
		return null;		
	}
	
	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */
	
	public Boolean removerStock(Producto producto, Integer cantidad) {
		return null;
	}
	
	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		return null;
	}
}
