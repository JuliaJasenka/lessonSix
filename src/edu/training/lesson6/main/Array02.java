package edu.training.lesson6.main;

import java.util.Random;

public class Array02 {

	public static void main(String[] args) {
		// Дана последовательность целых чисел а1 а2,..., аn . Выяс¬нить, какое число
		// встречается раньше - положительное или отрицательное.

		int[] a = new int[6];

		Random random = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(21) - 10;
		}

		if (a[0] > 0) {
			System.out.println("Положительное число встречается раньше.");
		} else {
			System.out.println("Отрицательное число встречается раньше.");
		}

	}

}
