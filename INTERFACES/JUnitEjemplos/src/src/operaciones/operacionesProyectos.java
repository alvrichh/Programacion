package operaciones;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import  conexion.*;
import  datos.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class operacionesProyectos {
	
///////////////////////////////////////////////
public Proyectos buscarproveedor(JTextField codproyec, JLabel mensaje)
	{
	SessionFactory sesion = conexionBD.getSessionFactory();		
	Session session = sesion.openSession();		
	Proyectos pie=new Proyectos();
	
	pie = (Proyectos) session.get(Proyectos.class, codproyec.getText().toString());	
	if (pie==null) {			
	System.out.println("PROYECTO no existe: " + codproyec.getText().toString() );
	mensaje.setText("PROYECTO : " + codproyec.getText().toString() + " NO EXISTE ");
	}
	else
	{
	System.out.println("PROYECTO SI existe: " + codproyec.getText().toString() );
	mensaje.setText("PROYECTO : " + codproyec.getText().toString() + " LOCALIZADO ");
	
	}
	
	session.close();	
	return pie;
	}

///////////////////////////////////////////////////////////
public void cargarzonas( JComboBox lzo) {
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
	
		Query consulta = session.createQuery("from Zonas");	
		Iterator q = consulta.iterate();
		Zonas pi = new Zonas();
	
    	while (q.hasNext()) {
			pi =  (Zonas) q.next();
            lzo.addItem(pi.getCodigo() + "/" + pi.getNombre());
            System.out.println(" ZON: " + pi.getCodigo());
		}
    	session.close();
	}
	///////////////////////////////////////////////////////////
public void listarproyectos( JTextArea ta) {
		
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
	    //  Transaction tx =session.beginTransaction();
	
		Font f = new Font("Courier", Font.TRUETYPE_FONT, 10);
		ta.setFont(f);

		ta.setText("");
		Query consulta = session.createQuery("from Proyectos");

		ta.append("................................. DATOS DE PROYECTOS .................................\n");
		ta.append(String.format("%1$-8s", "CODIGO")
				+ String.format("%1$-25s", "NOMBRE")
				+ String.format("%1$-25s", "CIUDAD")
				+ String.format("%1$-15s", "PRESUPUESTO")
				+ String.format("%1$-15s", "ZONA" )
				);

	   	ta.append("\n-----------------------------------------------------------------------------------------------\n");

		Iterator q = consulta.iterate();
		Proyectos pi = new Proyectos();
    	while (q.hasNext()) {
			pi =  (Proyectos) q.next();

			ta.append(String.format("%1$-8s", pi.getCodigo())
					+ String.format("%1$-25s", pi.getNombre())
					+ String.format("%1$-25s", pi.getCiudad()) 
					+ String.format("%1$-15s", pi.getPresupuesto()) 
					+ String.format("%1$-15s", pi.getZonas().getNombre()) 
					+ "\n");
		
		}
    	ta.append("-----------------------------------------------------------------------------------------------\n");
    	session.close();
	} // fin listar piezas
	
	

}
