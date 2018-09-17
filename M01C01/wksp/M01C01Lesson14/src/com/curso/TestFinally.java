package com.curso;

public class TestFinally {
    public static void main(String[] args) {
        TestFinally t = new TestFinally();
        System.out.println("retorno: " + t.doIt());
    }
    
    public int doIt() {
        String msg = null;
        int result = 0;
        try{
           //msg.toUpperCase();
           result = 1;
           //return result;
            System.exit(-1);
        } catch(Exception e) {
            return -1;
        } finally {
            //return 77;
        }     
        return result;
        
    }
    
}


