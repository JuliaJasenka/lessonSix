package edu.training.lesson6.main;

import java.util.Random;

public class Array08 {

	public static void main(String[] args) {
		/*
		 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
		 * в нем отрицательных, положительных и нулевых элементов.
		 */

		int possitiveNumbers = 0;
		int negativeNumbers = 0;
		int zeroNumbers = 0;
		int length = 14;
		int[] arr = new int[length];

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(41) - 10;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				possitiveNumbers = possitiveNumbers + 1;
			}
			if (arr[i] < 0) {
				negativeNumbers = negativeNumbers + 1;
			}
			if (arr[i] == 0) {
				zeroNumbers = zeroNumbers + 1;
			}

		}
		System.out.println("Количество положительных элементов: " + possitiveNumbers);
		System.out.println("Количество отрицательных элементов: " + negativeNumbers);
		System.out.println("Количество нулевых элементов: " + zeroNumbers);
	}

}
