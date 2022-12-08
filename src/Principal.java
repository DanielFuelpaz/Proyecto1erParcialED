
import Gestion.GestorClientes;
import Clases.Cliente;
import Utiles.Validacion;
import java.time.LocalDate;
import java.util.Scanner;

import javax.naming.InsufficientResourcesException;
import javax.swing.text.html.FormSubmitEvent;

public class Principal {

        public static void main(String[] args) {
                String respuesta="";
                boolean validacion = false;
                Validacion val = new Validacion();
                var temp = "";
                GestorClientes GC = new GestorClientes();
                System.out.println("Bienvenido al Sistema de Clientes");
                Scanner leer = new Scanner(System.in);

                byte op;
                LocalDate fecha = LocalDate.now();
                do {
                        System.out.println(
                                        "Escoja y escriba el número que necesite: \n 1: Agregar Cliente. \n 2: Modificar Cliente. \n 3: Eliminar Cliente. \n 4: Buscar cliente \n 5: Ver los clientes \n 6: Salir");
                        op = leer.nextByte();
                        switch (op) {
                                case 1:
                                        do {
                                                Cliente c1 = new Cliente();
                                                c1.fechaVisita = fecha;
                                                GC.establecerCliente(temp,val, leer, c1, GC);
                                                System.out.println("Desea ingresar otro cliente?");
                                                respuesta = leer.next();
                                        }while(respuesta.equalsIgnoreCase("si"));
                                break;
                        case 2:
                        if(GC.size()<=0){
                                System.out.println("Usted no ha creado clientes, debe crear uno primero");
                                GC.establecerCliente(temp, val, leer, new Cliente(), GC);;
                        }
                        int n=0;
                                        for (int i = 0; i < GC.size(); i++) {
                                                System.out.println("Lista clientes");
                                                System.out.println((i + 1) + " "
                                                                + GC.get(i).getNombreYApellido());
                                        }
                                        do{
                                                System.out.println("Elija el número del cliente que desea modificar");
                                                n = leer.nextInt();  
                                                }while(n<0||n>GC.size());
                                                
                                                System.out.println("Ingrese el número de la opción que desea modificar \n 1.Cédula. \n 2.Nombre. \n 3.Apellido. \n 4.Teléfono. \n 5.Dirección. \n 6.Interés."); 
                                                int modificar = leer.nextInt();
                                                for (int i = 0; i < GC.size(); i++) {
                                                        if((n-1)==i){
                                                                        switch(modificar){
                                                                        case 1:
                                                                        System.out.println("Ingrese la nueva cédula");
                                                                        do {
                                                                                if (val.validarPersona(temp=leer.nextLine())) {
                                                                                        GC.get(i).setCedula(temp);
                                                                                        validacion = true;
                                                                                } else {
                                                                                        System.out.println("Cédula mal ingresada,intente otra vez.");
                                                                                        validacion = false;
                                                                                }
                                                                        } while (validacion == false);
                                                                                
                                                                        break;
                                                                        case 2:
                                                                        System.out.println("Ingrese el nuevo nombre");
                                                                        do {
                                                                                if (val.validarPersona(temp=leer.nextLine())){
                                                                                        GC.get(i).setNombre(temp);
                                                                                        validacion = true;
                                                                                } else {
                                                                                        System.out.println("Nombre mal ingresado, intente otra vez.");
                                                                                        validacion = false;
                                                                                }
                                                                        } while (validacion == false);
                
                                                                        break;
                                                                        case 3:
                                                                        System.out.println("Ingrese el nuevo apellido");
                                                                        do {
                                                                                if (val.validarPersona(temp=leer.nextLine())) {
                                                                                        GC.get(i).setApellido(temp);
                                                                                        validacion = true;
                                                                                } else {
                                                                                        System.out.println("Apellido mal ingresado, intente otra vez.");
                                                                                        validacion = false;
                                                                                }
                                                                        } while (validacion == false);
                                                                        break;
                                                                        case 4:
                                                                        System.out.println("Ingrese el nuevo teléfono");
                                                                        do {
                                                                                if (val.validarTelefono(temp=leer.nextLine())) {
                                                                                        GC.get(i).setTelefono(temp);
                                                                                        validacion = true;
                                                                                } else {
                                                                                        System.out.println("Teléfono mal ingresado");
                                                                                        validacion = false;
                                                                                }
                                                                        } while (validacion == false);
                                                                        break;
                                                                        case 5:
                                                                        System.out.println("Ingrese la nueva dirección");
                                                                                        GC.get(i).setDirección(temp=leer.nextLine());
                                                                                      
                                                                        break;
                                                                        case 6:
                                                                        System.out.println("Ingrese una s(Sí) u otra letra(No), dependiendo del interés del cliente");
                                                                                if ((temp =leer.nextLine()).equalsIgnoreCase("s")) {
                                                                                        GC.get(i).setInteresado(true);
                                                                                } else {
                                                                                        GC.get(i).setInteresado(false);
                                                                                        
                                                                                }
                                                                        break;
                                                                        default:
                                                                        System.out.println("Escoja un número del 1 al 6");
                                                                        break;
                                                                }
                                                                System.out.println("Tu cliente modificado ahora es: " + GC.get(n-1));
                                        
                                                        }}
                                break;
                                                        case 3:
                                        System.out.println("Lista Clientes");
                                        for (int i = 0; i < GC.size(); i++) {
                                                System.out.println((i + 1) + " "
                                                                + GC.get(i).getNombreYApellido());
                                        }
                                        do {
                                                System.out.println("Elija el número del cliente que desea eliminar");
                                                n = leer.nextInt();
                                                if (n > 0 || n < GC.size()) {
                                                        GC.remove(n - 1);
                                                        validacion=true;
                                                        System.out.println("Nueva Lista Clientes");
                                                     for (int i = 0; i < GC.size(); i++) {
                                                                System.out.println((i + 1)
                                                                                + " "
                                                                                + GC.get(i).getNombreYApellido());
                                                        }
                                                }else{
                                                        System.out.println("numero fuera de rango");
                                                        validacion=false;
                                                }

                                        } while (validacion==false);
                                        break;
                                case 4:
                                System.out.println("Lista Clientes");
                                for (int i = 0; i < GC.size(); i++) {
                                        System.out.println((i + 1) + " "
                                                        + ": "+ GC.get(i).getNombreYApellido());
                                }
                                do {
                                        System.out.println("Elija el número del cliente que desea buscar");
                                        n = leer.nextInt();
                                        if (n > 0 || n < GC.size()) {
                                                System.out.println(GC.get(n-1).toString());
                                                validacion=true;
                                        }else{
                                                System.out.println("numero fuera de rango");
                                                validacion=false;
                                        }

                                } while (validacion==false);
                                        break;

                                        case 5:
                                        GC.Listar();
                                        break;
                                        case 6:
                                        System.out.println("Adiós");
                                        break;
                                default:
                                        System.out.println("Las Opciones son de 1 a 6");
                                        break;
                        }
                        
        }while(op!=6);

                // System.out.println(GC.search(0));
                // GC.eraseFirstClient();
                // GC.eraseClient(0);
                // GC.Listar();
        }
}
