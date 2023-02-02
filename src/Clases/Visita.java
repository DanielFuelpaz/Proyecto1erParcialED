package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Visita {
    public LocalDateTime fechaVisita;
    public ArrayList<Auto> autosDeInterés;
    public ArrayList<Compra> compras;

    public Visita() {
        this.fechaVisita = LocalDateTime.now();
        this.autosDeInterés = new ArrayList<>();
        this.compras=new ArrayList<>();
    }
    
    public String toString() {
        return "\nFecha: "+fechaVisita.toString();
        
    }
}