package com.edu.em.task;

public class Task05 {

	public static void main(String[] args) {

		int N = 20;
		double a = 1;
		double x = -2 * a;
		double dx = a / 5;

		fx(N, a, x, dx);

	}

	public static void fx(int N, double a, double x, double dx) {

		double y;

		System.out.println(" _________________________________");
		System.out.println("|  № |  при[х] = |\t[f(x)] =  |");
		System.out.println(" _________________________________");

		for (int i = 0; i < N; i++) {
			if (x <= 0) {
				y = (a / 2) * (Math.exp(x / a) + Math.exp(-x / a));
				System.out.printf("| %2d |\t  %2.2f\t |\t%2.5f\t  |\n", i + 1, x, y);
			} else {
				y = (4 * Math.pow(a, 3)) / (x * x + 4 * a * a);
				System.out.printf("| %2d |\t  %2.2f\t |\t%2.5f\t  |\n", i + 1, x, y);
			}
			x += dx;
		}
		System.out.println(" _________________________________");
	}
}
