package edu.training.lesson6.main;

import java.util.Random;

public class Array01 {

	public static void main(String[] args) {
		// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
		// кратны данному К.

		int n = 10;
		int k = 2;
		int sum = 0;
		int[] a = new int[n];

		Random random = new Random();

		for (int i = 0; i < n; i++) {
			a[i] = random.nextInt(100);
		}
		for (int i = 0; i < n; i++) {
			if (i % k == 0) {
				sum += a[i];
			}
			
		}
		System.out.println(sum);
	}

}
