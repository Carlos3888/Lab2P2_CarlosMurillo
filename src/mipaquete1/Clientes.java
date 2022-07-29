
package mipaquete1;


public class Clientes {
    private String nombre;
    private int edad;
    private String numero;
    private int saldo;
    
    public void setnombre(String nom){
        nombre = nom;
    }
    public void setedad(int ed){
        edad = ed;
    }
    public void setnumero(String num){
        numero = num;
    }
    public void setsaldo(int sal){
        saldo = sal;
    }
    
    public Clientes(String nombre, int edad, String numero, int saldo){
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
        this.saldo = saldo;
    }
    public String toString(){
        return "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Numero de identidad: "+numero+"\n"+"Saldo a pagar: "+saldo+"\n";
    }

}
