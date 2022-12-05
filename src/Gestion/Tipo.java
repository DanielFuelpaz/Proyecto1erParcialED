package Gestion;


import Clases.Auto;
import Clases.Auto;
import java.util.ArrayList;


/**
 *
 * @author Gato
 */
public class Tipo {
    public ArrayList<ArrayList<Auto>> lista;

    public Tipo(ArrayList<ArrayList<Auto>> lista) {
        this.lista = lista;
    }
    
    public boolean InsertarFinal(ArrayList<Auto>b, Auto a){
        if(this.lista.contains(b)==false){
            this.lista.add(b);
            this.InsertarFinal(b, a);
            return true;
        }
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(pos).add(a);
            System.out.println("Vehiculo agregado");
            return true;
        }
        
        return false;
    }

    public boolean InsertarInicio(ArrayList<Auto>b, Auto a){
        if(this.lista.contains(b)==false){
            this.lista.add(b);
            this.InsertarInicio(b, a);
            return true;
        }
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(pos).add(0, a);
            System.out.println("Vehiculo agregado al Inicio");
            return true;
        }
        
        return false;
    }

    public boolean Insertar(ArrayList<Auto>b, Auto a, int posinsertar){
        if(this.lista.contains(b)==false){
            this.lista.add(b);
            this.Insertar(b, a, posinsertar);
            return true;
        }
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(pos).add(posinsertar, a);
            System.out.println("Vehiculo agregado");
            return true;
        }
        
        return false;
    }
    
    public boolean Eliminarpordato(ArrayList<Auto>b, Auto a){
        if(this.lista.contains(b)==false)
            return false;
        
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).contains(a)){
                this.lista.get(pos).remove(a);
                System.out.println("Vehículo eliminado");
                return true;
            }
        }
        System.out.println("El vehículo a eliminar no existe");
        return false;
    }
    
    public boolean Eliminarporpos(ArrayList<Auto>b, int num){
        if(this.lista.contains(b)==false)
            return false;
        
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).get(num-1)!=null){
                this.lista.get(pos).remove(num-1);
                System.out.println("Vehículo eliminado");
                return true;
            }
        }
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).get(num-1)==null){
                System.out.println("El vehículo a eliminar no existe");
                return false;
            }
        }
        return false;
    }
    
    public boolean Modificar (ArrayList<Auto>b, Auto a, String dato, String datomod){
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).contains(a)){
                if(dato.equals("placa"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setPlaca(datomod);
                
                if(dato.equals("color"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setColor(datomod);
                
                if(dato.equals("marca"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setMarca(datomod);
                
                if(dato.equals("año"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setAño(datomod);
                
                System.out.println("Vehículo Modificado");
                return true;
            }
        }
        
        return false;
    }
    
    public void ImprimirTodo(){   
        for(int i=0;i<this.lista.size();i++){
            for(int j=0;j<this.lista.get(i).size();j++){
                System.out.println(this.lista.get(i).get(j).toString());
                
            }
        }
    }

    public void ImprimirLista(ArrayList<Auto>b){
        int pos=this.lista.indexOf(b);   
        for(int i=0;i<b.size();i++){
                System.out.println(this.lista.get(pos).get(i).toString());               
        }
    }
    
    public boolean Buscar(ArrayList<Auto>b, int posbusq){
        if(this.lista.contains(b)==false){
            return false;
        }
        int pos=this.lista.indexOf(b);  
        if(this.lista.contains(b) && (posbusq>this.lista.get(pos).size()-1 || posbusq<0)){
            return false;
        }

        if(this.lista.contains(b)){
            System.out.println(this.lista.get(pos).get(posbusq).toString());
            return true;
        }
        return false;           
    }
}
