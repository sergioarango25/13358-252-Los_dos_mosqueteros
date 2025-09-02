import java.util.Arrays;



public class Insertion {


	public static void InsertionSort(int[] A) {

		int A = A.length;
		int i = 1;

		while(i < N) {

			int currentElement = A[i];
			int j = i - 1;

			// operador de orden
			while(j>=0 && A[j] > current) {
				// actulizar posicion
				A[j + 1] = A[j];
				j = j - 1;
			}
			// actualizacion del elemento
			A[j + 1] = currentElement;
			i = i + 1;
		}

	}

	public static void main(String[] args) {

		int[] array = [1,8,9,10,22,5] 
		InsertionSort(array);
		System.out.print(arrays.toString);
		
	}
}
