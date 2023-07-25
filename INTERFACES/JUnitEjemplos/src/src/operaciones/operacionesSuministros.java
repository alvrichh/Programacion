package operaciones;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import  conexion.*;
import  datos.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import datos.*;


public class operacionesSuministros {
	
	////////////////////////////////////////////////////////////////////
	public Proveedores cargaproveedor( String codigo) {
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
		Proveedores prov = new Proveedores();	
		prov = (Proveedores) session.get(Proveedores.class, codigo); 
		session.close();
		return prov;

	}
	///////////////////////////////////////////////////////////////////
	public Proyectos cargaproyecto( String codigo) {
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
		Proyectos prov = new Proyectos();
		prov = (Proyectos) session.get(Proyectos.class, codigo); 
		session.close();
		return prov;
		
	}
	/////////////////////////////////////////////////////////////////
	public Piezas cargapieza( String codigo) {
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
		Piezas prov = new Piezas();	
		prov = (Piezas) session.get(Piezas.class, codigo); 
		session.close();
		return prov;

	}
	////////////////////////////////////////////////////////////////////
	
	public void cargarcombos( JComboBox lpi, JComboBox lprov, JComboBox lproyec) {
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
	
		Query consulta = session.createQuery("from Piezas");	
		Iterator q = consulta.iterate();
		Piezas pi = new Piezas();
	
    	while (q.hasNext()) {
			pi =  (Piezas) q.next();
            lpi.addItem(pi.getCodigo());
            System.out.println(" Piez: " + pi.getCodigo());
		}
    	consulta = session.createQuery("from Proveedores");	
		 q = consulta.iterate();
		Proveedores prov = new Proveedores();
	
    	while (q.hasNext()) {
    		prov =  (Proveedores) q.next();
            lprov.addItem(prov.getCodigo());
            System.out.println(" Prov: " + prov.getCodigo());
		}
    	consulta = session.createQuery("from Proyectos");	
		 q = consulta.iterate();
		Proyectos proye = new Proyectos();
	
      	while (q.hasNext()) {
   		proye =  (Proyectos) q.next();
           lproyec.addItem(proye.getCodigo());
           System.out.println(" Proyec: " + proye.getCodigo());
		}
    	session.close();
	}
///////////////////////////////////////////////////////////////////////
	public void listarpiezas( JTextArea ta) {
		
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
	    //  Transaction tx =session.beginTransaction();
	
		Font f = new Font("Courier", Font.TRUETYPE_FONT, 10);
		ta.setFont(f);

		ta.setText("");
		Query consulta = session.createQuery("from Piezas");

		ta.append("............................. DATOS DE PIEZAS ..........................................\n");
		ta.append(String.format("%1$-8s", "CODIGO")
				+ String.format("%1$-25s", "NOMBRE")
				+ String.format("%1$-10s", "PRECIO")
				+ String.format("%1$-10s", "STOCK")
				+ String.format("%1$-13s", "A REPONER")
				+ String.format("%1$-11s", "DESCRIPCION")
				);

		ta.append("\n-----------------------------------------------------------------------"
				+ "---------------------------------------------\n");

		Iterator q = consulta.iterate();
		Piezas pi = new Piezas();
		String areponer;
    	while (q.hasNext()) {
			pi =  (Piezas) q.next();
            if (pi.getStock() <= 2 ) areponer="A REPONER";
            else areponer=" ";
			ta.append(String.format("%1$-8s", pi.getCodigo())
					+ String.format("%1$-25s", pi.getNombre())
					+ String.format("%1$-10s", pi.getPrecio()) 
					+ String.format("%1$-10s", pi.getStock()) 
					+ String.format("%1$-13s", areponer) 
					+ String.format("%1$-30s", pi.getDescripcion()) 
					+ "\n");
		
		}
    	ta.append("-----------------------------------------------------------------------"
				+ "---------------------------------------------\n");
    	session.close();
	} // fin listar piezas
	
	

}
