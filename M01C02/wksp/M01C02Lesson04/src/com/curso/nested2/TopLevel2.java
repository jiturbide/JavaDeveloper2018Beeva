package com.curso.nested2;

//import com.curso.nested.TopLevel.MyStatic;
import static com.curso.nested.TopLevel.MyStatic;

public class TopLevel2 {
    public static void main(String[] args) {
        //TopLevel.MyStatic ms = new TopLevel.MyStatic();
        MyStatic ms = new MyStatic();
        
        class X implements Parametrizable{
            public void parametrizar() {
            }
        }
    }
    
    @FunctionalInterface
    public interface Parametrizable {
        void parametrizar();
    }
    
    public static interface Clonable{}
}
