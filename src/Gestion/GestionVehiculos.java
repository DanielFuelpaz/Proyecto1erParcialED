package Gestion;

import java.util.ArrayList;
import Clases.Auto;
import Clases.Tipo;
import Utiles.Interfaz;
import Utiles.Validacion;

public class GestionVehiculos {
    ArrayList<Tipo> tipo = new ArrayList<>();
    Interfaz coso= new Interfaz();
    Validacion r=new Validacion();

    public void crearTipo() {
        Tipo mod = new Tipo();
        String nombre;
        coso.imprimir("Ingres un tipo de Vehículo");
        nombre = coso.ingresar().toUpperCase();
        if(!r.validarTipos(nombre)){
            coso.imprimir("No se permiten valores numericos");
            crearTipo();
        }
        mod.setNombre(nombre);
        tipo.add(mod);
    }

    public void cearVehiculo() {
        Auto auto = new Auto();
        String dato, placa, color, marca, año;
        coso.imprimir("Ingrese la placa del Vehículo");
        placa = coso.ingresar();
        coso.imprimir("Ingrese el color del Vehiculo");
        color = coso.ingresar();
        coso.imprimir("Ingrese la marca del Vehículo");
        marca = coso.ingresar();
        coso.imprimir("Ingrese el año del Vehículo");
        año = coso.ingresar();
        auto.setPlaca(placa);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setAño(año);
        coso.imprimir("Seleccione el Tipo de vehiculo al que desea agregar al automovil creado");
        for (int i = 0; i < tipo.size(); i++) {
            coso.imprimir(i + 1 + ".- " + this.tipo.get(i).nombre);
        }
        do {
            coso.imprimir("Ingrese el numero del Tipo para seleccionarlo");
            dato = coso.ingresar();
            if (!r.validarNúmero(dato)) {
                coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
        } while (!r.validarNúmero(dato));
        this.tipo.get(Integer.parseInt(dato) - 1).lista.add(auto);
    }

    public void ImprimirTodo() {
        for (int i = 0; i < this.tipo.size(); i++) {
            coso.imprimir("\n" + "Tipo: " + this.tipo.get(i).nombre);
            for (int j = 0; j < this.tipo.get(i).lista.size(); j++) {
                coso.imprimir("\n" + "Vehiculo " + j + 1 + ": ");
                coso.imprimir(this.tipo.get(i).toString());
            }
        }
    }

    public void ImprimirTipos() {
        for (int i = 0; i < this.tipo.size(); i++) {
            coso.imprimir("\n" + "Tipo: " + this.tipo.get(i).nombre);
        }
    }

    public void ImprimirAutos(int tipoVe) {
        coso.imprimir("\n" + "Tipo: " + this.tipo.get(tipoVe).nombre);
        for (int j = 0; j < this.tipo.get(tipoVe).lista.size(); j++) {
            coso.imprimir("\n" + "Vehiculo " + j + 1 + ": ");
            coso.imprimir(this.tipo.get(tipoVe).toString());
        }
    }

    public Auto BorrarVehiculoConsesionario(int pos) {
        String num;
        for (int i = 0; i < this.tipo.get(pos).lista.size(); i++) {
            coso.imprimir("\n" + "Vehiculo " + i + 1 + ": ");
            coso.imprimir("Marca: " + this.tipo.get(pos).lista.get(i).getMarca());
            coso.imprimir("Año: " + this.tipo.get(pos).lista.get(i).getAño());
            coso.imprimir("Placa: " + this.tipo.get(pos).lista.get(i).getPlaca());
            coso.imprimir("Color: " + this.tipo.get(pos).lista.get(i).getColor());
        }
        do {
            coso.imprimir("Seleccione número del vehiculo que quiere borrar");
            num = coso.toString();
            if (!r.validarNúmero(num)) {
                coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.validarNúmero(num)) {
                if (Integer.parseInt(num) < 0 || Integer.parseInt(num) > this.tipo.get(pos).lista.size()) {
                    coso.imprimir("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    num = "ª";
                }
            }
        } while (!r.validarNúmero(num));
        return this.tipo.get(pos).lista.get(Integer.parseInt(num) - 1);
    }

    public Auto BorrarVehiculoInteres(ArrayList<Auto> catalogo) {
        String num;
        for (int i = 0; i < catalogo.size(); i++) {
            coso.imprimir("\n" + "Vehiculo " + i + 1 + ": ");
            coso.imprimir(catalogo.get(i).toString());
        }
        do {
            coso.imprimir("Seleccione número del vehiculo que quiere borrar");
            num = coso.toString();
            if (!r.validarNúmero(num)) {
                coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.validarNúmero(num)) {
                if (Integer.parseInt(num) < 0 || Integer.parseInt(num) > catalogo.size()) {
                    coso.imprimir("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    num = "ª";
                }
            }
        } while (!r.validarNúmero(num));
        return catalogo.get(Integer.parseInt(num) - 1);
    }

    public Auto AgregsrAListaDeInteres() {
        String dato1,dato2;
        ImprimirTipos();
        do {
            coso.imprimir("Seleccione el tipo de vehiculo que desea ver");
            dato1 = coso.toString();
            if (!r.validarNúmero(dato1)) {
                coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.validarNúmero(dato1)) {
                if (Integer.parseInt(dato1) < 0 || Integer.parseInt(dato1) > this.tipo.size()) {
                    coso.imprimir(
                            "El valor ingresado se encuentra fuera del rango de los Tipos de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    dato1 = "ª";
                }
            }
        } while (!r.validarNúmero(dato1));
        
        ImprimirAutos(Integer.parseInt(dato1));
        do {
            coso.imprimir("Seleccione número del vehiculo que quiere borrar");
            dato2 = coso.toString();
            if (!r.validarNúmero(dato2)) {
                coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.validarNúmero(dato2)) {
                if (Integer.parseInt(dato2) < 0 || Integer.parseInt(dato2) > this.tipo.size()) {
                    coso.imprimir("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    dato2 = "ª";
                }
            }
        } while (!r.validarNúmero(dato2));
        return this.tipo.get(Integer.parseInt(dato1)).lista.get(Integer.parseInt(dato2));
    }
}
