import java.util.*;
public class Reto5 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int n;
        double precio, total = 0;
        
        System.out.print("Ingrese la cantidad de productos a comprar: ");
        n = Leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            precio = Leer.nextDouble();
            total += precio;
        }
        
        System.out.println("El total de la compra es: " + total);
    }
}