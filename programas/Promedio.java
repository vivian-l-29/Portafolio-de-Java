package programas;

import java.util.Scanner;

public class Promedio {
    public static void prom() {
        Scanner scannNumeros = new Scanner(System.in);
        System.out.println("+---------------------------------+");
        System.out.println("[n1]: ");
        double n1 = scannNumeros.nextDouble();
    
        System.out.println("[n2]: ");
        double n2 = scannNumeros.nextDouble();

        System.out.println("[n3]: ");
        double n3 = scannNumeros.nextDouble();
        System.out.println("+---------------------------------+");
        System.out.println("[Respuesta]: "+ (n1+n2+n3)/3);
        System.out.println("+---------------------------------+");
    }
}
