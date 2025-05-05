import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner Portafolio = new Scanner(System.in);
        int opcion;

        vistas.Vistas.banner();

        do{
            programas.Opciones.opciones();
            System.out.println("[0] Salir");
            System.out.println("[?] ");

            opcion = Portafolio.nextInt();
            
            switch (opcion) {
                case 1:
                    programas.Sumar.suma();
                    break;
            
                    case 2:
                    programas.Resta.resta();
                    break;
            
                    case 3:
                    programas.Multiplicación.multi();
                    break;

                    case 4:
                    programas.División.divi();
                    break;

                    case 5:
                    programas.Modulo.mod();
                    break;

                    case 6:
                    programas.Promedio.prom();
                    break;

                    case 7:
                    programas.Mayor.mayor();
                    break;

                    case 8:
                    programas.Mayort.tres();
                    break;

                    case 9:
                    programas.Metrosacm.mcm();
                    break;

                    case 10:
                    programas.Kilogramos.kg();
                    break;

                default:
                    break;
            }
            
    
            } while(opcion != 0);
          
    
        }
    }