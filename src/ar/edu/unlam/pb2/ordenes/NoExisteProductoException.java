package ar.edu.unlam.pb2.ordenes;

public class NoExisteProductoException extends Exception {

	public NoExisteProductoException(String mensaje) {
		super(mensaje);
	}

}
