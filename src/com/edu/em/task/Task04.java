package com.edu.em.task;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int n = 10;

		double[] x = new double[] { -2, 2 };
		double[] y = new double[] { -1, 1 };

		double[][] point = new double[n][2];
		initRandom(point);

		printOriginal("Исходный массив точек:", point);

		int count = check(point, x, y);
		System.out.println("\nКол-во точек, попавших в заданную область = [" + count + "].");

	}

	public static int check(double[][] arr, double[] x, double[] y) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i][0] >= x[0] & arr[i][0] <= x[1] & arr[i][1] >= y[0] & arr[i][1] <= y[1]) {

				count++;
			}
		}
		return count;
	}

	public static void initRandom(double[][] arr) {

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				Random ran = new Random();
				int rand;
				rand = ran.nextInt(2);
				if (rand == 0) {
					arr[i][j] = r.nextDouble(2.5) * (-1);
				} else {
					arr[i][j] = r.nextDouble(2.5);
				}
			}
		}
	}

	public static void printOriginal(String mess,double[][] arr) {
		
		System.out.println(mess);
		
		System.out.println("_________________________________________");
		System.out.printf("\t |      %s\t|\t%s\t|\n","x =" , "y = ");
		System.out.println("_________________________________________");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("Point %2d |", i + 1);
			
			for (int j = 0; j < arr[i].length; j++) {

				System.out.printf("   [ %6.3f ]\t|", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("_________________________________________");
	}
}