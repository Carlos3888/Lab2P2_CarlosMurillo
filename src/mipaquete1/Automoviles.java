
package mipaquete1;


public class Automoviles {
    private String marca;
    private String modelo;
    private int fabricacion;
    private String fecha;
    private String estado;
    private String numero;
    private int saldo;
    
    public void setmarca(String mar){
        marca = mar;
    }
    public void setmodelo(String mod){
        modelo = mod;
    }
    public void setfabricacion(int fab){
        fabricacion = fab;
    }
    public void setfecha(String fec){
        fecha = fec;
    }
    public void setestado(String est){
        estado = est;
    }
    public void setnumero(String num){
        numero = num;
    }
    public void setsaldo(int sal){
        saldo = sal;
    }
    
    public Automoviles(String marca, String modelo, int fabricacion, String fecha, String estado, String numero, int saldo){
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.fecha = fecha;
        this.estado = estado;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public String toString(){
        return "Marca: "+marca+"\n"+"Modelo: "+modelo+"\n"+"Año de fabricacion: "+fabricacion+"\n"+"Fecha de ingreso al taller: "+saldo+"\n"+"Estado del Automovil: "+estado+"\n"+"Numero de identidad del dueño: "+numero+"\n"+"Saldo a pagar: "+saldo+"\n";
    }
}
