package programas;

import java.util.Scanner;

public class Metrosacm {
     public static void mcm() {
        Scanner scannNumeros = new Scanner(System.in);
        System.out.println("+---------------------------------+");
        System.out.println("[metros]: ");
        double n1 = scannNumeros.nextDouble();
    
        System.out.println("+---------------------------------+");
        System.out.println("[Respuesta en centimetros]: "+ (n1 * 100));
        System.out.println("+---------------------------------+");
    }
}
