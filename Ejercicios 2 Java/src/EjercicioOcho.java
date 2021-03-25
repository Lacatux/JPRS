import java.util.Random;

public class EjercicioOcho {

	public static void main(String[] args) {		
		
		int[] array = new int[10];
		
		rellenar(array);
		mostrar(array);
		cambiar(array);
		
	}
	
	private static void rellenar(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50) + 1;
		}
	}
	
	private static void mostrar(int[] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	private static void cambiar(int[] array) {
		int aux = 0;
		
		aux = array[0];
		array[0] = array[9];
		array[9] = aux;
		
		aux = array[1];
		array[1] = array[8];
		array[8] = aux;
		
		aux = array[2];
		array[2] = array[7];
		array[7] = aux;
		
		aux = array[3];
		array[3] = array[6];
		array[6] = aux;
		
		aux = array[4];
		array[4] = array[5];
		array[5] = aux;
		
		mostrar(array);
		
	}

}
