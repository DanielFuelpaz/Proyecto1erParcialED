package Clases;

import java.util.ArrayList;

public class Cliente {
    public String cedula, nombre, apellido, telefono, dirección;
    public ArrayList<Visita> historial;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String telefono, String dirección) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dirección = dirección;
        this.historial = new ArrayList<>();
    }

    public String getNombreYApellido() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "\nCedula= " + cedula + "\nNombre= " + nombre + "\nApellido= " + apellido + "\nTelefono= "
                + telefono + "\nDirección= " + dirección + "\nInteresado=" + historial.toString();
    }

}
