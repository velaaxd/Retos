import java.util.Scanner;
import java.util.Random;

public class Reto3 {

public static void main(String[] args) {
    
    Scanner Leer = new Scanner(System.in);
    Random random = new Random();
    
    int S;
    
    System.out.println("Elija sello o cara :[1],[2] ");
    S =Leer.nextInt();

    switch(S){

        case 1:
        int i = random.nextInt(2);
        if (i == 0) {
            System.out.println ("Felicidades salio Sello");
        } else if (i == 1) {
            System.out.println ("salio Cara usted perdio");
        }
            break;

        case 2:
        int H = random.nextInt(2);
        if (H == 0) {
            System.out.println ("salio Sello usted perdio");
        } else if (H == 1) {
            System.out.println ("Felicidades salio Cara");
        }
            break;

       
        }
        Leer.close();
    }
}