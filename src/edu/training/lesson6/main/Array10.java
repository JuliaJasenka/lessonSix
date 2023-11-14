package edu.training.lesson6.main;

public class Array10 {

	public static void main(String[] args) {
		/*
		 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		 * которых аi > i.
		 */

		int[] arr = { 4, 9, 5, 1, -5, 5, 9, 2, -7 };
		
		System.out.println("Вывод чисел, удовлетворяющих условию a[i] > i:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {

				System.out.print(arr[i] + "   ");
			}

		}

	}

}
