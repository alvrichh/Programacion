package view;

import java.util.List;

import controller.ADClassicModels;
import controller.ControllerException;
import model.Employees;
import model.Offices;

public class Principal {

	public static void main(String[] args) {
		mostrarListado1();
		mostrarListado2();
	}

	/**
	 * Listado de los "employees"
	 */
	private static void mostrarListado1() {
		try {
			ADClassicModels ctrl = new ADClassicModels();
			List<Employees> listado = ctrl.getFullListEmployees();
			listado.stream().forEach(System.out::println);
		} catch (ControllerException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Listado de los "offices"
	 */
	private static void mostrarListado2() {
		try {
			ADClassicModels ctrl = new ADClassicModels();
			List<Offices> listado = ctrl.getFullListOffices();
			listado.stream().forEach(System.out::println);
		} catch (ControllerException e) {
			System.err.println(e.getMessage());
		}
	}

}