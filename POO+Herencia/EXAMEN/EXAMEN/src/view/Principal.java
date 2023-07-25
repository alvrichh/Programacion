package view;

import java.util.List;

import controller.*;
import model.*;


public class Principal {

	public static void main(String[] args) {
		
		// Creamos los materiales
		Cristal cristal1 = new Cristal("Cristal1", 100, 20, 80, true, TipoCristal.TRANSLUCIDO);
		Cristal cristal2 = new Cristal("Cristal2", 200, 30, 70, false, TipoCristal.TRANSPARENTE);
		Metal metal1 = new Metal("Metal1", 500, 60, 40, true, true);
		Metal metal2 = new Metal("Metal2", 300, 80, 20, false, false);
		Roca roca1 = new Roca("Roca1", 400, 40, 60, true, 8);

		
// Creamos la sierra y el pico
		Sierra sierra1 = new Sierra("Sierra1", 100, 50, 50, true, 5);
		Pico pico1 = new Pico("Pico1", 200, 70, 30, false, 3);
		
		
		
//		// Ordenamos y mostramos los materiales por masa, por capacidad de quemarse y por capacidad de diluirse
		System.out.println("Materiales ordenados por masa:");
		
//		// Añadimos los materiales y herramientas a la lista de materiales
//		
	System.out.println("Estado de los materiales:");
		Minecraft minecraft = new Minecraft();
		minecraft.mostrarEstado();
		
		Material material = new Material();
		
		minecraft.addMaterial(new Material("Iron", 800, 70, 0, true));
	    minecraft.addMaterial(new Material("Coal", 500, 90, 10, true));
	    minecraft.addMaterial(new Material("Water", 1000, 0, 100, false));
//	    minecraft.mostrarEstado();
//	    minecraft.borrarMaterialSinMasa();
//	    minecraft.mostrarEstadoOrdenadoPorMasa();
//	    minecraft.mostrarEstadoOrdenadoPorQuemarse();
//	    minecraft.mostrarEstadoOrdenadoPorDiluirse();
//	    Material ultimoMaterial = minecraft.ultimoMaterialQueQueda();
//	    if (ultimoMaterial != null) {
//	        System.out.println("El último material que queda es: " + ultimoMaterial);
//	    }

		}

		
		
		
		
	}

		
		




