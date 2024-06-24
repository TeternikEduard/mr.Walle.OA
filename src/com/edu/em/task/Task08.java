package com.edu.em.task;

public class Task08 {

	public static void main(String[] args) {
		
		double x = 0.1;
		double dx = 0.1;
		double limit = 10;

		while (x <= limit) {
			double f = Math.pow(x, 2) - Math.exp(2 * x) + 4;
			if (f <= 0) {
				break;
			}
			System.out.printf("При х = [%1.1f] значение функции f = [%2.5f]\n", x, f);
			x += dx;
		}
	}
}