
import java.util.Scanner;

public class reto4 {
    
    public static void main(String[] args) {
       
        int opcion;
        int random;
        

        System.out.println("piedra papel o tijera ");
        System.out.println("elige tu opcion: piedra:1, papel:2, tijera:3");

        Scanner leer=new Scanner(System.in);
        opcion=leer.nextInt();
        random=(int) (Math.random()*3)+1;
        

        if(random==1 && opcion==1){
            System.out.println("respuesta tijera");
            System.out.println("felicidads has ganado");
        }
        else if(random==1 && opcion==2){
            System.out.println("respuesta tijera");
            System.out.println("has perdido");
       
        }
        else if(random==3 && opcion==1){
            System.out.println("empate");
        }
        else if(random==2 && opcion==2){
            System.out.println("respuesta piedra");
            System.out.println("has ganado");
        }
        else if(random==3 && opcion==3){
            System.out.println("respuesta piedra");
            System.out.println("has perdido ");
        
        
        }
        else if(random==3 && opcion==2){
            System.out.println("empate");
        }
        else if(random==2 && opcion==1){
            System.out.println("respuesta papel");
            System.out.println("has perdido");
        
        }
        else if(random==2 && opcion==3){
            System.out.println("respuesta papel");
            System.out.println("felicidades has ganado");
        }
        else if(random==1 && opcion==3){
            System.out.println("empate");
        }
        
        leer.close();
    }
}