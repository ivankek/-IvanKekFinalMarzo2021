package ar.edu.unlam.pb2.ordenes;

/*
 * Es un tipo "especial" de Producto.
 */
public class ProductoDeLujo extends Producto {

	/*
	 * Se le aplica el 21% y un 15% de impuesto adicional por derechos de
	 * importación.
	 */

	public ProductoDeLujo(Integer numero, String descripcion, Double precio) {
		super(numero, descripcion, precio);
	}

	@Override
	public Double getImpuesto() {
		Double impuestoLujo = getPrecio() * 0.15;
		return impuestoLujo;
	}

	public Double getPrecioFinalLujo() {
		Double precioFinal = getPrecio() + getImpuesto();
		return precioFinal;
	}

}
