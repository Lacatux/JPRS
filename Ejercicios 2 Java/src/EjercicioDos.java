import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cifras = 0;
		boolean cont = false;

		while (cont == false) {
			System.out.print("Introduce un número (9 dígitos máximo): ");
			n = sc.nextInt();
			cifras= 0;
			if (n < 999999999) {
				while(n!=0){
					n = n/10;
					cifras++;
				}
				cont = true;
			}
			else {
				System.out.println("¡Ese número tiene más de 9 cifras!\n\n");
			}
		}
		System.out.println("El número tiene " + cifras+ " cifras");
	}

}
