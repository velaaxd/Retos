

import java.util.Scanner;

public class reto8 {

    public static void main(String[] args) {

        
        
        int contador = 0;
        int maquina = 0;
        int intento = 0;

        
        

        
        maquina = (int) (Math.random()*100)+1;
        
        
        for (int i = 0; i < 10; i++){

            Scanner Leer = new Scanner(System.in);

            
            contador = contador +1;

            
            System.out.println("Ingrese un Numero");
            intento = Leer.nextInt();

            
            if(maquina==intento){
                System.out.println("Felicidades usted gano");
                System.out.println("Intentos: "+contador);
                
                break;

            
            }else if(maquina > intento){
                System.out.println("el numero es mas mayor que "+intento);
            }else if(maquina < intento){
                System.out.println("el numero es mas menor que "+intento);
            }
            
    
        }
        
        if (contador == 10) {
                System.out.println("has sido excedido el numero de  intento"); 
                
                System.out.println("perdiste todas sus vidas");
                


            }

        

        
    }
    
}
