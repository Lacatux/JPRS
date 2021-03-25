import java.util.Random;

public class EjercicioNueve {

	public static void main(String[] args) {
		
		int[] a = new int[10], b = new int[10], c = new int[20];
		
		llenar(a);
		llenar(b);
		
		mezclar(a, b, c);	
		
		mostrar(a);
		mostrar(b);
		mostrar(c);	
	}
	
	private static void llenar(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(99) + 1;
		}
	}
	
	private static void mezclar(int[] a, int[] b, int[] c) {
		int cont = 1, contA = 0, contB = 0;
		for (int i = 0; i < c.length; i++) {
			if (cont == 1 && cont == 2) {
				c[i] = a[contA];
				contA++;
			} else if (cont == 3 && cont == 4) {
				c[i] = b[contB];
				contB++;
			}
			if (cont == 4) {
				cont = 0;
			}
			cont++;
		}
	}
	
	private static void mostrar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}