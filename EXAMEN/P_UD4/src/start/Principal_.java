package start;

import exam.Academia;
import exam.Alumno;
import exam.Asignatura;
import exam.DatoContact;
import exam.DatoPers;

public class Principal_ {

	public static void main(String[] args) {
		
		DatoPers d = new DatoPers();
		
		DatoContact dc = new DatoContact();
		Alumno alum = new Alumno();
		
		Asignatura[] a  = new Asignatura[10];

		a[1] = new Asignatura();
		a[2] = new Asignatura();
		a[3] = new Asignatura("LM", "1TIC", 10, alum);


		
		Academia a = new Academia("IES ALIXAR", null);
		System.out.println(a);
	}

}