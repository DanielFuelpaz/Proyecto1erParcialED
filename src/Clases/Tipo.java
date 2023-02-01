package Clases;
import java.util.ArrayList;

public class Tipo {
    public String nombre;
    public ArrayList<Auto> lista;

    public Tipo() {
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
