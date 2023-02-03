package Gestion;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import Clases.Auto;
import Clases.Tipo;
import Utiles.Interfaz;
import Utiles.Validacion;

public class GestionVehiculos {
    ArrayList<Tipo> tipo;
    Interfaz coso = new Interfaz();
    Validacion r = new Validacion();

    public GestionVehiculos() {
        this.tipo = new ArrayList<>();
    }

    public void crearTipo() {
        Tipo mod = new Tipo();
        String nombre;
        do {
            coso.imprimir("Ingrese un tipo de Vehículo");
            nombre = coso.ingresar().toUpperCase();
            if (!r.validarTipos(nombre)) {
                coso.imprimir("No se permiten valores numericos");

            }
            for (int i = 0; i < this.tipo.size(); i++) {
                if (this.tipo.get(i).nombre.equals(nombre)) {
                    coso.imprimir("""
                            El nombre ingresado ya existe
                            Por favor ingrese otro nombre
                            """);
                    nombre = "21";
                }
            }
        } while (!r.validarTipos(nombre));
        mod.setNombre(nombre);
        tipo.add(mod);
    }

    public void crearVehiculo() {
        Auto auto = new Auto();
        String dato, placa, color, marca, año;
        if (this.tipo.isEmpty()) {
            coso.imprimir("""
                    No existen Tipos de vehiculos a los que pueda agregar un Automovil
                    Cree un tipo de Vehiculo pra poder crear un Automovil""");
            crearTipo();
        }
        do {
            coso.imprimir("Ingrese la placa del Vehículo");
            placa = coso.ingresar().toUpperCase();
            if (!r.validarMatricula(placa)) {
                coso.imprimir("""
                        El formato de placa incorrecto
                        Por favor ingrese un formato correcto
                        Ejemplo: ABC-1234""");
            }
        } while (!r.validarMatricula(placa));
        do {
            coso.imprimir("Ingrese el color del Vehiculo");
            color = coso.ingresar().toUpperCase();
            if (!r.validarColor(color)) {
                coso.imprimir("No se permite ingresar carateres especiales o numéricos");
            }
        } while (!r.validarColor(color));

        coso.imprimir("Ingrese la marca del Vehículo");
        marca = coso.ingresar();
        do {
            do {
                coso.imprimir("Ingrese el año del Vehículo");
            año = coso.ingresar();
            if (!r.validarNúmero(año)) {
                coso.imprimir("Solo se permiten valores numéricos");
            }
            } while (!r.validarNúmero(año));
            
            if(!r.validarAño(Integer.parseInt(año))){
                coso.imprimir("El año debe tener cuatro digitos");
                año="a";
            }
        } while (!r.validarNúmero(año));
        auto.setPlaca(placa);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setAño(año);
        coso.imprimir("Seleccione el Tipo de vehiculo al que desea agregar al automovil creado");
        for (int i = 0; i < tipo.size(); i++) {
            coso.imprimir(i + 1 + ".- " + this.tipo.get(i).nombre);
        }
        do {
            do {
                coso.imprimir("Ingrese el numero del Tipo para seleccionarlo");
                dato = coso.ingresar();
                if (!r.validarNúmero(dato)) {
                    coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
                }
            } while (!r.validarNúmero(dato));

            if (Integer.parseInt(dato) <= 0 || Integer.parseInt(dato) > this.tipo.size()) {
                coso.imprimir("""
                        El valor ingresado no esta dentro del rango de opciones
                        Por favor vuelvalo a ingresar correctamente""");
                dato = "ª";
            }
        } while (!r.validarNúmero(dato));
        this.tipo.get(Integer.parseInt(dato) - 1).lista.add(auto);
    }

    public void ImprimirTodo() {
        if (this.tipo.isEmpty()) {
            coso.imprimir("""
                    No existen tipos ni vehículos instanciados
                    Por favor agreguelos""");
            crearTipo();
            crearVehiculo();
        }
        for (int i = 0; i < this.tipo.size(); i++) {
            if (!this.tipo.get(i).lista.isEmpty()) {
                coso.imprimir("\n" + (i + 1) + ".-Tipo: " + this.tipo.get(i).nombre);
            }

            for (int j = 0; j < this.tipo.get(i).lista.size(); j++) {
                coso.imprimir("\n" + "Vehiculo " + (j + 1) + ": ");
                coso.imprimir(this.tipo.get(i).lista.get(j).toString());
            }
        }
    }

    public void ImprimirTipos() {
        for (int i = 0; i < this.tipo.size(); i++) {
            if (!this.tipo.get(i).lista.isEmpty()) {
                coso.imprimir("\n" + (i + 1) + ".-Tipo: " + this.tipo.get(i).nombre);
            }
        }
    }

    public void ImprimirAutos(int tipoVe) {
        coso.imprimir("\n" + "Tipo: " + this.tipo.get(tipoVe).nombre);
        for (int j = 0; j < this.tipo.get(tipoVe).lista.size(); j++) {
            coso.imprimir("\n" + "Vehiculo " + (j + 1) + ": ");
            coso.imprimir(this.tipo.get(tipoVe).lista.get(j).toString());
        }
    }

