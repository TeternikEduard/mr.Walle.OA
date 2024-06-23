package com.edu.em.task;

public class Task03 {

	public static void main(String[] args) {
		double x = 0.5;
		double n = 20;
		double k = 1;

		double result = Math.sqrt(n * Math.PI) * resultSum(x, n, k);

		System.out.printf("При (x = %1.2f) и (n = %2s) результатом накопления сумм произведений будет: [%2.6f].", x, n,
				result);
	}

	public static double resultSum(double x, double n, double k) {
		double resultSum = 0;

		for (double i = k; i <= n; i++) {
			resultSum += (Math.sin((i * x) / 2) + Math.sin((i * x - 1) / 2)) / (Math.exp(x - 1 / i));
		}
		return resultSum;
	}
}