import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cifras = 0;
		boolean cont = false;

		while (cont == false) {
			System.out.print("Introduce un n�mero (9 d�gitos m�ximo): ");
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
				System.out.println("�Ese n�mero tiene m�s de 9 cifras!\n\n");
			}
		}
		System.out.println("El n�mero tiene " + cifras+ " cifras");
	}

}
