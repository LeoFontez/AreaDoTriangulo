package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2;
		
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		if(areaX > areaY) {
			System.out.println("A �rea maior � X");
		}else {
			System.out.println("A �rea maior � Y");
		}
		
		sc.close();

	}

}
