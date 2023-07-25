package operaciones;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import  conexion.*;
import  datos.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class operacionesProveedores {
	///////////////////////////////////////////////
	public Proveedores buscarproveedor(JTextField codprov, JLabel mensaje)
	{
	     	SessionFactory sesion = conexionBD.getSessionFactory();		
		    Session session = sesion.openSession();		
		    Proveedores pie=new Proveedores();
		
			pie = (Proveedores) session.get(Proveedores.class, codprov.getText().toString());	
			if (pie==null) {			
					 System.out.println("PROVEEDOR no existe: " + codprov.getText().toString() );
					 mensaje.setText("PROVEEDOR : " + codprov.getText().toString() + " NO EXISTE ");
				}
				else
				{
					 System.out.println("PROVEEDOR SI existe: " + codprov.getText().toString() );
					 mensaje.setText("PROVEEDOR : " + codprov.getText().toString() + " NO EXISTE ");
				}
 
		    session.close();	
		    return pie;
	}
	
	
	////////////////////////////////////////////////
	public void listarproveedores( JTextArea ta) {
		
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
	    //  Transaction tx =session.beginTransaction();
	
		Font f = new Font("Courier", Font.TRUETYPE_FONT, 10);
		ta.setFont(f);

		ta.setText("");
		Query consulta = session.createQuery("from Proveedores");

		ta.append("............................ DATOS DE PROVEEDORES ..........................................\n");
		ta.append(String.format("%1$-8s", "CODIGO")
				+ String.format("%1$-25s", "NOMBRE")
				+ String.format("%1$-25s", "APELLIDOS")
				+ String.format("%1$-45s", "DIRECCIÓN")
				+ String.format("%1$-11s", "COMISIÓN" )
				);

		ta.append("\n------------------------------------------------------------------------------"
    			+ "-----------------------------------\n");
		Iterator q = consulta.iterate();
		Proveedores pi = new Proveedores();
    	while (q.hasNext()) {
			pi =  (Proveedores) q.next();

			ta.append(String.format("%1$-8s", pi.getCodigo())
					+ String.format("%1$-25s", pi.getNombre())
					+ String.format("%1$-25s", pi.getApellidos()) 
					+ String.format("%1$-45s", pi.getDireccion()) 
					+ String.format("%1$-11s", pi.getComision()) 
					+ "\n");
		
		}
    	ta.append("------------------------------------------------------------------------------"
    			+ "-----------------------------------\n");
    	session.close();
	} // fin listar piezas
	
	

}
