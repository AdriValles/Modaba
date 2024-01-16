import java.util.Scanner;

public class modaba {

	public static void main(String[] args) {
		System.out.println("Introduce el numero de veces que quieres que se repita el bucle");
		Scanner entrada = new Scanner(System.in);
		int repeticiones = entrada.nextInt();
		
		String ymodaba = "y modaba";
		int i =0;
		char a = 'a';
		
		for(i=0; i<repeticiones;i++) {
			System.out.println(ymodaba);
			ymodaba = ymodaba +a;
			
			
		}

	}

}
