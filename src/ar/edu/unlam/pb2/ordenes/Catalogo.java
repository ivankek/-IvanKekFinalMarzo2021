package ar.edu.unlam.pb2.ordenes;

import java.util.HashSet;
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
	private Set<Producto> catalogo = new HashSet<Producto>();
	private Producto producto;

	/*
	 * Agregar producto al cat�logo. No se permiten Productos duplicados. Criterio:
	 * n�mero de Producto.
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {

		Boolean seAgrego = null;

		for (int i = 0; i < cantidad; i++) {
			seAgrego = catalogo.add(producto);

		}

		return seAgrego;
	}

	/*
	 * Remueve Producto del Cat�logo. Lanza una Excepci�n si el Producto no se
	 * encuentra en el Cat�logo.
	 */
	public Boolean quitarProducto(Producto producto) throws NoExisteProductoException {

		if (buscarProducto(producto) == null) {

			throw new NoExisteProductoException("No existe el producto que desea eliminar");

		}

		return catalogo.remove(producto);

	}

	public Producto buscarProducto(Producto producto) {

		for (Producto productoBuscar : catalogo) {
			if (productoBuscar.equals(producto))
				return producto;
		}

		return null;
	}

	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */

	public Boolean removerStock(Producto producto, Integer cantidad) {

		Boolean seRemovio = false;
		for (int i = 0; i < cantidad; i++) {

			seRemovio = catalogo.remove(producto);

		}
		return seRemovio;
	}

	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		HashSet<Producto> cantidadDeProductos = new HashSet<Producto>();

		for (Producto productoBuscar : catalogo) {
			if (productoBuscar.getDescripcion().equals(producto.getDescripcion())
					&& productoBuscar.getPrecio().equals(producto.getPrecio())) {

				cantidadDeProductos.add(productoBuscar);

			}
		}

		return cantidadDeProductos.size();

	}
}
