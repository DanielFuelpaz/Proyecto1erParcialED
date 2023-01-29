package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Visita {
    LocalDateTime fechaVista;
    ArrayList<Auto> autosDeInterés;

    public Visita() {
        this.fechaVista = LocalDateTime.now();
        this.autosDeInterés = new ArrayList<>();
    }
    
}