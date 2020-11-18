import java.util.Scanner;

public class EjercicioUno {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		int aux = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = sc.nextInt();
		}
		
		do {
			if (numeros[0] > numeros[1]) {
				aux = numeros[1];
				numeros[1] = numeros[0];
				numeros[0] = aux;
			} else if (numeros[1] > numeros[2]) {
				aux = numeros[2];
				numeros[2] = numeros[1];
				numeros[1] = aux;
			}
		} while (numeros[0] > numeros[1] || numeros[1] > numeros[2]);
		
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}