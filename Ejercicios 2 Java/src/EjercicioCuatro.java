import java.util.Scanner;

public class EjercicioCuatro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d = 0, m = 0, a = 0;
		boolean valid = false;

		System.out.print("Introduce el día: ");
		d = sc.nextInt();
		System.out.print("Introduce el mes: ");
		m = sc.nextInt();
		System.out.print("Introduce el año: ");
		a = sc.nextInt();

		System.out.println();

		if (d >= 1 && d <= 31 && m >= 1 && m <= 12) {

			switch (m) {
			case 2:

				if (d < 28) {
					d++;
				} else if (d == 28) {
					d = 1;
					m++;
				} else {
					valid = false;
					break;
				}

				valid = true;
				break;
			case 1,3,5,7,8,10,12: //31 dias

				if (d == 31) {
					if (m == 12) {
						d = 1;
						m = 1;
						a++;
					} else {
						d = 1;
						m++;
					}
				} else {
					d++;
				}

			valid = true;
			break;
			case 4,6,9,11: //30 dias

				if (d < 30) {
					d++;
				} else if (d == 30) {
					d = 1;
					m++;
				} else {
					valid = false;
					break;
				} 

				valid = true;
			break;
			default:
				valid = false;
				break;
			}
			if (valid) {
				System.out.println("El dia siguiente es el " + d + "/" + m + "/" + a + ".");
			} else {System.out.println("Introduce una fecha válida!");}
		} else {
			System.out.println("Introduce una fecha válida!");
		}

	}

}
