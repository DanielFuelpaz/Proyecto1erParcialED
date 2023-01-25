package Gestion;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Auto;
import Clases.Tipo;

public class GestionVehiculos {
    
    public Tipo crearTipo(String nombre, ArrayList<Auto> lista){
            if(nombre.isEmpty()){
                System.out.println("Porfavor ingrese un tipo de vehiculo");
                return null;
            }
            Tipo coso=new Tipo();
            coso.setNombre(nombre);
            coso.setLista(lista);
            return coso;    
    }

    public ArrayList<Tipo> cearVehiculo(String placa,String color,String marca,String año,ArrayList<Tipo> catalogo){
        Auto auto=new Auto();
        Scanner coso=new Scanner(System.in);
        String dato;
        auto.setPlaca(placa);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setAño(año);
        System.out.println("Seleccione el Tipo de vehiculo al que desea agregar al automovil creado");
        for(int i=0;i<catalogo.size();i++){
            System.out.println(i+1+".- "+catalogo.get(i).nombre);
        }
        System.out.println("Ingrese el numero del Tipo para seleccionarlo");
        dato=coso.next();
        catalogo.get(Integer.parseInt(dato)-1).lista.add(auto);
        return catalogo;
    }

    public boolean ImprimirTodo(ArrayList<Tipo> catalogo){
        for(int i=0;i<catalogo.size();i++){
            System.out.println("\n"+"Tipo: "+catalogo.get(i).nombre);
            for(int j=0;j<catalogo.get(i).lista.size();j++){
                System.out.println("\n"+"Vehiculo "+j+1+": ");
                System.out.println("Marca: "+catalogo.get(i).lista.get(j).getMarca());
                System.out.println("Año: "+catalogo.get(i).lista.get(j).getAño());
                System.out.println("Placa: "+catalogo.get(i).lista.get(j).getPlaca());
                System.out.println("Color: "+catalogo.get(i).lista.get(j).getColor());
            }
        }
        return true;
    }
}
