package com.edu.em.task;

public class Task01 {

	public static void main(String[] args) {

		double x = 0.5;

		double result = resultF(x);

		System.out.printf("При x = [%1.1f] получаем результат [%3.5f].", x, result);

	}

	public static double resultF(double x) {

		double result = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + (2.0 / 3.0)))) + 1.7;

		return result;
	}
}
