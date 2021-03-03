package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatalogoTest {

	@Test(expected = NoExisteProductoException.class)
	public void queQuitarProductoInexitenteLanceExcepcion() throws NoExisteProductoException {
		Producto producto = new Producto(1, "Alfajor", 1.0);
		Catalogo catalogo = new Catalogo();
		Producto producto2 = new Producto(2, "Galletitas", 2.0);
		catalogo.agregarProducto(producto, 1);
		catalogo.quitarProducto(producto2);

	}

	@Test
	public void queAlRemoverStockLaCantidadEnExistenciaSeaCorrecta() {

		Producto producto = new Producto(1, "Alfajor", 1.0);
		Producto producto2 = new Producto(2, "Galletitas", 2.0);
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProducto(producto2, 2);
		catalogo.removerStock(producto2, 2);

		assertEquals(catalogo.obtenerCantidad(producto2), 0, 0);

	}
}
