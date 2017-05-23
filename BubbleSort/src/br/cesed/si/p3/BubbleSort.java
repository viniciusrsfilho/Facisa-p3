package br.cesed.si.p3;

public class BubbleSort {

	static int[] array = new int[] { 7, 2, 8, 5, 4 };

	public static int[] sort(int[] arrayParaOrdenar) {

		for (int i = 0; i < arrayParaOrdenar.length - 1; i++) {

			for (int j = arrayParaOrdenar.length-2; j > -1; j--) {

				if (array[j] > array[j + 1]) {
					int aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}

		return arrayParaOrdenar;
	}

	public static void main(String[] args) {

		int[] arrayOrdenado = sort(array);

		for (int i : arrayOrdenado) {
			System.out.print(i + " ");
		}
	}

}
