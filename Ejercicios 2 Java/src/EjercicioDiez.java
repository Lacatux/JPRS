
public class EjercicioDiez {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		llenar(array);
		mostrar(array);
		
	}
	
	private static void llenar(int[][] array) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i % 2 == 0) {
					array[i][j] = i + j;
				} else {
					array[i][j] = i * j;
				}
			}
		}
	}
	
	private static void mostrar(int[][] array) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
