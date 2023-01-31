package Utiles;

import java.util.Scanner;

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

}
