package programas;

import java.util.Scanner;

public class Mayort {
    public static void tres() {
        Scanner scannNumeros = new Scanner(System.in);
        System.out.println("+---------------------------------+");
        System.out.println("[n1]: ");
        double n1 = scannNumeros.nextDouble();
    
        System.out.println("[n2]: ");
        double n2 = scannNumeros.nextDouble();
       
        System.out.println("[n3]: ");
        double n3 = scannNumeros.nextDouble();

        System.out.println("+---------------------------------+");
        
        double numa = n1;
        if (n2 > numa) numa = n2;
        if (n3 > numa) numa = n3;

        double nume = n1;
        if (n2 < nume) nume = n2;
        if (n3 < nume) nume = n3;

        System.out.println("El número mayor es: " + numa);
        System.out.println("El número menor es: " + nume);
    }
}
