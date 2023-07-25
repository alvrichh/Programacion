package exam;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	public List<Persona> obtenerPersonasOrdenadas() {
		   return getEmpleados().values().stream()
		      .flatMap(List::stream)
		      .sorted()
		      .collect(Collectors.toList());
		}

}
