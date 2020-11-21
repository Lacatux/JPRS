import java.util.Scanner;

public class EjercicioCinco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0, num = 0;
		
		System.out.print("Introduce un número n: ");
		n = sc.nextInt();
		
		System.out.println("Estos son los " + n + " primeros números impares: ");
		num = 1;
		for (int i = 0; i < n; i++) {			
			System.out.print(num + " ");
			num = num + 2;
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
		}
	}

}
