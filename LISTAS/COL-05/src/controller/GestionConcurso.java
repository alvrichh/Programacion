package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import model.Perro;

public class GestionConcurso extends Concurso implements IConcurso {

	public GestionConcurso() {
		this("", "");
	}

	public GestionConcurso(String nombre, String localidad) {
		super(nombre, localidad);
	}

	@Override
	public boolean addDog(String raza, Perro perro) {
		boolean ok = false;
		if (raza.equals(perro.getRaza())) {
			if (!super.getPerros().containsKey(raza)) {
				super.getPerros().put(raza, new TreeSet<Perro>());
			}
			ok = super.getPerros().get(raza).add(perro);
		}
		return ok;
	}

	@Override
	public boolean disqualifyDog(Perro perro) {
		return super.getPerros().get(perro.getRaza()).remove(perro);
	}

	@Override
	public List<Perro> ownerDogs(Long socio) {
		List<Perro> lst = new ArrayList<Perro>();

		for (TreeSet<Perro> perros : super.getPerros().values()) {
			for (Perro p : perros) {
				if (p.getPropietario().getSocio().equals(socio)) {
					lst.add(p);
				}
			}
		}

		return lst;
	}

	@Override
	public List<Perro> perrosPorPeso(String raza) {
		List<Perro> lst = new ArrayList<Perro>();
		lst.addAll(super.getPerros().get(raza));
		Collections.sort(lst, new CompPerroPorPeso().reversed());
		return lst;
	}

	@Override
	public List<Perro> perrosPorEdad(String raza) {
		List<Perro> lst = new ArrayList<Perro>();
		lst.addAll(super.getPerros().get(raza));
		Collections.sort(lst, new CompPerroPorEdad().reversed());
		return lst;
	}

}