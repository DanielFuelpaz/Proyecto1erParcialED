import Gestion.GestorClientes;
import Clases.Cliente;
import Utiles.Validacion;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
                String respuesta;
                Validacion val=new Validacion();
                GestorClientes GC = new GestorClientes();
                System.out.println("Bienvenido al Sistema de Clientes");
                System.out.println("Desea ingresar un cliente");
                Scanner leer = new Scanner(System.in);
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                        Cliente c1 = new Cliente();
                        boolean validacion = false;
                        System.out.println("Ingrese su # de cedula:");
                        
                        do{
                            c1.cedula = leer.nextLine();
                            if (!val.validarCedula(c1.cedula)) {
                                System.out.println("cedula mal ingresada");
                            }
                            validacion=true;
                        }while(validacion!=false);
                        System.out.println("Ingrese su nombre:");
                        c1.nombre = leer.nextLine();
                        System.out.println("Ingrese su Apellido:");
                        c1.apellido = leer.nextLine();
                        System.out.println("Ingrese su # de telefono:");
                        c1.telefono = leer.nextLine();
                        System.out.println("Ingrese su dirección:");
                        c1.dirección = leer.nextLine();
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
//                System.out.println(GC.search(1));
//                 GC.modifyClient(1, cliente4);
//                 GC.modifyClient(0, cliente3);
                 GC.Listar();
//                 GC.eraseFirstClient();
//                 GC.eraseClient(0);
//                 GC.Listar();
        }

}

