package Utiles;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interfaz {
    private Scanner sc;

    public String ingresar() {
        sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public int ingresarEntero() {
        sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void imprimir(String impresion) {
        System.out.println(impresion);
    }

    public void imprimirS(String impresion){
        System.out.print(impresion);
    }

    public boolean verificarnúmero(String cadena){
        Pattern patter = Pattern.compile("[0-9]*");
        Matcher matcher = patter.matcher(cadena);
        return matcher.matches();
    }
}
