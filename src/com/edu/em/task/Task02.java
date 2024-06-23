package com.edu.em.task;

public class Task02 {

	public static void main(String[] args) {

		double a = 0.5;
		double b = 1.0;
		double h = 0.05;

		System.out.println(" _________________________________");
		System.out.println("|  № |  при[х] = |\t[f(x)] =  |");
		System.out.println(" _________________________________");
		
		int i = 1;
		for (double x = a; x <= b; x = x + h) {
			
			double fx = Task01.resultF(x);

			System.out.printf("| %2d |\t  %2.2f\t |\t%2.5f\t  |\n", i, x, fx);
			i++;
		}
		System.out.println(" _________________________________");
	}
}