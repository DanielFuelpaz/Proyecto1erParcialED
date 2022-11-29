import java.time.LocalDate;
import java.time.Month;

import javax.security.sasl.AuthorizeCallback;

public class Principal {
    public static void main(String[] args) {
        GestorClientes GC = new GestorClientes();
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(2022, Month.DECEMBER, 7);
        Cliente cliente1 = new Cliente("1850178870", "Stalin", "Badillo", "0912345678", "Mall de los Andes", true,
                fecha);
        Cliente cliente2 = new Cliente("1850178856", "Carlos", "Alvarado", "0919341478", "Parque 12 de Noviembre", true,
                fecha2.plusDays(43));
        LocalDate fecha3 = LocalDate.now().plusDays(10);
        Cliente cliente3 = new Cliente("1805744786", "Karla", "Torres", "0943509543", "Paseo shopping Ambato", true,
                fecha3);
        Cliente cliente4 = new Cliente("1803853544", "Angie", "Moyan", "0987565464", "Frente a la UTA", true, fecha2);
        Interfaz interfaz1 = new Interfaz();
        GC.addClient(cliente1);
        GC.add(cliente2);
        interfaz1.imprimir(GC);
        System.out.println(GC.search(0));
        System.out.println(GC.search(1));
        //GC.modifyClient(1, cliente4);
        //GC.modifyClient(0, cliente3);
        //interfaz1.imprimir(GC);
        //GC.eraseFirstClient();
        //GC.eraseClient(0);
        //interfaz1.imprimir(GC);
    }

}
