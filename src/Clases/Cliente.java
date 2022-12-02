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


    public String getNombreYApellido() {
        return this.nombre + " " + this.apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return this.dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public boolean isInteresado() {
        return interesado;
    }

    public void setInteresado(boolean interesado) {
        this.interesado = interesado;
    }
    
    
    @Override
    public String toString() {
        return "Cliente \nCedula= " + cedula + "\nNombre= " + nombre + "\nApellido= " + apellido + "\nTelefono= " + telefono
                + "\nDirección= " + dirección + "\nInteresado=" + interesado + "\nFecha Visita= " + fechaVisita;
    }

    
}
