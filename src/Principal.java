
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
                do {
                        if (respuesta.equalsIgnoreCase("si")) {
                                Cliente c1 = new Cliente();
                                LocalDate fecha = LocalDate.now();
                                c1.fechaVisita = fecha;
                                boolean validacion = false;
                                System.out.println("Ingrese su # de cedula:");
                                do {
                                        c1.cedula = leer.nextLine();
                                        if (!val.validarCedula(c1.cedula)) {
                                                System.out.println("cedula mal ingresada");
                                        }
                                        validacion = true;
                                } while (validacion != false);
                                System.out.println("Ingrese su nombre:");
                                c1.nombre = leer.nextLine();
                                System.out.println("Ingrese su Apellido:");
                                c1.apellido = leer.nextLine();
                                System.out.println("Ingrese su # de telefono:");
                                c1.telefono = leer.nextLine();
                                System.out.println("Ingrese su dirección:");
                                c1.dirección = leer.nextLine();
                                GC.addClient(c1);
                        }
                } while (respuesta.equalsIgnoreCase("si"));
                
                System.out.println(GC.search(0));
                GC.Listar();
                // GC.eraseFirstClient();
                // GC.eraseClient(0);
                // GC.Listar();
        }
}
