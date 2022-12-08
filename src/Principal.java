
import Gestion.GestorClientes;
import Clases.Cliente;
import Utiles.Validacion;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {
                String respuesta;
                var validacion = false;
                Validacion val = new Validacion();
                GestorClientes GC = new GestorClientes();
                System.out.println("Bienvenido al Sistema de Clientes");
                Scanner leer = new Scanner(System.in);

                byte op;

                do {
                        System.out.println(
                                        "Escoja y escriba el número que necesite: \n 1: Agregar Cliente. \n 2: Modificar Cliente. \n 3: Eliminar Cliente. \n 4: Buscar cliente \n 5: Salir");
                        op = leer.nextByte();
                        switch (op) {
                                case 1:
                                        do {
                                                Cliente c1 = new Cliente();
                                                LocalDate fecha = LocalDate.now();
                                                c1.fechaVisita = fecha;
                                                String temp;
                                                
                                                System.out.println("Ingrese su # de cedula:");
                                                do {
                                                        temp = leer.nextLine();
                                                        if (val.validarCedula(temp)) {
                                                                c1.setCedula(temp);
                                                                validacion = true;
                                                        } else {

                                                                System.out.println("cedula mal ingresada");
                                                                validacion = false;

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

                                        } while (respuesta.equalsIgnoreCase("si"));
                                        break;
                                case 2:
                                        int n = 0;
                                        for (int i = 0; i < GC.size(); i++) {
                                                System.out.println("Lista Clientes\n" + (i + 1) + " "
                                                                + GC.get(i).getNombreYApellido());
                                        }
                                        do {
                                                System.out.println("Elija el número del cliente que desea modificar");
                                                n = leer.nextInt();
                                        } while (n < 0 || n > GC.size());

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
                                                        + GC.get(i).getNombreYApellido());
                                }
                                do {
                                        System.out.println("Elija el número del cliente que desea buscar");
                                        n = leer.nextInt();
                                        if (n > 0 || n < GC.size()) {
                                                GC.get(n).toString();
                                                validacion=true;
                                        }else{
                                                System.out.println("numero fuera de rango");
                                                validacion=false;
                                        }

                                } while (validacion==false);
                                        break;

                                case 5:
                                        System.out.println("Adiós");
                                        break;
                                default:
                                        System.out.println("Las Opciones son de 1 a 5");
                                        break;
                        }
                } while (op != 5);

        }
}
