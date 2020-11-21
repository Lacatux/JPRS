import java.util.Scanner;

public class EjercicioSiete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		for (int i = 0; i <= num; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = num; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		for (int i = 0; i < num; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = num; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
