package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Visita {
    LocalDateTime fechaVisita;
    ArrayList<Auto> autosDeInterés;
    ArrayList<Compra> compras;
    public Visita() {
        this.fechaVisita = LocalDateTime.now();
        this.autosDeInterés = new ArrayList<>();
        this.compras=new ArrayList<>();
    }
    
}