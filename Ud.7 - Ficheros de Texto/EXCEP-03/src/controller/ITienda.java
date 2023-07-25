package controller;

import model.Producto;

public interface ITienda {

	void addProducto(Producto p) throws ArrayLlenoException;

	void delProducto(int pos) throws ProductoNoEncontradoException;

	Producto getProducto(int pos) throws ProductoNoEncontradoException;

	Producto[] lstProducto() throws ArrayVacioException;

	Double valorProducto(int pos) throws ProductoNoEncontradoException;
}