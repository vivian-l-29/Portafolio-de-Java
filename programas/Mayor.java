package programas;

import java.util.Scanner;

public class Mayor {
    public static void mayor() {
        Scanner scannNumeros = new Scanner(System.in);
        System.out.println("+---------------------------------+");
        System.out.println("[n1]: ");
        double n1 = scannNumeros.nextDouble();
    
        System.out.println("[n2]: ");
        double n2 = scannNumeros.nextDouble();

        System.out.println("+---------------------------------+");
        if (n1 > n2) {
            System.out.println("El numero mayor es:" + n1);
            System.out.println("El numero menor es:" + n2);
        }
        else
            System.out.println("El numero mayor es:"+n2);
            System.out.println("El numero menor es:" + n1);

        System.out.println("+---------------------------------+");
    }
}
