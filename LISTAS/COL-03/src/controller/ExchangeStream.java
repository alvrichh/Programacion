package controller;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Divisa;
import model.ParCotizacion;

public class ExchangeStream extends Exchange {

	public ExchangeStream() {
	}

	@Override
	public List<Divisa> mostrarDivisasOrdenadas() {
		List<Divisa> aux = getExchange().stream()
						.flatMap(par -> Stream.of(par.getDivBase(), par.getDivCotizada()))
						.distinct()
						.sorted()
						.collect(Collectors.toList());
		return aux;
	}
	
	@Override
	public Set<ParCotizacion> obtenerCotizaciones(String simbolo) {
		Set<ParCotizacion> aux = getExchange().stream()
		        		.filter(par -> par.getDivBase().getSimbolo().equalsIgnoreCase(simbolo))
		        		.collect(Collectors.toSet());
		return aux;
	}

	@Override
	public Set<ParCotizacion> mostrarCotizacionesAlAlzaUnaHora() {
		Set<ParCotizacion> aux = getExchange().stream()
	            		.filter(par -> par.getVariacion() > 0.0)
	            		.collect(Collectors.toSet());
		return aux;
	}

}