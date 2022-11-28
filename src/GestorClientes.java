import java.util.LinkedList;

public class GestorClientes extends LinkedList<Cliente> {

    public void addClient(Cliente c) {
        GestorClientes.super.add(c);
    }

    public void eraseFirstClient() {
        GestorClientes.super.removeFirst();
    }

    public void eraseLastClient() {
        GestorClientes.super.removeLast();
    }

    public void eraseClient(int n) {
        GestorClientes.super.remove(n);
    }

    public void eraseClient(Cliente c){
        GestorClientes.super.remove(c);
    }

}
