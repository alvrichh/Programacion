package view;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import model.Camion;

public class Principal {
    private static final String CAMIONES_ARCHIVO = "camiones.dat";
    private static final int NUM_CAMIONES = 3;

    public static void main(String[] args) {
        Set<Camion> camiones = new HashSet<>();

        try (// Abrir el archivo camiones.dat para leer
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CAMIONES_ARCHIVO))) {
            // Leer los camiones del archivo y almacenarlos en el conjunto
			while (true) {
				Camion camion = (Camion) ois.readObject();
				camiones.add(camion);
			}
        } catch (EOFException e) {
            // Se ha llegado al final del archivo, no hacer nada
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al leer los camiones: " + e.getMessage());
        }

        if (camiones.isEmpty()) {
            // No hay camiones en el archivo, añadir 3 camiones inventados
            camiones.add(new Camion(4, 3000.0, "ABS", 60000.0));
            camiones.add(new Camion(8, 3500.0, "HDS", 75000.0));
            camiones.add(new Camion(16, 4000.0, "ABS", 90000.0));

            try {
                // Abrir el archivo camiones.dat para escribir
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMIONES_ARCHIVO));

                // Escribir los camiones en el archivo
                for (Camion camion : camiones) {
                    oos.writeObject(camion);
                }

                // Cerrar el archivo
                oos.close();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error al escribir los camiones: " + e.getMessage());
            }
        } else {
            // Hay camiones en el archivo, mostrarlos por pantalla
            System.out.println("Camiones almacenados:");
            for (Camion camion : camiones) {
                System.out.println(camion);
            }
        }
    }
}
