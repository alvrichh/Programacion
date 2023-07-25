package controller;

import java.util.List;

import model.Perro;

public interface IConcurso {

	boolean addDog(String raza, Perro perro);

	boolean disqualifyDog(Perro perro);

	List<Perro> ownerDogs(Long socio);

	List<Perro> perrosPorPeso(String raza);

	List<Perro> perrosPorEdad(String raza);

}