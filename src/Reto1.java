import java.util.Scanner;
public class Reto1{
    public static void main(String[] args){
        Scanner abue = new Scanner(System.in);
        double  fahrenheit ;
        double  grados ;
        double  num = 32;
        
        

        System.out.print(" Ingrese la temperatura en grados:");
        grados = Double.parseDouble(abue.nextLine());

        fahrenheit = (grados-num)/1.8;

        System.out.println("Grados Fahrenheit: "+fahrenheit);
        abue.close();

    }
}