package com.edu.em.task;

public class Task07 {

	public static void main(String[] args) {
		int n = 5;
		int m = 8;

		double x = 10;
		double dx = 0.5;
		double z = 5;
		double dz = 0.05;

		print(n, m, x, dx, z, dz);

	}

	public static double function(double x, double z) {

		double y = Math.sqrt(z * z + x * x) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
		return y;
	}

	public static void print(int n, int m, double x, double dx, double z, double dz) {

		System.out.print("  x/z    | ");
		for (int i = 0; i < m; i++) {
			System.out.printf("z = %2.2f |", z);
			z += dz;
		}
		System.out.println();

		for (int i = 0; i < m + 1; i++) {
			System.out.print("__________");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.printf("x = %2.1f | ", x);
			for (int j = 0; j < m; j++) {

				double y = function(x, z);

				System.out.printf("[%2.4f]", y);
				System.out.print("|");

				z += dz;
			}
			System.out.println();

			x += dx;
		}
	}
}
