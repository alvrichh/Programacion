package view;

import java.util.List;

import controller.CtrlEmpleados;
import model.Empleado;

public class GestEmpleados {
	
	static CtrlEmpleados ctrlE = new CtrlEmpleados();

	/**
	 * Mostrar el listado completo de empleados
	 */
	static void listadoCompletoEmpleados() {
		try {
			List<Empleado> listado = ctrlE.getListadoCompleto();
			listado.stream().forEach(System.out::println);
		} catch (Exception e) {
			Util.escribirError(e.getMessage());
		}

	}

}