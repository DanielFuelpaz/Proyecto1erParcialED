import java.util.LinkedList;

public class Interfaz {
    /**
     * 
     */
    public void imprimir(LinkedList<Cliente> listaClientes){
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i));
            
        }
    }
}
