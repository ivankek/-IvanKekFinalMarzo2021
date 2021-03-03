package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineaOrdenTest {
	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {

		Producto producto = new Producto(1, "Alfajor", 2.0);
		Producto producto2 = new Producto(2, "Galletitas", 3.0);
		LineaOrden linea1 = new LineaOrden(producto, 2);
		LineaOrden linea2 = new LineaOrden(producto2, 2);
		Orden orden = new Orden();
		orden.agregarLinea(linea1);
		orden.agregarLinea(linea2);
		assertEquals(orden.obtenerPrecioTotal(), 10.0, 0.0);

	}

}
