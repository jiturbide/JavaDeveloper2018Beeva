package com.curso.gui;

import java.util.Arrays;

/**
 * Crear una clase ConexionIP4 a la que se le pueda proporcionar 3 Objetos IP que seran miembros internos
 * Se daran valores a cada IP usando el metodo setIp(TipoIpEnum, seg01, seg02, seg03, seg04)
 * Se devolvera la IP con el metodo getIp(TipoIpEnum) : Ip
 * Cuando se liste toString de la clase debe imprimir el texto que corresponda
   
   IPv4 Address: 172.20.1.45
   Subnet Mask : 255.255.255.0
   Gateway: 172.20.1.1
    
 * @author jose.iturbide
 */
public class ConexionIP4 {
    public enum TipoIpEnum{IPV4, MASK, GATEWAY};
    private Ip [] ips = {null, null, null};
    
    
    class Ip {
        private int ip[] = {0,0,0,0};
        private TipoIpEnum tipoip; 
        public Ip(TipoIpEnum tipo, int a, int b, int c, int d) {
            this.ip[0]=a; this.ip[1]=b; this.ip[2]=c; this.ip[3]=d;
            this.tipoip = tipo;
        }
        public int getIp(int pos) { return this.ip[pos]; }
        //public int getIp0() { return this.ip[0]; }
        public String getIp() { return Arrays.toString(ip); }
                
        @Override
        public String toString() {
            return "Ip{" + "ip=" + ip + '}';
        }
    } // Fin IP
    
    public void setIp(TipoIpEnum tipo, int a, int b, int c, int d) {
        Ip ip = new Ip(tipo, a, b, c, d);
        
        switch(tipo) {
            default:
                throw new IllegalStateException("Caso no definido");
            case IPV4:
                ips[0] = ip; break;
            case MASK:
                ips[1] = ip; break;
            case GATEWAY:
                ips[2] = ip; break;                
        }
    } //Fin SetIP
    
    public String toString() {
        return new StringBuffer().append(ips[0]).append(" ").
                append(ips[1]).append(" ").
                append(ips[2]).append("\n").toString();
    }
    
    public static void main(String[] args) {
        
          ConexionIP4 cnx = new ConexionIP4();
          cnx.setIp(TipoIpEnum.IPV4, 172, 20, 1, 45);
          cnx.setIp(TipoIpEnum.MASK, 255,255,255,0);
          cnx.setIp(TipoIpEnum.GATEWAY, 172,20,1,1);
        
          Ip ip = cnx.getIp(TipoIpEnum.IPV4); //Ip es inmutable, sin embargo tiene metodos set()
          System.out.println(ip);
          System.out.println(cnx);
          
    }
}
