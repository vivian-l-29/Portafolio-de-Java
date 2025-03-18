import java.util.Scanner;

public class Portafolioprueba {
    public static void main(String[] args) {
        
        Scanner Portafolio = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Bienvenidosa mi Byviusk Java [byviusk versión 1.0]");

            System.out.println(" ____              _           _    ");
            System.out.println("| __ ) _   ___   _(_)_   _ ___| | __");
            System.out.println("|  _ \\| | | \\ \\ / / | | | / __| |/ /");
            System.out.println("| |_) | |_| |\\ V /| | |_| \\__ \\   <");
            System.out.println("|____/ \\__, | \\_/ |_|\\__,_|___/_|\\_\\");
            System.out.println("       |___/                        ");
            System.out.println("");
            System.out.println("");

            System.out.println("[?] Selecciona una opción para continuar");
            System.out.println("Proyecto iniciado ---> Mar 18 8:46am 2025");
            System.out.println("");

            System.out.println("+---------------------+");
            System.out.println("[1] La suma de dos números");
            System.out.println("[2] ");
            System.out.println("[3] ");
            System.out.println("[0] Salir");
            System.out.println("[?] ");
            opcion = Portafolio.nextInt();
            
            switch (opcion) {
                case 1:
                    int num1, num2, suma;
                    System.out.println("Ingrese el primer número: ");
                    num1 = Portafolio.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = Portafolio.nextInt();
                    suma = num1 + num2;
                    System.out.println("La suma de los dos números es: " + suma);
                   
                    break;
            
                default:
                    break;
            }
            
    
            } while(opcion != 0);
          
    
        }
    }