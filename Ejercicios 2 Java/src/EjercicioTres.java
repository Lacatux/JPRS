import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0, invertido = 0;
		boolean cont = false;
		
		do {
			System.out.print("Introduce un número (entre 0 y 999999999: ");
			num = sc.nextInt();
			if (num >= 0 && num <= 999999999) {
				
				while(num != 0) {
		            int dig = num % 10;
		            invertido = invertido * 10 + dig;
		            num /= 10;
		        }
				
				cont = true;				
				
			} else {
				System.out.println("\nIntroduce un número válido!\n");
			}
		} while(cont == false);
		
		System.out.println("El número invertido es " + invertido);
		
	}

}
