package pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JLIL
 */
public class TimerService_ implements IProgramable_, ILoggeable_{

    @Override
    public ArrayList init() {
        System.out.println("");
        return null;
    }
}

interface IProgramable_ {
    default List init(){return null;};
}

interface ILoggeable_ {
    default List init(){return null;};
}
