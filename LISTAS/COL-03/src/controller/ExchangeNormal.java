package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import model.Divisa;
import model.ParCotizacion;

public class ExchangeNormal extends Exchange {

	public ExchangeNormal() {
	}

	@Override
	public List<Divisa> mostrarDivisasOrdenadas() {
		Set<Divisa> aux = new TreeSet<Divisa>();
		for (ParCotizacion par : getExchange()) {
			aux.add(par.getDivBase());
			aux.add(par.getDivCotizada());
		}
		List<Divisa> lst = new ArrayList<Divisa>();
		lst.addAll(aux);
		return lst;
	}

	@Override
	public Set<ParCotizacion> obtenerCotizaciones(String simbolo) {
		Set<ParCotizacion> aux = new HashSet<ParCotizacion>();
		for (ParCotizacion par : getExchange()) {
			if (par.getDivBase().getSimbolo().equalsIgnoreCase(simbolo)) {
				aux.add(par);
			}
		}
		return aux;
	}

	@Override
	public Set<ParCotizacion> mostrarCotizacionesAlAlzaUnaHora() {
		Set<ParCotizacion> aux = new HashSet<ParCotizacion>();
		for (ParCotizacion par : getExchange()) {
			if (par.getVariacion() > 0.0) {
				aux.add(par);
			}
		}
		return aux;
	}

}