    public Auto BorrarVehiculoConsesionario(int pos) {
        String num;
        for (int i = 0; i < this.tipo.get(pos).lista.size(); i++) {
            coso.imprimir("\n" + "Vehiculo " + (i + 1) + ": ");
            this.tipo.get(pos-1).lista.get(i).toString();
        }
        do {
            coso.imprimir("Seleccione número del vehiculo que quiere borrar");
            num = coso.toString();
            if (!r.validarNúmero(num)) {
                coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.validarNúmero(num)) {
                if (Integer.parseInt(num) <= 0 || Integer.parseInt(num) > this.tipo.get(pos-1).lista.size()) {
                    coso.imprimir("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    num = "ª";
                }
            }
        } while (!r.validarNúmero(num));
        return this.tipo.get(pos).lista.get(Integer.parseInt(num) - 1);
    }

    public int BorrarVehiculoInteres(ArrayList<Auto> catalogo) {
        String num;
        for (int i = 0; i < catalogo.size(); i++) {
            coso.imprimir("\n" + "Vehiculo " + (i + 1) + ": ");
            coso.imprimir(catalogo.get(i).toString());
        }
        do {
            do {
                coso.imprimir("Seleccione número del vehiculo que quiere borrar");
                num = coso.toString();
                if (!r.validarNúmero(num)) {
                    coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
                }
            } while (!r.validarNúmero(num));

            if (!r.validarNúmero(num)) {
                if (Integer.parseInt(num) <= 0 || Integer.parseInt(num) > catalogo.size()) {
                    coso.imprimir("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    num = "ª";
                }
            }
        } while (!r.validarNúmero(num));
        return (Integer.parseInt(num) - 1);
    }

    public Auto AgregarAListaDeInteres() {
        String dato1, dato2;
        do {
            if (this.tipo.isEmpty()) {
                coso.imprimir("""
                        No existen tipos ni vehículos instanciados
                        Por favor agreguelos""");
                crearTipo();
                crearVehiculo();
            }
            do {
                ImprimirTipos();
                coso.imprimir("Seleccione el tipo de vehiculo que desea ver");
                dato1 = coso.ingresar();
                if (!r.validarNúmero(dato1)) {
                    coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
                }
            } while (!r.validarNúmero(dato1));
            if (r.validarNúmero(dato1)) {
                if (Integer.parseInt(dato1) <= 0 || Integer.parseInt(dato1) > this.tipo.size()) {
                    coso.imprimir(
                            "El valor ingresado se encuentra fuera del rango de los Tipos de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    dato1 = "ª";
                }
            }
        } while (!r.validarNúmero(dato1));
        if(this.tipo.get(Integer.parseInt(dato1)-1).lista.isEmpty()){
            coso.imprimir("""
                No existen autos instanciados en este Tipo
            Por favor agreguelos""");
            crearVehiculo();
        }

        ImprimirAutos(Integer.parseInt(dato1) - 1);
        do {
            coso.imprimir("Seleccione número del vehiculo que quiere agragar a la lista de interes");
            dato2 = coso.ingresar();
            if (!r.validarNúmero(dato2)) {
                coso.imprimir("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.validarNúmero(dato2)) {
                if (Integer.parseInt(dato2) <= 0 || Integer.parseInt(dato2) > this.tipo.get(Integer.parseInt(dato1)-1).lista.size()) {
                    coso.imprimir("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    coso.imprimir("Por favor ingrese un número dentro del rango");
                    dato2 = "ª";
                }
            }
        } while (!r.validarNúmero(dato2));
        return this.tipo.get(Integer.parseInt(dato1) - 1).lista.get(Integer.parseInt(dato2) - 1);
    }

    public LocalDate crearFecha(int dia,int mes, int año){
        
        do {
            coso.imprimir("Ingrese el Dia:");
            dia = coso.ingresarEntero();

        } while (!r.validarDia(dia));
        
        do {
            coso.imprimir("Ingrese el Mes:");
            mes = coso.ingresarEntero();
        } while (!r.validarMes(mes));
        do {
            coso.imprimir("Ingrese el Año:");
            año = coso.ingresarEntero();
        } while (!r.validarAño(año));
        LocalDate fecha= LocalDate.of(año, Month.of(mes), dia);
       return fecha;
    }
    public ArrayList<String> listarMarcas() {
        ArrayList<String> marcas = new ArrayList<>();
        for (Tipo t : this.tipo) {
            for (Auto a : t.lista) {
                if (!marcas.contains(a.getMarca())) {
                    marcas.add(a.getMarca());
                }
            }
        }
        return marcas;
    }

    public void imprimirMarcas(ArrayList<String> marcas){
        int n=1;
        for (String m : marcas) {
            coso.imprimir("Marca "+n);
            coso.imprimir(m);
            n++;
        }
    }
}