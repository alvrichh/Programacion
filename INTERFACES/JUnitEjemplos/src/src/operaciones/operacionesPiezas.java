package operaciones;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

import  conexion.*;
import  datos.*;

import org.hibernate.JDBCException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class operacionesPiezas {
//////////////////////////////////////////////////////////////
	
	public void borrarpieza(JTextField codpieza, JTextField nombrepieza, JTextField preciopieza,
			JTextField descripcionpieza, JTextField stock, JLabel mensaje)
{
	SessionFactory sesion = conexionBD.getSessionFactory();		
    Session session = sesion.openSession();		
    Piezas pi=new Piezas();
    pi=buscarpieza(codpieza);
	if (pi==null) {			
		System.out.println("PIEZA no existe: " + codpieza.getText().toString() );
		mensaje.setText("PIEZA : " + codpieza.getText().toString() + " NO EXISTE, no se puede borrar ");
		//nombrepieza.setText(" ") ;
		//preciopieza.setText(" ");
		//descripcionpieza.setText(" ");
		//stock.setText(" ");
	}
	else
	{  Transaction tx =session.beginTransaction();
	try {
	    System.out.println("PIEZA LOCALIZADA: " + codpieza.getText().toString() );
		session.delete(pi);
		tx.commit();
		mensaje.setText("PIEZA : " + codpieza.getText().toString() + " BORRADA. ");
		nombrepieza.setText(" ") ;
		preciopieza.setText(" ");
		descripcionpieza.setText(" ");
		stock.setText(" ");
    	}catch (JDBCException j)
     	{
    		mensaje.setText("PIEZA : " + codpieza.getText().toString() + ", NO SE PUEDE BORRAR TIENE REGISTROS RELACIONADOS. ");
     	}
     	}
	session.close();	
	}	
	
///////////////////////////////////////////////////////////////////	
public void consultarpieza(JTextField codpieza, JTextField nombrepieza, JTextField preciopieza,
			JTextField descripcionpieza, JTextField stock, JLabel mensaje)
{
	SessionFactory sesion = conexionBD.getSessionFactory();		
    Session session = sesion.openSession();		
    Piezas pi=new Piezas();
    pi=buscarpieza(codpieza);
	if (pi==null) {			
		System.out.println("PIEZA no existe: " + codpieza.getText().toString() );
		mensaje.setText("PIEZA : " + codpieza.getText().toString() + " NO EXISTE ");
		nombrepieza.setText(" ") ;
		preciopieza.setText(" ");
		descripcionpieza.setText(" ");
		stock.setText(" ");
	}
	else
	{
		 System.out.println("PIEZA LOCALIZADA: " + codpieza.getText().toString() );
		// mensaje.setText("PIEZA : " + codpieza.getText().toString() + " LOCALIZADA ");
		  codpieza.setText(pi.getCodigo());
		  nombrepieza.setText(pi.getNombre()) ;
		  preciopieza.setText(pi.getPrecio().toString());
		  descripcionpieza.setText(pi.getDescripcion());
		  stock.setText(pi.getStock().toString());
		  mensaje.setText("PIEZA : " + codpieza.getText().toString() + " LOCALIZADA ");
	}
	session.close();
	}	
/////////////////////////////////////////////////////////////////////////
public Piezas buscarpieza(JTextField codpieza)
	{
	     	SessionFactory sesion = conexionBD.getSessionFactory();		
		    Session session = sesion.openSession();		
		    Piezas pie=new Piezas();
			//cargo los datos del departamento 10	
			pie = (Piezas) session.get(Piezas.class, codpieza.getText().toString());	
			if (pie==null) {			
					 System.out.println("PIEZA no existe: " + codpieza.getText().toString() );
					 //mensaje.setText("PIEZA : " + codpieza.getText().toString() + " NO EXISTE ");
				}
				else
				{
					 System.out.println("PIEZA SI existe: " + codpieza.getText().toString() );
					// mensaje.setText("PIEZA : " + codpieza.getText().toString() + " LOCALIZADA ");
				}
 
		    session.close();	
		    return pie;
	}
/////////////////////////////////////////////////////////////////////////
public void versiguientepieza(JTextField codpieza, JTextField nombrepieza, JTextField preciopieza,
			JTextField descripcionpieza, JTextField stock, JLabel mensaje)
			{
	     	SessionFactory sesion = conexionBD.getSessionFactory();		
		    Session session = sesion.openSession();		
			Query consulta = session.createQuery("from Piezas order by codigo");
			
			Iterator q = consulta.iterate();
			boolean salir = true;
			Piezas pi = new Piezas();
			mensaje.setText("--------------------------------------------------------");
			System.out.println(" --------------- " );
	    	while (q.hasNext() && salir) {
	    	    pi =  (Piezas) q.next();
				System.out.println(" pieza: " + pi.getCodigo());
				if  (codpieza.getText().length()==0 || buscarpieza(codpieza) == null ) 
				{    // carga el primero
					    codpieza.setText(pi.getCodigo());
					    nombrepieza.setText(pi.getNombre()) ;
					    preciopieza.setText(pi.getPrecio().toString());
						descripcionpieza.setText(pi.getDescripcion());
						stock.setText(pi.getStock().toString());
						salir=false;
				
				}
				else{
				if (pi.getCodigo().equalsIgnoreCase(codpieza.getText().toString()))
				{ // encontrada la pieza que está en la pantalla, cargo la siguiente
					if (q.hasNext()) 
					{   pi =  (Piezas) q.next();
					    codpieza.setText(pi.getCodigo());
					    nombrepieza.setText(pi.getNombre()) ;
					    preciopieza.setText(pi.getPrecio().toString());
						descripcionpieza.setText(pi.getDescripcion());
						stock.setText(pi.getStock().toString());
						salir=false;
					}
					
				}
				}
				
	    	}
	    	session.close();
			}

/////////////////////////////////////////////////////////////////////////
public void veranterior(JTextField codpieza, JTextField nombrepieza, JTextField preciopieza,
JTextField descripcionpieza, JTextField stock, JLabel mensaje)
{
	SessionFactory sesion = conexionBD.getSessionFactory();		
	Session session = sesion.openSession();		
	Query consulta = session.createQuery("from Piezas order by codigo desc");
	mensaje.setText("--------------------------------------------------------");
	List <Piezas> lista = consulta.list();

	if (lista.size()>0)
	{
	   Iterator q = lista.iterator();
     	boolean salir = true;
    	Piezas pi = new Piezas();
    	System.out.println(" --------------- " );

	while (q.hasNext() && salir) {
		pi =  (Piezas) q.next();
		System.out.println(" pieza: " + pi.getCodigo());
		if  (codpieza.getText().length()==0 || buscarpieza(codpieza) == null ) 
		{    // carga el primero
			codpieza.setText(pi.getCodigo());
			nombrepieza.setText(pi.getNombre()) ;
			preciopieza.setText(pi.getPrecio().toString());
			descripcionpieza.setText(pi.getDescripcion());
			stock.setText(pi.getStock().toString());
			salir=false;
		
		}
		else{
			if (pi.getCodigo().equalsIgnoreCase(codpieza.getText().toString()))
			{ // encontrada la pieza que está en la pantalla, cargo la siguiente
				if (q.hasNext()) 
				{
				pi =  (Piezas) q.next();
				codpieza.setText(pi.getCodigo());
				nombrepieza.setText(pi.getNombre()) ;
				preciopieza.setText(pi.getPrecio().toString());
				descripcionpieza.setText(pi.getDescripcion());
				stock.setText(pi.getStock().toString());
				salir=false;
				}
			}
		}
	
	}
	} // if lista.size
	session.close();
}
////////////////////////////////////////////////////

public void listarpiezas( JTextArea ta) {
		
		SessionFactory sesion = conexionBD.getSessionFactory();		
		Session session = sesion.openSession();		
	    //  Transaction tx =session.beginTransaction();
	
		Font f = new Font("Courier", Font.TRUETYPE_FONT, 10);
		ta.setFont(f);

		ta.setText("");
		Query consulta = session.createQuery("from Piezas order by codigo");

		ta.append("............................. DATOS DE PIEZAS ..........................................\n");
		ta.append(String.format("%1$-8s", "CODIGO")
				+ String.format("%1$-25s", "NOMBRE")
				+ String.format("%1$-10s", "PRECIO")
				+ String.format("%1$-10s", "STOCK")
				+ String.format("%1$-11s", "DESCRIPCION")
				);

		ta.append("\n-----------------------------------------------------------------------"
				+ "------------------------------------\n");

		Iterator q = consulta.iterate();
		Piezas pi = new Piezas();
    	while (q.hasNext()) {
			pi =  (Piezas) q.next();

			ta.append(String.format("%1$-8s", pi.getCodigo())
					+ String.format("%1$-25s", pi.getNombre())
					+ String.format("%1$-10s", pi.getPrecio()) 
					+ String.format("%1$-10s", pi.getStock()) 
					+ String.format("%1$-30s", pi.getDescripcion()) 
					+ "\n");
		
		}
    	ta.append("-----------------------------------------------------------------------"
				+ "------------------------------------\n");
    	session.close();
	} // fin listar piezas
	
	

}
