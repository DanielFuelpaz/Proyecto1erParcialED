package Clases;
import java.util.ArrayList;


/**
 *
 * @author Gato
 */
public class Tipo {
    public String nombre;
    public ArrayList<Auto> lista;

    public Tipo() {
    }

    public Tipo(String nombre, ArrayList<Auto> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Auto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Auto> lista) {
        this.lista = lista;
    }
     
    
}