package Utiles;

public class Validacion {
    public boolean validarCedula(String cedula) {
        return cedula.matches("[0-9]{10}");
    }

    public boolean validarTelefono(String telefono) {
        return telefono.matches("09[0-9]{8}");
    }

    public boolean validarPersona(String telefono) {
        return telefono.matches("[A-Z]([a-z])*");
    }

    public boolean validarOpcion(String opcion) {
        return opcion.matches("[1-7]");
    }
}
