package pruebas;

import com.curso.herencia.MailService;
import com.curso.herencia.Service;
import com.curso.herencia.Message;

/**
 * @author JLIL
 */
public class TestService {
    public static void main(String[] args) {
        Service s = new MailService();
        
        Message m = s.getMessage();
    }
}
