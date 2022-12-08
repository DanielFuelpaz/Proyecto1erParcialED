package Gestion;


import Clases.Auto;
import java.util.ArrayList;


/**
 *
 * @author Gato
 */
public class GestorAuto {
    public ArrayList<ArrayList<Auto>> lista;
    
    public GestorAuto(ArrayList<ArrayList<Auto>> lista) {
        this.lista = lista;
        ArrayList<Auto> Camioneta =new ArrayList();
        ArrayList<Auto> Suv =new ArrayList();
        ArrayList<Auto> Sedan =new ArrayList();
        ArrayList<Auto> Deportivo =new ArrayList();
        this.lista.add(Camioneta);
        this.lista.add(Suv);
        this.lista.add(Sedan);
        this.lista.add(Deportivo);
    }
    
    public boolean InsertarFinal(String tipo, Auto a){

        if(tipo.equals("Camioneta")){
            if(this.lista.get(0).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(0).add(a);
            System.out.println("Vehiculo agregado");
            return true;
        }
        if(tipo.equals("Suv")){
            if(this.lista.get(1).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(1).add(a);
            System.out.println("Vehiculo agregado");
            return true;
        }
        if(tipo.equals("Sedan")){
            if(this.lista.get(2).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(2).add(a);
            System.out.println("Vehiculo agregado");
            return true;
        }
        if(tipo.equals("Deportivo")){
            if(this.lista.get(3).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(3).add(a);
            System.out.println("Vehiculo agregado");
            return true;
        }
        
        
        return false;
    }

    public boolean InsertarInicio(String tipo, Auto a){
        if(tipo.equals("Camioneta")){
            if(this.lista.get(0).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(0).add(0, a);
            System.out.println("Vehiculo agregado al Inicio");
            return true;
        }

        if(tipo.equals("Suv")){
            if(this.lista.get(1).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(1).add(0, a);
            System.out.println("Vehiculo agregado al Inicio");
            return true;
        }

        if(tipo.equals("Sedan")){
            if(this.lista.get(2).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(2).add(0, a);
            System.out.println("Vehiculo agregado al Inicio");
            return true;
        }

        if(tipo.equals("Deportivo")){
            if(this.lista.get(3).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(3).add(0, a);
            System.out.println("Vehiculo agregado al Inicio");
            return true;
        }  
        return false;
    }

    public boolean Insertar(String tipo, Auto a, int posinsertar){
        if(tipo.equals("Camioneta")){
            if(this.lista.get(0).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(0).add(posinsertar, a);
            System.out.println("Vehiculo agregado");
            return true;
        }  
            
        if(tipo.equals("Suv")){
            if(this.lista.get(1).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(1).add(posinsertar, a);
            System.out.println("Vehiculo agregado");
            return true;
        }

        if(tipo.equals("Sedan")){
            if(this.lista.get(2).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(2).add(posinsertar, a);
            System.out.println("Vehiculo agregado");
            return true;
        }

        if(tipo.equals("Deportivo")){
            if(this.lista.get(3).contains(a)){
                System.out.println("El vehiculo ya existe");
                return false;
            }    
            this.lista.get(3).add(posinsertar, a);
            System.out.println("Vehiculo agregado");
            return true;
        }

        return false;
    }
    
    public boolean Eliminarpordato(String tipo, Auto a){
        if(tipo.equals("Camioneta")){
            if(this.lista.get(0).contains(a)){
                this.lista.get(0).remove(a);
                System.out.println("Vehículo eliminado");
                return true;
            }
            System.out.println("El vehículo a eliminar no existe");
            return false;
        }

        if(tipo.equals("Suv")){
            if(this.lista.get(1).contains(a)){
                this.lista.get(1).remove(a);
                System.out.println("Vehículo eliminado");
                return true;
            }
            System.out.println("El vehículo a eliminar no existe");
            return false;
        }

        if(tipo.equals("Sedan")){
            if(this.lista.get(2).contains(a)){
                this.lista.get(2).remove(a);
                System.out.println("Vehículo eliminado");
                return true;
            }
            System.out.println("El vehículo a eliminar no existe");
            return false;
        }

        if(tipo.equals("Deportivo")){
            if(this.lista.get(3).contains(a)){
                this.lista.get(3).remove(a);
                System.out.println("Vehículo eliminado");
                return true;
            }
            System.out.println("El vehículo a eliminar no existe");
            return false;
        }
        
        return false;
    }
    
    public boolean Eliminarporpos(String tipo, int num){
        if(tipo.equals("Camioneta")){
            if(num>this.lista.get(0).size() || num<1){
                System.out.println("El vehículo a eliminar no existe");
                return false;
            }
            this.lista.get(0).remove(num-1);
            System.out.println("Vehículo eliminado");
            return true;
        }

        if(tipo.equals("Suv")){
            if(num>this.lista.get(1).size() || num<1){
                System.out.println("El vehículo a eliminar no existe");
                return false;
            }
            this.lista.get(1).remove(num-1);
            System.out.println("Vehículo eliminado");
            return true;
        }

        if(tipo.equals("Sedan")){
            if(num>this.lista.get(2).size() || num<1){
                System.out.println("El vehículo a eliminar no existe");
                return false;
            }
            this.lista.get(2).remove(num-1);
            System.out.println("Vehículo eliminado");
            return true;
        }

        if(tipo.equals("Deportivo")){
            if(num>this.lista.get(3).size() || num<1){
                System.out.println("El vehículo a eliminar no existe");
                return false;
            }
            this.lista.get(3).remove(num-1);
            System.out.println("Vehículo eliminado");
            return true;
        }
        
        return false;
    }
    
    public boolean Modificar (String tipo, int num, String dato, String datomod){
        int pos;
        if(tipo.equals("Camioneta")){
            pos=0;
            if(this.lista.get(pos).contains(this.lista.get(pos).get(num-1))){
                if(dato.equals("placa")){
                    this.lista.get(pos).get(num-1).setPlaca(datomod);
                    return true;
                }
                if(dato.equals("color")){
                    this.lista.get(pos).get(num-1).setColor(datomod);
                    return true;
                }
                if(dato.equals("marca")){
                    this.lista.get(pos).get(num-1).setMarca(datomod);
                    return true;
                }
                if(dato.equals("año")){
                    this.lista.get(pos).get(num-1).setAño(datomod);
                }
                System.out.println("Vehículo Modificado");
                return true;
            }  
        }
        if(tipo.equals("Suv")){
            pos=1;
            if(this.lista.get(pos).contains(this.lista.get(pos).get(num-1))){
                if(dato.equals("placa")){
                    this.lista.get(pos).get(num-1).setPlaca(datomod);
                    return true;
                }
                if(dato.equals("color")){
                    this.lista.get(pos).get(num-1).setColor(datomod);
                    return true;
                }
                if(dato.equals("marca")){
                    this.lista.get(pos).get(num-1).setMarca(datomod);
                    return true;
                }
                if(dato.equals("año")){
                    this.lista.get(pos).get(num-1).setAño(datomod);
                }
                System.out.println("Vehículo Modificado");
                return true;
            }  
        }
        if(tipo.equals("Sedan")){
            pos=2;
            if(this.lista.get(pos).contains(this.lista.get(pos).get(num-1))){
                if(dato.equals("placa")){
                    this.lista.get(pos).get(num-1).setPlaca(datomod);
                    return true;
                }
                if(dato.equals("color")){
                    this.lista.get(pos).get(num-1).setColor(datomod);
                    return true;
                }
                if(dato.equals("marca")){
                    this.lista.get(pos).get(num-1).setMarca(datomod);
                    return true;
                }
                if(dato.equals("año")){
                    this.lista.get(pos).get(num-1).setAño(datomod); 
                }
                System.out.println("Vehículo Modificado");
                return true;
            }  
        }
        if(tipo.equals("Deportivo")){
            pos=3;
            if(this.lista.get(pos).contains(this.lista.get(pos).get(num-1))){
                if(dato.equals("placa")){
                    this.lista.get(pos).get(num-1).setPlaca(datomod);
                    return true;
                }
                if(dato.equals("color")){
                    this.lista.get(pos).get(num-1).setColor(datomod);
                    return true;
                }
                if(dato.equals("marca")){
                    this.lista.get(pos).get(num-1).setMarca(datomod);
                    return true;
                }
                if(dato.equals("año")){
                    this.lista.get(pos).get(num-1).setAño(datomod);
                }
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

    public void ImprimirLista(String tipo){ 
        if(tipo.equals("Camioneta")){
            for(int i=0;i<this.lista.get(0).size();i++){
                System.out.println(this.lista.get(0).get(i).toString());
            }
        }
        if(tipo.equals("Suv")){
            for(int i=0;i<this.lista.get(1).size();i++){
                System.out.println(this.lista.get(1).get(i).toString());
            }
        }
        if(tipo.equals("Sedan")){
            for(int i=0;i<this.lista.get(2).size();i++){
                System.out.println(this.lista.get(2).get(i).toString());
            }
        }
        if(tipo.equals("Deportivo")){
            for(int i=0;i<this.lista.get(3).size();i++){
                System.out.println(this.lista.get(3).get(i).toString());
            }
        }
    }

    public boolean Buscar(String tipo, int posbusq){
        if(tipo.equals("Camioneta")){
            if(posbusq-1>this.lista.get(0).size()-1){
                System.out.println("El vehiculo a buscar no esta dentro del rango de la lista");
                return false;
            }
        System.out.println(this.lista.get(0).get(posbusq-1).toString());    
        return true; 
        }

        if(tipo.equals("Suv")){
            if(posbusq-1>this.lista.get(1).size()-1){
                System.out.println("El vehiculo a buscar no esta dentro del rango de la lista");
                return false;
            }
        System.out.println(this.lista.get(1).get(posbusq-1).toString());    
        return true; 
        }

        if(tipo.equals("Sedan")){
            if(posbusq-1>this.lista.get(2).size()-1){
                System.out.println("El vehiculo a buscar no esta dentro del rango de la lista");
                return false;
            }
        System.out.println(this.lista.get(2).get(posbusq-1).toString());    
        return true; 
        }

        if(tipo.equals("Deportivo")){
            if(posbusq-1>this.lista.get(3).size()-1){
                System.out.println("El vehiculo a buscar no esta dentro del rango de la lista");
                return false;
            }
        System.out.println(this.lista.get(3).get(posbusq-1).toString());    
        return true; 
        }

        return false;
    }
}
