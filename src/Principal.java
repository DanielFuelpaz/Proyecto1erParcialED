
import Gestion.GestorClientes;
import Clases.Cliente;
import Utiles.Validacion;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {
                String respuesta;
                Validacion val = new Validacion();
                GestorClientes GC = new GestorClientes();
                System.out.println("Bienvenido al Sistema de Clientes");
                System.out.println("Desea ingresar un cliente");
                Scanner leer = new Scanner(System.in);
                respuesta = leer.nextLine();
                byte op;
                System.out.println(
                                "Escoja y escriba el número que necesite: \n 1: Agregar Cliente. \n 2: Modificar Cliente. \n 3: Eliminar Cliente. \n 4: Buscar cliente");
                op = leer.nextByte();
                switch (op) {
                        case 1:

                                do {
                                        if (respuesta.equalsIgnoreCase("si")) {

                                                Cliente c1 = new Cliente();
                                                LocalDate fecha = LocalDate.now();
                                                c1.fechaVisita = fecha;
                                                var temp = "";
                                                var validacion = false;
                                                System.out.println("Ingrese su # de cedula:");
                                                do {
                                                        temp = leer.nextLine();
                                                        if (!val.validarCedula(c1.cedula)) {
                                                                c1.setCedula(temp);
                                                                System.out.println("cedula mal ingresada");
                                                                validacion = false;
                                                        } else {
                                                                validacion = true;
                                                        }
                                                } while (validacion == false);
                                                System.out.println("Ingrese su nombre:");
                                                do {
                                                        temp = leer.nextLine();
                                                        if (val.validarPersona(temp)) {
                                                                c1.setNombre(temp);
                                                                validacion = true;
                                                        } else {
                                                                System.out.println("Nombre mal ingresado");
                                                                validacion = false;
                                                        }
                                                } while (validacion == false);
                                                System.out.println("Ingrese su Apellido:");
                                                do {
                                                        temp = leer.nextLine();
                                                        if (val.validarPersona(temp)) {
                                                                c1.setApellido(temp);
                                                                validacion = true;
                                                        } else {
                                                                System.out.println("Apellido mal ingresado");
                                                                validacion = false;
                                                        }
                                                } while (validacion == false);
                                                System.out.println("Ingrese su # de telefono:");
                                                do {
                                                        temp = leer.nextLine();
                                                        if (val.validarTelefono(temp)) {
                                                                c1.setTelefono(temp);
                                                                validacion = true;
                                                        } else {
                                                                System.out.println("Número de teléfono mal ingresado");
                                                                validacion = false;
                                                        }
                                                } while (validacion == false);
                                                System.out.println("Ingrese su dirección:");
                                                c1.setDirección(leer.nextLine());
                                                GC.add(c1);
                                                System.out.println("Desea ingresar otro cliente?");
                                                respuesta = leer.nextLine();
                                        }
                                } while (respuesta.equalsIgnoreCase("si"));
                                break;
                        case 2:
                        int n=0;
                                for (int i = 0; i < GC.size(); i++) {
                                        System.out.println((i+1) + GC.get(i).getNombreYApellido());
                                }
                                do{
                                System.out.println("Elija el número del cliente que desea modificar");
                                n = leer.nextInt();  
                                }while(n<0||n>GC.size());
                                
                                break;
                        case 3:

                                break;
                        default:

                                break;
                }

                // System.out.println(GC.search(0));
                GC.Listar();
                // GC.eraseFirstClient();
                // GC.eraseClient(0);
                // GC.Listar();
        }
}
