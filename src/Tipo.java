
import java.util.ArrayList;


/**
 *
 * @author Gato
 */
public class Tipo {
    ArrayList<ArrayList<Auto>> lista;

    public Tipo(ArrayList<ArrayList<Auto>> lista) {
        this.lista = lista;
    }
    
    public boolean Insertar(ArrayList<Auto>b, Auto a){
        if(this.lista.contains(b)==false){
            this.lista.add(b);
            this.Insertar(b, a);
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
    
    public boolean Modificar (ArrayList<Auto>b, Auto a, String dato, String modificar){
        if(this.lista.contains(b)){
            int pos=this.lista.indexOf(b);
            if(this.lista.get(pos).contains(a)){
                if(dato.equals("placa"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setPlaca(modificar);
                
                if(dato.equals("color"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setColor(modificar);
                
                if(dato.equals("marca"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setMarca(modificar);
                
                if(dato.equals("año"))
                    this.lista.get(pos).get(this.lista.get(pos).indexOf(a)).setAño(modificar);
                
                System.out.println("Vehículo Modificado");
                return true;
            }
        }
        
        return false;
    }
    
    public void imprimir(){   
        for(int i=0;i<this.lista.size();i++){
            for(int j=0;j<this.lista.get(i).size();j++){
                System.out.println(this.lista.get(i).get(j).toString());
                System.out.println(this.lista.get(i).get(j).getPlaca());
                System.out.println(this.lista.get(i).get(j).getColor());
                System.out.println(this.lista.get(i).get(j).getMarca());
                System.out.println(this.lista.get(i).get(j).getAño()+"\n");
                
            }
        }
    }
}
