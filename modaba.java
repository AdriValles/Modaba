import java.util.Scanner;

public class modaba {

	public static void main(String[] args) {
		System.out.println("Introduce el numero de veces que quieres que se repita el bucle");
		Scanner entrada = new Scanner(System.in);
		int repeticiones = entrada.nextInt();
		
		String ymodaba = "y modaba";
		int i =0;
		char a = 'a';
		if ( repeticiones <10){
		for(i=0; i<repeticiones;i++) {
			System.out.println(ymodaba);
			ymodaba = ymodaba +a;
		}}else {
			System.out.println("Te has pasado")
		
			
		}

	}

}
