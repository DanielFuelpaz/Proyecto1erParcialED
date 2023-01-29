package Gestion;

import java.util.LinkedList;

import Clases.Cliente;
import Utiles.Interfaz;

public class GestorClientes {
    public LinkedList<Cliente> clientes = new LinkedList<>();
    Interfaz consola = new Interfaz();

    public void Listar() {
        if (clientes.size() < 0) {
            return;
        }
        for (int i = 0; i < clientes.size(); i++) {
            consola.imprimir("Cliente " + (i + 1) + clientes.get(i).toString());
            
        }
    }
}