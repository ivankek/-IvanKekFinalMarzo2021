package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {
	@Test
	public void queSePuedePedirImpuestoSobreProducto() {

		Producto producto = new Producto(1, "Alfajor", 5.0);
		assertEquals(producto.getPrecio(), 5.0, 0);
		assertEquals(producto.getImpuesto(), 1.05, 0);
		assertEquals(producto.getPrecioFinal(), 6.05, 0);

	}

	@Test
	public void queSePuedePedirImpuestoSobreProductoDeLujo() {

		ProductoDeLujo producto = new ProductoDeLujo(1, "Alfajor", 5.0);
		assertEquals(producto.getPrecio(), 5.0, 0);
		assertEquals(producto.getImpuesto(), 0.75, 0);
		assertEquals(producto.getPrecioFinalLujo(), 5.75, 0);

	}

}
