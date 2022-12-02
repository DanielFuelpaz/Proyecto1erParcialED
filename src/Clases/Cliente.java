package Clases;

import java.time.LocalDate;

public class Cliente {
    public String cedula, nombre, apellido, telefono, dirección;
    public boolean interesado;
    public LocalDate fechaVisita;
    public Cliente(String cedula, String nombre, String apellido, String telefono, String dirección, boolean interesado,
            LocalDate fechaVisita) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dirección = dirección;
        this.interesado = interesado;
        this.fechaVisita = fechaVisita;
    }
    @Override
    public String toString() {
        return "Cliente \nCedula= " + cedula + "\nNombre= " + nombre + "\nApellido= " + apellido + "\nTelefono= " + telefono
                + "\nDirección= " + dirección + "\nInteresado=" + interesado + "\nFecha Visita= " + fechaVisita;
    }

    
}
