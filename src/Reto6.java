import java.util.Scanner;
import java.util.Random;

public class Reto6 {
    public static void main(String[] args) {
        boolean seguirJugando = false;
        Scanner Leer = new Scanner(System.in);
        Random random = new Random();
        int acumulado = 0;
    
        do {
    
            System.out.println("Digite la cantidad de dinero a apostar: ");
            int cantidadApostada = Leer.nextInt();
    
            System.out.println("Elija sello o cara: [1] para sello, [2] para cara");
            int eleccion = Leer.nextInt();
    
            // Validación de entrada
            while (eleccion != 1 && eleccion != 2) {
                System.out.println("Opción inválida. Elija [1] para sello, [2] para cara");
                eleccion = Leer.nextInt();
            }
    
            int resultado = random.nextInt(2);
    
            if ((eleccion == 1 && resultado == 0) || (eleccion == 2 && resultado == 1)) {
                System.out.println("¡Felicidades! usted gano " + cantidadApostada + ".");
                acumulado += cantidadApostada * 2;
            } else {
                System.out.println("usted perdió " + cantidadApostada + ".");
                acumulado -= cantidadApostada;
            }
    
            System.out.println("su total es de: " + acumulado);
    
            System.out.println("¿Desea seguir jugando? [si] o [no]");
            String respuesta = Leer.next();
    
            // Validación de entrada
            while (respuesta.equalsIgnoreCase("si") && respuesta.equalsIgnoreCase("no")) {
                System.out.println("Opción inválida. Elija [si] o [no]");
                respuesta = Leer.next();
            }
    
            seguirJugando = respuesta.equalsIgnoreCase("si");
    
        } while (seguirJugando);
    
        System.out.println("Gracias por jugar. Su ganancia total es de " + acumulado + ".");
        Leer.close();
    }

}