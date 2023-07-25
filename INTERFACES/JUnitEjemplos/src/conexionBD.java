package conexion;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class conexionBD {
  // final es una variable a la que no se puede asignar un valor después de inicializarla
 // private static final SessionFactory sessionFactory;
  private static final SessionFactory miconexion;
  
  static {
      try {   
        // Crea la SessionFactory de hibernate.cfg.xml                    
    	  miconexion= new Configuration().configure().buildSessionFactory();           
        } catch (Throwable ex) {
           // Throwable es la clase base d las excepciones.
        System.err.println("INICIO DE SessionFactory fallado.." + ex);
        throw new ExceptionInInitializerError(ex);
       // esta excepción se lanza cuando hay un error al inicializar una variable estática
         }
     }
     public static SessionFactory getSessionFactory() {
        return miconexion;
     }
}

