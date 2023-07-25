package controller;

import model.Producto;

public class Tienda implements ITienda {

	private Producto[] tienda;

	public Tienda() throws CantidadProductosNoValidoException {
		this(0);
	}

	public Tienda(int cantProds) throws CantidadProductosNoValidoException {
		if (cantProds < 0) {
			throw new CantidadProductosNoValidoException();
		}
		tienda = new Producto[cantProds];
	}

	@Override
	public void addProducto(Producto p) throws ArrayLlenoException {
		boolean ok = false;
		for (int i = 0; i < tienda.length; i++) {
			if (tienda[i] == null) {
				tienda[i] = p;
				ok = true;
				break;
			}
		}
		if (!ok) {
			throw new ArrayLlenoException();
		}
	}

	@Override
	public void delProducto(int pos) throws ProductoNoEncontradoException {
		if (pos < 0) {
			throw new ProductoNoEncontradoException(-1);
		}
		if (pos > tienda.length) {
			throw new ProductoNoEncontradoException(99);
		}
		if (tienda[pos] == null) {
			throw new ProductoNoEncontradoException(0);
		}

		tienda[pos] = null;
	}

	@Override
	public Producto getProducto(int pos) throws ProductoNoEncontradoException {
		if (pos < 0) {
			throw new ProductoNoEncontradoException(-1);
		}
		if (pos > tienda.length) {
			throw new ProductoNoEncontradoException(99);
		}
		if (tienda[pos] == null) {
			throw new ProductoNoEncontradoException(0);
		}

		return tienda[pos];
	}

	@Override
	public Producto[] lstProducto() throws ArrayVacioException {
		Producto[] tmp;

		// Contamos cuántos productos están almacenados en el array tienda
		int cont = 0;
		for (int i = 0; i < tienda.length; i++) {
			if (tienda[i] != null) {
				cont++;
			}
		}

		// Si no hay productos en el array tienda, disparo una excepción
		if (cont == 0) {
			throw new ArrayVacioException();
		}

		// Como ya sabemos cuántos elementos hay en el array tienda, dimensionamos el
		// array tmp
		tmp = new Producto[cont];

		// Guardamos en el array tmp los productos del array tienda (no nulos)
		int pos = 0;
		for (int i = 0; i < tienda.length; i++) {
			if (tienda[i] != null) {
				tmp[pos++] = tienda[i];
				// Si ya hemos llenado el array tmp, no es necesario
				// seguir recorriendo el array tienda
				if (pos == cont) { 
					break;
				}
			}
		}

		// Devolvemos el array tmp
		return tmp;
	}

	@Override
	public Double valorProducto(int pos) throws ProductoNoEncontradoException {
		if (pos < 0) {
			throw new ProductoNoEncontradoException(-1);
		}
		if (pos > tienda.length) {
			throw new ProductoNoEncontradoException(99);
		}
		if (tienda[pos] == null) {
			throw new ProductoNoEncontradoException(0);
		}
		
		return tienda[pos].valorAlmacenado();
	}

}