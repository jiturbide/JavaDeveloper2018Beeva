package com.curso;

public class TestMatriz {
    public static void main(String[] args) {
        
        aqui: 
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if( j==5) { break aqui ; }
                System.out.printf("%2d ", i*j);
            }
            System.out.printf("%n");
        }
                
        
        
        
        
    }
}
