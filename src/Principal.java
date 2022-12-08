
import Gestion.GestorClientes;
import Clases.Cliente;
import Utiles.Validacion;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {
                String respuesta;
                boolean validacion = false;
                Validacion val = new Validacion();
                String temp = "";
                GestorClientes GC = new GestorClientes();
                System.out.println("Bienvenido al Sistema de Clientes");
                Scanner leer = new Scanner(System.in);

                int op;
                LocalDate fecha = LocalDate.now();
                do {
                        System.out.println(
                                        "Escoja y escriba el número que necesite: \n 1: Agregar Cliente. \n 2: Modificar Cliente. \n 3: Eliminar Cliente. \n 4: Buscar cliente \n 5: Ver los clientes \n 6: Salir");
                        op = leer.nextInt();
                        switch (op) {
                                case 1:
                                        do {
                                                Cliente c1 = new Cliente();
                                                c1.fechaVisita = fecha;
                                                GC.establecerCliente(temp,val, leer, c1, GC);
                                                System.out.println("Desea ingresar otro cliente. Escriba si o no?");
                                                respuesta = leer.next();
                                        }while(respuesta.equalsIgnoreCase("si"));
                                break;
                        case 2:
                        if(GC.size()==0){
                                System.out.println("Usted no ha creado clientes, debe crear uno primero");
                                GC.establecerCliente(temp, val, leer, new Cliente(), GC);;
                        }
                        int n=0;
                        System.out.println("Lista clientes");
                                        for (int i = 0; i < GC.size(); i++) {
                                                System.out.println((i + 1) + " "
                                                                + GC.get(i).getNombreYApellido());
                                        }
                                        do {
                                                System.out.println("Elija el número del cliente que desea modificar");
                                                n = leer.nextInt();
                                        } while (n < 0 || n > GC.size());

                                        System.out.println(
                                                        "Ingrese el número de la opción que desea modificar \n 1.Cédula. \n 2.Nombre. \n 3.Apellido. \n 4.Teléfono. \n 5.Dirección. \n 6.Interés.");
                                        int modificar = leer.nextInt();
                                        for (int i = 0; i < GC.size(); i++) {
                                                if ((n - 1) == i) {
                                                        switch (modificar) {
                                                                case 1:
                                                                        System.out.println("Ingrese la nueva cédula");
                                                                        do {
                                                                                temp = leer.nextLine();
                                                                                if(GC.size()>0){
                                                                                            if (val.validarCedula(temp)&& !GC.get(i).getCedula().equals(temp)) {
                                                                                            GC.get(i).setCedula(temp);
                                                                                            validacion = true;
                                                                                            return;
                                                                                        }else if(GC.get(i).getCedula().equals(temp)){
                                                                                            System.out.println("Número de teléfono mal ingresado o ya existe, ingrese otro número de teléfono");
                                                                                            validacion = false;
                                                                                            break;
                                                                                        
                                                                                    }
                                                                                }else{
                                                                                if (val.validarCedula(temp = leer.nextLine())) {
                                                                                    GC.get(i).setCedula(temp);
                                                                                    validacion = true;
                                                                                } else {
                                                                                    System.out.println("cedula mal ingresada, ingrese otra vez");
                                                                                    validacion = false;
                                                                                }
                                                                            }
                                                                            } while (validacion == false);
                                                                    

                                                                        break;
                                                                case 2:
                                                                        System.out.println("Ingrese el nuevo nombre");
                                                                        do {
                                                                                if (val.validarPersona(temp = leer
                                                                                                .nextLine())) {
                                                                                        GC.get(i).setNombre(temp);
                                                                                        validacion = true;
                                                                                } else {
                                                                                        System.out.println(
                                                                                                        "Nombre mal ingresado, intente otra vez.");
                                                                                        validacion = false;
                                                                                }
                                                                        } while (validacion == false);

                                                                        break;
                                                                case 3:
                                                                        System.out.println("Ingrese el nuevo apellido");
                                                                        do {
                                                                                temp = leer.nextLine();
                                                                                if(GC.size()>0){
                                                                                    for (int j = 0; j < GC.size(); j++) {
                                                                                            if (val.validarCedula(temp)&& !GC.get(i).getCedula().equals(temp)) {
                                                                                            GC.get(j).setCedula(temp);
                                                                                            validacion = true;
                                                                                            return;
                                                                                        }else if(GC.get(i).getCedula().equals(temp)){
                                                                                            System.out.println("Apellido mal ingresado o ya existe, ingrese otro número de teléfono");
                                                                                            validacion = false;
                                                                                            break;
                                                                                        }    
                                                                                    }
                                                                                }else{
                                                                                if (val.validarCedula(temp = leer.next())) {
                                                                                    GC.get(i).setCedula(temp);
                                                                                    validacion = true;
                                                                                } else {
                                                                                    System.out.println("Apellido mal ingresado, ingrese otra vez");
                                                                                    validacion = false;
                                                                                }
                                                                            }
                                                                            } while (validacion == false);
                                                                        break;
                                                                case 4:
                                                                do {
                                                                        temp = leer.nextLine();
                                                                        if(GC.size()>0){
                                                                           
                                                                                    if (val.validarTelefono(temp)&& !GC.get(i).getTelefono().equals(temp)) {
                                                                                    GC.get(i).setTelefono(temp);
                                                                                    validacion = true;
                                                                                    return;
                                                                                }else if(GC.get(i).getTelefono().equals(temp)){
                                                                                    System.out.println("Número de teléfono mal ingresado o ya existe, ingrese otro número de teléfono");
                                                                                    validacion = false;
                                                                                }    
                                                                            
                                                                        }else{
                                                                            if (val.validarTelefono(temp)) {
                                                                                GC.get(i).setTelefono(temp);
                                                                                validacion = true;
                                                                                return;
                                                                            }else {
                                                                                System.out.println("Número de teléfono mal ingresado, ingrese otra vez");
                                                                                validacion = false;
                                                                            }    
                                                                        }
                                                                    } while (validacion == false);
                                                                        break;
                                                                case 5:
                                                                        System.out.println(
                                                                                        "Ingrese la nueva dirección");
                                                                        GC.get(i).setDirección(temp = leer.next());
                                                                        break;
                                                                case 6:
                                                                        System.out.println(
                                                                                        "Ingrese una s(Sí) u otra letra(No), dependiendo del interés del cliente");
                                                                        if ((temp = leer.next())
                                                                                        .equalsIgnoreCase("s")) {
                                                                                GC.get(i).setInteresado(true);
                                                                        } else {
                                                                                GC.get(i).setInteresado(false);

                                                                        }
                                                                        break;
                                                                default:
                                                                        System.out.println(
                                                                                        "Escoja un número del 1 al 6");
                                                                        break;
                                                        }
                                                        System.out.println("Tu cliente modificado ahora es: "
                                                                        + GC.get(n - 1));

                                                }
                                        }
                                        break;
                                case 3:
                                        if (GC.size()!=0) {
                                                System.out.println("Lista Clientes");
                                                for (int i = 0; i < GC.size(); i++) {
                                                        System.out.println((i + 1) + " "
                                                                        + GC.get(i).getNombreYApellido());
                                                }
                                                do {
                                                        System.out.println(
                                                                        "Elija el número del cliente que desea eliminar");
                                                        n = leer.nextInt();
                                                        if (n > 0 || n < GC.size()) {
                                                                GC.remove(n - 1);
                                                                validacion = true;
                                                                System.out.println("Nueva Lista Clientes");
                                                                for (int i = 0; i < GC.size(); i++) {
                                                                        System.out.println((i + 1)
                                                                                        + " "
                                                                                        + GC.get(i).getNombreYApellido());
                                                                }
                                                        } else {
                                                                System.out.println("numero fuera de rango");
                                                                validacion = false;
                                                        }

                                                } while (validacion == false);
                                        } else {
                                                System.out.println("Debe crear un cliente primero");
                                        }
                                        break;
                                case 4:
                                        System.out.println("Lista Clientes");
                                        for (int i = 0; i < GC.size(); i++) {
                                                System.out.println((i + 1) + " "
                                                                + ": " + GC.get(i).getNombreYApellido());
                                        }
                                        do {
                                                System.out.println("Elija el número del cliente que desea buscar");
                                                n = leer.nextInt();
                                                if (n > 0 || n < GC.size()) {
                                                        System.out.println(GC.get(n - 1).toString());
                                                        validacion = true;
                                                } else {
                                                        System.out.println("numero fuera de rango");
                                                        validacion = false;
                                                }

                                        } while (validacion == false);
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

                } while (op != 6);
        }
}
