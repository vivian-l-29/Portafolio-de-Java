package programas;

public class Opciones {
    
    static String Lista [] = {
        "Suma de dos números",
        "Resta de dos números",
        "Multiplicación de dos números",
        "División de dos números",
        "Módulo (Residuo de una división)",
        "Promedio de tres números",
        "Número mayor y menor entre dos números",
        "Número mayor y menor entre tres números",
        "Conversión de metros a centimetros",
        "Conversión de kilogramos a gramos",
    };

    // MÉTODO MOTRAR OPCIONES
    public static void opciones () {

        for (int i = 0; i < Lista.length; i++) {
            System.out.println("["+ (i+1) +"] " + Lista[i]);   
        }
        
    }
}
