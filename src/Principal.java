import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        GestorClientes GC = new GestorClientes();
        LocalDate fecha = LocalDate.now();
        Cliente cliente1 = new Cliente("1850178870", "Stalin", "Badillo", "0912345678", "Mall de los Andes", true,
                fecha);
        GC.addClient(cliente1);
        System.out.println(GC.getFirst().toString());
    }
}
