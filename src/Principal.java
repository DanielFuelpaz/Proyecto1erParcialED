import java.time.LocalDate;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        LinkedList<Cliente> clientes = new LinkedList<>();
        LocalDate fecha = LocalDate.now();
        Cliente cliente1 = new Cliente("1850178870", "Stalin", "Badillo", "0912345678", "Mall de los Andes", true,
                fecha);
        clientes.add(cliente1);
        System.out.println(clientes.getFirst().cedula);
    }
}
