package Gestion;

import java.time.LocalDate;
import java.util.ArrayList;
import Clases.Auto;
import Clases.Cliente;
import Clases.Compra;
import Clases.Visita;
import Utiles.Interfaz;

public class GestionCompra {
    Cliente c = new Cliente();
    ArrayList<Auto> respaldo;
    Compra factura;
    Visita listainteres = new Visita();
    Interfaz consola = new Interfaz();
    Auto a = new Auto();
    LocalDate fecha;



    public void Agregar(Auto a) {
        this.respaldo.add(a);
    }

    public void GenerarFactura(String fecha, String valor) {
        ArrayList<Auto> lista = new ArrayList(this.respaldo);
        factura = new Compra();
    }

    public void MostrarLista() {
        for (int i = 0; i < this.respaldo.size(); i++) {
            System.out.println(this.respaldo.get(i).toString());
        }
    }

    public boolean BorrarCarro(int a) {
        this.respaldo.remove(a - 1);
        return true;
    }

    public void ImprimirFactura() {
        factura.toString();
    }

    public Auto compraVehiculo(ArrayList<Auto> catalogo) {

        Integer vehiculo;
        String respuesta;

        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println("\n" + "Vehiculo " + i + 1 + ": ");
            System.out.println(catalogo.get(i).toString());
        }
        do {
            consola.imprimir("Ingrese el Número del Vehiculo: ");
            vehiculo = consola.ingresarEntero();
            

        } while (vehiculo<-1);

        return catalogo.get(vehiculo-1);
    }

    

    public void fechasCompra(){

        consola.imprimir("Ingrese La fecha Inicial de la Compra: ");
        String fechaInicial = consola.ingresar();


    }
}
