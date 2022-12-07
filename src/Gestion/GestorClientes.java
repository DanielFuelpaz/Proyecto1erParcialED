package Gestion;

import Clases.Cliente;
import java.util.LinkedList;

public class GestorClientes extends LinkedList<Cliente> {

    public Cliente search(int pos) {
        if (pos < 0 || pos > GestorClientes.super.size()) {
            return null;
        } else {

            System.out.println(GestorClientes.super.get(pos - 1).toString());

        }

        return GestorClientes.super.get(pos);
    }

    public void Listar() {
        for (int i = 0; i < GestorClientes.super.size(); i++) {
            System.out.println(GestorClientes.super.get(i).toString());
        }
    }

}
