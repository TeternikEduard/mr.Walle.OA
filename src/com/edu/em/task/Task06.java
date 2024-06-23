package com.edu.em.task;

import java.util.Arrays;
import java.util.Random;

public class Task06 {

	public static void main(String[] args) {

		int[] arrK = new int[20];
		rand(arrK);

		isValid(arrK);
	}

	public static double fk(int k) {

		double y = Math.pow(k, 3) - 25 * k * k + 50 * k + 1000;

		return y;
	}

	public static void isValid(int[] arrK) {

		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4;
		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		int count = 0;
		for (int i = 0; i < arrK.length; i++) {

			double y = fk(arrK[i]);

			if ((y >= t1 & y <= t2) || (y >= t3 & y <= t4)) {
				System.out.printf("Значение функции f(k) равно [%8.2f] при k = [%2d].\n", y, arrK[i]);
			} else {
				count++;
			}
		}
		System.out.println("\nКоличество значений, не удовлетворяющих условию (вне заданных значений) = [" + count + "].");
	}

	public static void rand(int[] arrK) {

		Random rand = new Random();

		for (int i = 0; i < arrK.length; i++) {
			arrK[i] = rand.nextInt(90) - 30;
		}
		Arrays.sort(arrK);
	}
}