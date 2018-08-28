package pruebas;

import com.curso.herencia.ServicioHTTP;
import com.curso.herencia.ServicioHTTP.Logger;
import com.curso.herencia.ServicioHTTP.TipoError;

/**
 * @author JLIL
 */
public class TestServicioHTTP {
    public static void main(String[] args) {
        ServicioHTTP http = new ServicioHTTP();
        http.init();
        
        ServicioHTTP.TipoError te = http.new TipoError();  //1
        System.out.println("Tipo Error: " + te.getTipo());
        
        ServicioHTTP.TipoError te2 = new ServicioHTTP().new TipoError(); //2
        
        System.out.println("Version: " + ServicioHTTP.VERSION);  
        System.out.println("MAx TipoError: " + TipoError.NUM_MAX);  
        
        Logger.debug("Mensaje");
        
        Logger l = new ServicioHTTP.Logger();
        l.fatal("Kernel panic!");
        
    }
}
