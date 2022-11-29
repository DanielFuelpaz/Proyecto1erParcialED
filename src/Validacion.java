public class Validacion {
    public boolean validarCedula(String cedula) {
        if (cedula.matches("[0-9]{10}")) {
            return true;
        }
        return false;
    }
    public boolean validarTelefono(String telefono) {
        if (telefono.matches("09[0-9]{8}")) {
            return true;
        }
        return false;
    }
    
}
