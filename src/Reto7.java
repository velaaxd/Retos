import java.util.*;
public class Reto7 {
    public static void main(String args[]) {

        
        int numeroUsuario, vidaJugador = 3;
        int R = (int)(Math.random() * 3) + 1;
        double Acumulado = 0;
        final double Apuesta = 100000;

        
        Scanner Leer = new Scanner(System.in);
 
        
        
        while(vidaJugador  > 0){

        System.out.println("Piedra = 1, Papel = 2 y Tijeras = 3"); 
        numeroUsuario = Leer.nextInt();

        switch ( R ){

            case 1: System.out.println("Piedra");
                
                switch ( numeroUsuario ) {

                   case 1: 

                   System.out.println("Empataste"); break;

                   case 2: 
                   System.out.println("Ganaste $10.000"); 
                    Acumulado = Apuesta + 10000; break;

                   case 3: 
                   System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000;
                    vidaJugador = vidaJugador - 1; break;
                    
                }
                break;
 
            case 2: System.out.println("Papel");
                
                switch ( numeroUsuario ) {
                   case 1: 
                   System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000; 
                    vidaJugador = vidaJugador - 1;break;

                   case 2: 
                   System.out.println("Empataste"); break;

                   case 3: 
                   System.out.println("Ganaste $10.000"); 
                    Acumulado = Apuesta + 10000; break;

                }
                break;
 
            case 3: System.out.println("Tijeras");
                
                switch ( numeroUsuario ) {
                   case 1: 
                   System.out.println("Ganaste $10.000"); 
                    Acumulado = Apuesta + 10000; break;

                   case 2: 
                   System.out.println("Perdiste $10.000");     
                    Acumulado = Apuesta - 10000; 
                    break;

                   case 3: 
                   System.out.println("Empataste"); break;

                }
                
                break;
        }Leer.close();

    }
    
    System.out.println(" perdio todas sus vidas y Termino con: "+Acumulado);
    }
}