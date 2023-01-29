package Utiles;

import java.io.InputStream;
import java.util.Scanner;

public class Interfaz {
        private Scanner sc;

        public String ingresar(){
                sc = new Scanner(System.in);
               return sc.nextLine();
        }                   
        public void imprimir(String impresion){
            System.out.println(impresion);
        }
        
}
