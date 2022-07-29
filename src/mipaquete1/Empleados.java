
package mipaquete1;


public class Empleados {
    private String nombre;
    private int edad;
    private int sueldo;
    private String numero;
    private String estado;
    
    public void setnombre(String nom){
        nombre = nom;
    }
    public void setedad(int ed){
        edad = ed;
    }
    public void setsueldo(int sue){
        sueldo = sue;
    }
    public void setnumero(String num){
        numero = num;
    }
    public void setestado(String est){
        estado = est;
    }
    public Empleados(String nombre, int edad, int sueldo, String numero, String estado){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.numero = numero;
        this.estado = estado;
    }
    public String toString(){
        return "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Sueldo: "+sueldo+"\n"+"Numero de RRHH: "+numero+"\n"+"Estado: "+estado+"\n";
    }
}
