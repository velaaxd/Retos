import java.util.Scanner;
public class Reto2{
    public static void main(String[] args){
	Scanner vacuna = new Scanner(System.in);

        Double dosisvacuna ;
		Double pesobebe ;
		Double mesesbebe;
		
	
	

		System.out.print("Ingrese peso del bebe");
		pesobebe = Double.parseDouble(vacuna.nextLine());

		System.out.print("Ingrese meses del bebe");
		mesesbebe = Double.parseDouble(vacuna.nextLine());

		dosisvacuna = (pesobebe + 10)/(mesesbebe * 10)*8;

		System.out.print("la dosis de vacuna es:"+dosisvacuna);

		vacuna.close();


	

    }
}