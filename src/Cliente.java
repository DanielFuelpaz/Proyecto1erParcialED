import java.time.LocalDate;

public class Cliente {
    String cedula, nombre, apellido, telefono, dirección;
    boolean interesado;
    LocalDate fechaVisita;
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

    
}
