package Gestion;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Auto;
import Clases.Tipo;
import Utiles.Interfaz;

public class GestionVehiculos {
    ArrayList<Tipo> tipo = new ArrayList<>();

    public Tipo crearTipo() {
        Tipo mod = new Tipo();
        Scanner coso = new Scanner(System.in);
        String nombre;
        System.out.println("Ingres un tipo de Vehículo");
        nombre = coso.next();
        mod.setNombre(nombre);
        return mod;
    }

    public void cearVehiculo() {
        Interfaz r = new Interfaz();
        Auto auto = new Auto();
        Scanner coso = new Scanner(System.in);
        String dato, placa, color, marca, año;
        System.out.println("Ingrese la placa del Vehículo");
        placa = coso.next();
        System.out.println("Ingrese el color del Vehiculo");
        color = coso.next();
        System.out.println("Ingrese la marca del Vehículo");
        marca = coso.next();
        System.out.println("Ingrese el año del Vehículo");
        año = coso.next();
        auto.setPlaca(placa);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setAño(año);
        System.out.println("Seleccione el Tipo de vehiculo al que desea agregar al automovil creado");
        for (int i = 0; i < tipo.size(); i++) {
            System.out.println(i + 1 + ".- " + this.tipo.get(i).nombre);
        }
        do {
            System.out.println("Ingrese el numero del Tipo para seleccionarlo");
            dato = coso.next();
            if (!r.verificarnúmero(dato)) {
                System.out.println("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
        } while (!r.verificarnúmero(dato));
        this.tipo.get(Integer.parseInt(dato) - 1).lista.add(auto);
    }

    public void ImprimirTodo() {
        for (int i = 0; i < this.tipo.size(); i++) {
            System.out.println("\n" + "Tipo: " + this.tipo.get(i).nombre);
            for (int j = 0; j < this.tipo.get(i).lista.size(); j++) {
                System.out.println("\n" + "Vehiculo " + j + 1 + ": ");
                System.out.println("Marca: " + this.tipo.get(i).lista.get(j).getMarca());
                System.out.println("Año: " + this.tipo.get(i).lista.get(j).getAño());
                System.out.println("Placa: " + this.tipo.get(i).lista.get(j).getPlaca());
                System.out.println("Color: " + this.tipo.get(i).lista.get(j).getColor());
            }
        }
    }

    public void ImprimirTipos() {
        for (int i = 0; i < this.tipo.size(); i++) {
            System.out.println("\n" + "Tipo: " + this.tipo.get(i).nombre);
        }
    }

    public void ImprimirAutos(int tipoVe) {
        System.out.println("\n" + "Tipo: " + this.tipo.get(tipoVe).nombre);
        for (int j = 0; j < this.tipo.get(tipoVe).lista.size(); j++) {
            System.out.println("\n" + "Vehiculo " + j + 1 + ": ");
            System.out.println("Marca: " + this.tipo.get(tipoVe).lista.get(j).getMarca());
            System.out.println("Año: " + this.tipo.get(tipoVe).lista.get(j).getAño());
            System.out.println("Placa: " + this.tipo.get(tipoVe).lista.get(j).getPlaca());
            System.out.println("Color: " + this.tipo.get(tipoVe).lista.get(j).getColor());
        }
    }

    public Auto BorrarVehiculoConsesionario(int pos) {
        Scanner coso = new Scanner(System.in);
        String num;
        Interfaz r = new Interfaz();
        for (int i = 0; i < this.tipo.get(pos).lista.size(); i++) {
            System.out.println("\n" + "Vehiculo " + i + 1 + ": ");
            System.out.println("Marca: " + this.tipo.get(pos).lista.get(i).getMarca());
            System.out.println("Año: " + this.tipo.get(pos).lista.get(i).getAño());
            System.out.println("Placa: " + this.tipo.get(pos).lista.get(i).getPlaca());
            System.out.println("Color: " + this.tipo.get(pos).lista.get(i).getColor());
        }
        do {
            System.out.println("Seleccione número del vehiculo que quiere borrar");
            num = coso.next();
            if (!r.verificarnúmero(num)) {
                System.out.println("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.verificarnúmero(num)) {
                if (Integer.parseInt(num) < 0 || Integer.parseInt(num) > this.tipo.get(pos).lista.size()) {
                    System.out.println("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    System.out.println("Por favor ingrese un número dentro del rango");
                    num = "ª";
                }
            }
        } while (!r.verificarnúmero(num));
        return this.tipo.get(pos).lista.get(Integer.parseInt(num) - 1);
    }

    public Auto BorrarVehiculoInteres(ArrayList<Auto> catalogo) {
        Scanner coso = new Scanner(System.in);
        String num;
        Interfaz r = new Interfaz();
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println("\n" + "Vehiculo " + i + 1 + ": ");
            System.out.println("Marca: " + catalogo.get(i).getMarca());
            System.out.println("Año: " + catalogo.get(i).getAño());
            System.out.println("Placa: " + catalogo.get(i).getPlaca());
            System.out.println("Color: " + catalogo.get(i).getColor());
        }
        do {
            System.out.println("Seleccione número del vehiculo que quiere borrar");
            num = coso.next();
            if (!r.verificarnúmero(num)) {
                System.out.println("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.verificarnúmero(num)) {
                if (Integer.parseInt(num) < 0 || Integer.parseInt(num) > catalogo.size()) {
                    System.out.println("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    System.out.println("Por favor ingrese un número dentro del rango");
                    num = "ª";
                }
            }
        } while (!r.verificarnúmero(num));
        return catalogo.get(Integer.parseInt(num) - 1);
    }

    public Auto AgregsrAListaDeInteres() {
        Interfaz r = new Interfaz();
        Scanner coso = new Scanner(System.in);
        String dato1,dato2;
        ImprimirTipos();
        do {
            System.out.println("Seleccione el tipo de vehiculo que desea ver");
            dato1 = coso.next();
            if (!r.verificarnúmero(dato1)) {
                System.out.println("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.verificarnúmero(dato1)) {
                if (Integer.parseInt(dato1) < 0 || Integer.parseInt(dato1) > this.tipo.size()) {
                    System.out.println(
                            "El valor ingresado se encuentra fuera del rango de los Tipos de vehiculos existentes");
                    System.out.println("Por favor ingrese un número dentro del rango");
                    dato1 = "ª";
                }
            }
        } while (!r.verificarnúmero(dato1));
        
        ImprimirAutos(Integer.parseInt(dato1));
        do {
            System.out.println("Seleccione número del vehiculo que quiere borrar");
            dato2 = coso.next();
            if (!r.verificarnúmero(dato2)) {
                System.out.println("Solo se permiten los datos númericos\nPor favor ingres un valor válido");
            }
            if (r.verificarnúmero(dato2)) {
                if (Integer.parseInt(dato2) < 0 || Integer.parseInt(dato2) > this.tipo.size()) {
                    System.out.println("El valor ingresado se encuentra fuera del rango de vehiculos existentes");
                    System.out.println("Por favor ingrese un número dentro del rango");
                    dato2 = "ª";
                }
            }
        } while (!r.verificarnúmero(dato2));
        return this.tipo.get(Integer.parseInt(dato1)).lista.get(Integer.parseInt(dato2));
    }
}
