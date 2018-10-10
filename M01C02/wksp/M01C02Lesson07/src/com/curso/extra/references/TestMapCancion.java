package com.curso.extra.references;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapCancion {
    public static void main(String[] args) {
        Map<Cancion, String>mapa = new HashMap<>();
        
        List <Cancion> list = Cancion.demoList();
        mapa.put(list.get(0), list.get(0).getNombre());
        mapa.put(list.get(1), list.get(0).getNombre());
        mapa.put(list.get(2), list.get(0).getNombre());
        mapa.put(list.get(3), list.get(0).getNombre());
        mapa.put(list.get(4), list.get(0).getNombre());
        mapa.put(list.get(5), list.get(0).getNombre());
        
        System.out.println(mapa);
    }
}
