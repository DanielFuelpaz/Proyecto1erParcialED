package Gestion;

import Clases.Cliente;
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

    public void eraseClient(Cliente c) {
        GestorClientes.super.remove(c);
    }

    public void modifyClient(int n, Cliente c) {
        GestorClientes.super.set(n, c);
    }

    public Cliente search(int pos) {
        if (pos < 0 || pos > GestorClientes.super.size()) {
            return null;


        } else {

            System.out.println(GestorClientes.super.get(pos-1).toString());

        }

        return GestorClientes.super.get(pos);
    }

    public void Listar() {
            for (int i = 0; i < GestorClientes.super.size(); i++) {
                System.out.println(GestorClientes.super.get(i).toString());
            }
        
    }
}
