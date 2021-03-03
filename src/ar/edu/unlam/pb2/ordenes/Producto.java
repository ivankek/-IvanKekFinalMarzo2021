package ar.edu.unlam.pb2.ordenes;

public class Producto {
	private Integer numero;
	private String descripcion;
	private Double precio;

	/*
	 * Se crea un producto.
	 */
	public Producto(Integer numero, String descripcion, Double precio) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/*
	 * Retorna el precio unitario del Producto.
	 */
	public Double getPrecio() {
		return precio;
	}

	/*
	 * Devulve el monto del impuesto. Todo producto tiene un 21% de impuesto.
	 */
	public Double getImpuesto() {
		Double precioIva = precio * 0.21;
		return precioIva;
	}

	/*
	 * Devuelve la descripción del Producto
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	/*
	 * Devuelve el precio del producto luego de aplicar el impuesto.
	 */
	public Double getPrecioFinal() {
		Double precioConIva = precio + getImpuesto();
		return precioConIva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
