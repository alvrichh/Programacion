package controller;

import java.util.List;
import java.util.Set;

import model.Divisa;
import model.ParCotizacion;

public interface IExchange {

	List<Divisa> mostrarDivisasOrdenadas();

	Set<ParCotizacion> obtenerCotizaciones(String simbolo);

	Set<ParCotizacion> mostrarCotizacionesAlAlzaUnaHora();

	void addCotizacion(ParCotizacion cotizacion);

	void cargarFchCotizaciones();

	void guardarFchCotizaciones();

}