import Gestion.GestorClientes;
import Clases.Cliente;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
                String respuesta;
                GestorClientes GC = new GestorClientes();
                System.out.println("Bienvenido al Sistema de Clientes");
                System.out.println("Desea ingresar un cliente");
                Scanner leer = new Scanner(System.in);
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                        Cliente c1 = new Cliente();
                        System.out.println("Ingrese su # de cedula:");
                        c1.cedula = leer.nextLine();
                        System.out.println("Ingrese su nombre:");
                        System.out.println("Ingrese su Apellido:");
                        System.out.println("Ingrese su # de telefono:");
                        System.out.println("Ingrese su dirección:");

                } else {
                }
                LocalDate fecha = LocalDate.now();
                LocalDate fecha2 = LocalDate.of(2022, Month.DECEMBER, 7);
                LocalDate fecha3 = LocalDate.now().plusDays(10);
                Cliente cliente1 = new Cliente("1850178870", "Stalin", "Badillo", "0912345678", "Mall de los Andes",
                                true,
                                fecha);
                Cliente cliente2 = new Cliente("1850178856", "Carlos", "Alvarado", "0919341478",
                                "Parque 12 de Noviembre", true,
                                fecha2.plusDays(43));
                Cliente cliente3 = new Cliente("1805744786", "Karla", "Torres", "0943509543", "Paseo shopping Ambato",
                                true,
                                fecha3);
                Cliente cliente4 = new Cliente("1803853544", "Angie", "Moyan", "0987565464", "Frente a la UTA", true,
                                fecha2);
                GC.addClient(cliente1);
                GC.add(cliente2);
                System.out.println(GC.search(0));
                System.out.println(GC.search(1));
                // GC.modifyClient(1, cliente4);
                // GC.modifyClient(0, cliente3);
                // interfaz1.imprimir(GC);
                // GC.eraseFirstClient();
                // GC.eraseClient(0);
                // interfaz1.imprimir(GC);
        }

}
