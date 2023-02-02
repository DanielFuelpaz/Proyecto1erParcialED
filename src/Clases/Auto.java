package Clases;

/**
 *
 * @author Gato
 */
public class Auto {
    public String placa;
    public String color;
    public String marca;
    public String año;
    
    public Auto() {
    }

    public Auto(String placa, String color, String marca, String año) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.año = año;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() { 
        return "[Placa: "+placa+" \nColor: "+color+" \nMarca: "+marca+" \nAño: "+año+"]"+"\n";
    }
    
}
