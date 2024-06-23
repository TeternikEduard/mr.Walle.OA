package com.edu.em.task;

import java.util.Random;

public class Task04Test1 {

	public static void main(String[] args) {
		int n = 10;

		double x1 = -2;
		double x2 = 2;
		double y1 = -1;
		double y2 = 1;

		double[][] point = new double[n][2];
		rand(point);

		printOriginal(point);

		int count = check(point, x1, x2, y1, y2);
		
		System.out.println("\nКоличество точек, попавших в заданную область = [" + count + "].");

	}

	public static int check(double[][] arr, double x1, double x2, double y1, double y2) {
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			double x = arr[i][0];
			double y = arr[i][1];
			if (x >= x1 & x <= x2 & y >= y1 & y <= y2) {
				count++;
			}
		}
		return count;
	}

	public static void rand(double[][] arr) {

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

	public static void printOriginal(double[][] arr) {
		System.out.print("Исходный массив точек:\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[ %2.2f ] ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
