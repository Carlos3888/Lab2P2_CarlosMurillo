
package lab2p2_carlosmurillo_12211240;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import mipaquete1.Automoviles;
import mipaquete1.Clientes;
import mipaquete1.Empleados;

public class Lab2P2_CarlosMurillo_12211240 {
    
    public static void main(String[] args) {
        boolean desicion = true;
        Scanner lea = new Scanner(System.in);
        System.out.println("ADMINISTRADOR");
        System.out.println("Iniciar Sesión");
        System.out.print("Usuario: ");
        String usuario = lea.next();
        System.out.print("Contraseña: ");
        String contra = lea.next();
        if(usuario.equals("admin") && contra.equals("admin1234")){
            while(desicion == true){
                ArrayList lista1 = new ArrayList();
                ArrayList lista2 = new ArrayList();
                ArrayList lista3 = new ArrayList();
                
                System.out.println("=====MENU=====");
                System.out.println("1- Empleados");
                System.out.println("2- Clientes");
                System.out.println("3- Carros");
                System.out.println("4- Salir");
                System.out.print("Ingrese la opcion que desea: ");
                int opcion = lea.nextInt();
                switch(opcion){
                    case 1:{
                        boolean desi1 = true;
                        while(desi1 == true){
                            System.out.println();
                            System.out.println("=====MENU_EMPLEADOS=====");
                            System.out.println("1- Agregar un empleado");
                            System.out.println("2- Listar empleados");
                            System.out.println("3- Modificar empleados");
                            System.out.println("4- Eliminar empleados");
                            System.out.println("5- Salir");
                            System.out.print("Ingrese la opcion que desea: ");
                            int opcion_empleados = lea.nextInt();
                            System.out.println();
                            switch(opcion_empleados){
                                case 1:{
                                    System.out.print("Nombre: ");
                                    String nombre = lea.next();
                                    System.out.print("Edad: ");
                                    int edad = lea.nextInt();
                                    System.out.print("Sueldo: ");
                                    int sueldo = lea.nextInt();
                                    System.out.print("Numero de RRHH: ");
                                    String numero = lea.next();
                                    System.out.print("Estado: ");
                                    String estado = lea.next();
                                    lista1.add(new Empleados(nombre, edad, sueldo, numero, estado));
                                    System.out.println();
                                }break;
                                case 2:{
                                    String salida="";
                                    for (Object object : lista1) {
                                        if (object instanceof Empleados) {
                                            salida+=lista1.indexOf(object)+"- "+object+"\n";
                                        }
                                    }
                                    System.out.println(salida);
                                }break;
                                case 3:{
                                    int posi;
                                    
                                    System.out.print("Posicion del empleado: ");
                                    posi = lea.nextInt();
                                    System.out.println("Que quiere modificar: ");
                                    System.out.println("1) Nombre");
                                    System.out.println("2) Edad");
                                    System.out.println("3) Sueldo");
                                    System.out.println("4) Numero de RRHH");
                                    System.out.println("5) Estado");
                                    System.out.print("Ingrese la opcion que desea: ");
                                    int opcion1 = lea.nextInt();
                                    switch(opcion1){
                                        case 1:{
                                            String nom;
                                            if (posi <= lista1.size()-1 && lista1.get(posi) instanceof Empleados) {
                                                System.out.print("Nombre: ");
                                                nom=lea.next();
                                                ( (Empleados)lista1.get(posi) ).setnombre(nom);
                                                System.out.println("Nombre modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 2:{
                                            int ed;
                                            if (posi <= lista1.size()-1 && lista1.get(posi) instanceof Empleados) {
                                                System.out.print("Edad: ");
                                                ed=lea.nextInt();
                                                ( (Empleados)lista1.get(posi) ).setedad(ed);
                                                System.out.println("Edad modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 3:{
                                            int sue;
                                            if (posi <= lista1.size()-1 && lista1.get(posi) instanceof Empleados) {
                                                System.out.print("Sueldo: ");
                                                sue=lea.nextInt();
                                                ( (Empleados)lista1.get(posi) ).setsueldo(sue);
                                                System.out.println("Sueldo modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 4:{
                                            String num;
                                            if (posi <= lista1.size()-1 && lista1.get(posi) instanceof Empleados) {
                                                System.out.print("Numero de RRHH: ");
                                                num=lea.next();
                                                ( (Empleados)lista1.get(posi) ).setnumero(num);
                                                System.out.println("Numero de RRHH modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 5:{
                                            String est;
                                            if (posi <= lista1.size()-1 && lista1.get(posi) instanceof Empleados) {
                                                System.out.print("Estado: ");
                                                est=lea.next();
                                                ( (Empleados)lista1.get(posi) ).setestado(est);
                                                System.out.println("Estado modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        default:{
                                            System.out.println("opcion incorrecta");
                                        }break;
                                    }
                                }break;
                                case 4:{
                                    System.out.print("Posicion del empleado que desea eliminar: ");
                                    int num = lea.nextInt();
                                    lista1.remove(num);
                                }break;
                                case 5:{
                                    desi1 = false;
                                }break;
                                default:{
                                    System.out.println("Opcion incorrecta");
                                }break;
                            }
                        }
                    }break;
                    case 2:{
                        boolean desi1 = true;
                        while(desi1 == true){
                            System.out.println();
                            System.out.println("=====MENU_CLIENTES=====");
                            System.out.println("1- Agregar un cliete");
                            System.out.println("2- Listar clientes");
                            System.out.println("3- Modificar clientes");
                            System.out.println("4- Eliminar clientes");
                            System.out.println("5- Salir");
                            System.out.print("Ingrese la opcion que desea: ");
                            int opcion_clientes = lea.nextInt();
                            System.out.println();
                            switch(opcion_clientes){
                                case 1:{
                                    System.out.print("Nombre: ");
                                    String nombre = lea.next();
                                    System.out.print("Edad: ");
                                    int edad = lea.nextInt();
                                    System.out.print("Numero de identidad: ");
                                    String numero = lea.next();
                                    System.out.print("Saldo a pagar: ");
                                    int saldo = 0;
                                    lista2.add(new Clientes(nombre, edad, numero, saldo));
                                    System.out.println();
                                }break;
                                case 2:{
                                    String salida="";
                                    for (Object object : lista2) {
                                        if (object instanceof Clientes) {
                                            salida+=lista2.indexOf(object)+"- "+object+"\n";
                                        }
                                    }
                                    System.out.println(salida);
                                }break;
                                case 3:{
                                    int posi;
                                    
                                    System.out.print("Posicion del clientes: ");
                                    posi = lea.nextInt();
                                    System.out.println("Que quiere modificar: ");
                                    System.out.println("1) Nombre");
                                    System.out.println("2) Edad");
                                    System.out.println("3) Numero de identidad");
                                    System.out.println("4) Saldo a pagar");
                                    System.out.print("Ingrese la opcion que desea: ");
                                    int opcion1 = lea.nextInt();
                                    switch(opcion1){
                                        case 1:{
                                            String nom;
                                            if (posi <= lista2.size()-1 && lista2.get(posi) instanceof Clientes) {
                                                System.out.print("Nombre: ");
                                                nom=lea.next();
                                                ( (Clientes)lista2.get(posi) ).setnombre(nom);
                                                System.out.println("Nombre modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 2:{
                                            int ed;
                                            if (posi <= lista2.size()-1 && lista2.get(posi) instanceof Clientes) {
                                                System.out.print("Edad: ");
                                                ed=lea.nextInt();
                                                ( (Clientes)lista2.get(posi) ).setedad(ed);
                                                System.out.println("Edad modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 3:{
                                            String num;
                                            if (posi <= lista2.size()-1 && lista2.get(posi) instanceof Clientes) {
                                                System.out.print("Numero de identidad: ");
                                                num=lea.next();
                                                ( (Clientes)lista2.get(posi) ).setnumero(num);
                                                System.out.println("Numero de identidad modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 4:{
                                            int sal;
                                            if (posi <= lista2.size()-1 && lista2.get(posi) instanceof Clientes) {
                                                System.out.print("Saldo a pagar: ");
                                                sal=lea.nextInt();
                                                ( (Clientes)lista2.get(posi) ).setsaldo(sal);
                                                System.out.println("Saldo a pagar modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        default:{
                                            System.out.println("opcion incorrecta");
                                        }break;
                                    }
                                }break;
                                case 4:{
                                    System.out.print("Posicion del cliente que desea eliminar: ");
                                    int num = lea.nextInt();
                                    lista2.remove(num);
                                }break;
                                case 5:{
                                    desi1 = false;
                                }break;
                                default:{
                                    System.out.println("Opcion incorrecta");
                                }break;
                            }
                        }
                    }break;
                    case 3:{
                        boolean desi1 = true;
                        while(desi1 == true){
                            System.out.println();
                            System.out.println("=====MENU_AUTOMOVILES=====");
                            System.out.println("1- Agregar un automovil");
                            System.out.println("2- Listar automoviles");
                            System.out.println("3- Modificar automovil");
                            System.out.println("4- Eliminar automovil");
                            System.out.println("5- Salir");
                            System.out.print("Ingrese la opcion que desea: ");
                            int opcion_clientes = lea.nextInt();
                            System.out.println();
                            switch(opcion_clientes){
                                case 1:{
                                    System.out.print("Nombre: ");
                                    String nombre = lea.next();
                                    System.out.print("Modelo: ");
                                    String modelo = lea.next();
                                    System.out.print("Año de fabricacion: ");
                                    int fabricacion = lea.nextInt();
                                    System.out.print("fecha de ingreso al taller: ");
                                    String fecha = lea.next();
                                    System.out.println("Estado del automovil: ");
                                    System.out.println("1) En espera de entrar a reparación: ");
                                    System.out.println("2) En reparación: ");
                                    System.out.println("3) En espera de pago de reparación: ");
                                    System.out.println("4) Saldo pagado: ");
                                    System.out.println("5) En espera de ser entregado: ");
                                    System.out.println("6) Entregado: ");
                                    System.out.println("Ingrese la opcion: ");
                                    String estado = "";
                                    int opcion_1 = lea.nextInt();
                                    switch(opcion_1){
                                        case 1:{
                                            estado = "En espera de entrar a reparación";
                                        }break;
                                        case 2:{
                                            estado = "En reparación";
                                        }break;
                                        case 3:{
                                            estado = "En espera de pago de reparación";
                                        }break;
                                        case 4:{
                                            estado = "Saldo pagado";
                                        }break;
                                        case 5:{
                                            estado = "En espera de ser entregado";
                                        }break;
                                        case 6:{
                                            estado = "Entregado";
                                        }break;
                                        default:{
                                            estado = "Desconosido";
                                        }break;
                                    }
                                    System.out.print("Numero de identidad del dueño: ");
                                    String numero = lea.next();
                                    
                                    int saldo = 0;
                                    if (opcion_1 == 3){
                                        System.out.print("Saldo a pagar: ");
                                        saldo = lea.nextInt();
                                    }
                                    lista3.add(new Automoviles(nombre, modelo, fabricacion, fecha, estado, numero, saldo));
                                    System.out.println();
                                }break;
                                case 2:{
                                    String salida="";
                                    for (Object object : lista3) {
                                        if (object instanceof Automoviles) {
                                            salida+=lista3.indexOf(object)+"- "+object+"\n";
                                        }
                                    }
                                    System.out.println(salida);
                                }break;
                                case 3:{
                                    int posi;
                                    
                                    System.out.print("Posicion del clientes: ");
                                    posi = lea.nextInt();
                                    System.out.println("Que quiere modificar: ");
                                    System.out.println("1) Marca");
                                    System.out.println("2) Modelo");
                                    System.out.println("3) Año de fabricacion");
                                    System.out.println("4) Fecha de ingreso al taller");
                                    System.out.println("5) Estado del automovil: ");
                                    System.out.println("6) Numero de identidad del dueño: ");
                                    System.out.println("7) Saldo a pagar: ");
                                    System.out.print("Ingrese la opcion que desea: ");
                                    int opcion1 = lea.nextInt();
                                    switch(opcion1){
                                        case 1:{
                                            String mar;
                                            if (posi <= lista3.size()-1 && lista3.get(posi) instanceof Automoviles) {
                                                System.out.print("Marca: ");
                                                mar=lea.next();
                                                ( (Automoviles)lista3.get(posi) ).setmarca(mar);
                                                System.out.println("Marca modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 2:{
                                            String mod;
                                            if (posi <= lista3.size()-1 && lista3.get(posi) instanceof Automoviles) {
                                                System.out.print("Modelo: ");
                                                mod=lea.next();
                                                ( (Automoviles)lista3.get(posi) ).setmodelo(mod);
                                                System.out.println("Modelo modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 3:{
                                            int fab;
                                            if (posi <= lista3.size()-1 && lista3.get(posi) instanceof Automoviles) {
                                                System.out.print("Año de fabricacion: ");
                                                fab=lea.nextInt();
                                                ( (Automoviles)lista3.get(posi) ).setfabricacion(fab);
                                                System.out.println("Año de fabricacion modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 4:{
                                            String fec;
                                            if (posi <= lista3.size()-1 && lista3.get(posi) instanceof Automoviles) {
                                                System.out.print("Fecha de ingreso al taller: ");
                                                fec=lea.next();
                                                ( (Automoviles)lista3.get(posi) ).setfecha(fec);
                                                System.out.println("Fecha de ingreso al taller modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 5:{
                                            String est;
                                            if (posi <= lista3.size()-1 && lista3.get(posi) instanceof Automoviles) {
                                                System.out.println("Estado del automovil: ");
                                                System.out.println("1) En espera de entrar a reparación: ");
                                                System.out.println("2) En reparación: ");
                                                System.out.println("3) En espera de pago de reparación: ");
                                                System.out.println("4) Saldo pagado: ");
                                                System.out.println("5) En espera de ser entregado: ");
                                                System.out.println("6) Entregado: ");
                                                System.out.println("Ingrese la opcion: ");
                                                int estado = lea.nextInt();
                                                est=lea.next();
                                                ( (Automoviles)lista3.get(posi) ).setestado(est);
                                                System.out.println("Estado del automovil modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 6:{
                                            String num;
                                            if (posi <= lista3.size()-1 && lista3.get(posi) instanceof Automoviles) {
                                                System.out.print("Numero de identidad del dueño: ");
                                                num=lea.next();
                                                ( (Automoviles)lista3.get(posi) ).setnumero(num);
                                                System.out.println("Numero de identidad del dueño modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        case 7:{
                                            int sal;
                                            if (posi <= lista3.size()-1 && lista3.get(posi) instanceof Automoviles) {
                                                System.out.print("Saldo a pagar: ");
                                                sal=lea.nextInt();
                                                ( (Automoviles)lista3.get(posi) ).setsaldo(sal);
                                                System.out.println("Saldo a pagar modificado exitosamente");
                                            }else{
                                                System.out.println("No se cumplen los requisitos");
                                            }
                                        }break;
                                        
                                        default:{
                                            System.out.println("opcion incorrecta");
                                        }break;
                                    }
                                }break;
                                case 4:{
                                    System.out.print("Posicion del automovil que desea eliminar: ");
                                    int num = lea.nextInt();
                                    lista3.remove(num);
                                }break;
                                case 5:{
                                    desi1 = false;
                                }break;
                                default:{
                                    System.out.println("Opcion incorrecta");
                                }break;
                            }
                        }
                    }break;
                    case 4:{
                        desicion = false;
                    }break;
                    default:{
                        System.out.println("Opcion incorrecta");
                    }break;
                }
            }
        }
        else{
            System.out.println("");
        }
    }
    
}
