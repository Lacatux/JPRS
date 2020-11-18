import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		boolean dig = true;
		
		do {
			System.out.print("Introduce un n�mero (m�ximo 9 d�gitos): ");
			num = sc.nextInt();
			if (num > 999999999 && num < -999999999) {
				dig = false;
			} else {
				dig = true;
			}
		} while (dig == true);
				
		for (int i = 0; i < 9; i++) {
			if (num < i * 10) {
				num = i;
				break;
			}
		}
		num++;
		System.out.print("Ese n�mero tiene " + num + " d�gitos.");

	}

}
