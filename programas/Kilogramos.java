package programas;

import java.util.Scanner;

public class Kilogramos {

     public static void kg() {
        Scanner scannNumeros = new Scanner(System.in);
        System.out.println("+---------------------------------+");
        System.out.println("[Kilogramos]: ");
        double n1 = scannNumeros.nextDouble();
    
        System.out.println("+---------------------------------+");
        System.out.println("[Respuesta]: "+ (n1 * 1000));
        System.out.println("+---------------------------------+");
    }
}
