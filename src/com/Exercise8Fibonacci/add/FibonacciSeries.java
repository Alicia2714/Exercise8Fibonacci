package com.Exercise8Fibonacci.add;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Variable declaration
		
		long fibonacci = 1;
		long contador1 = 0;
		long contador2= 1;
		int iteraciones =0;
		
		//Object declaration
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Ingrese la cantidad de iteraciones que desee: ");
			iteraciones = input.nextInt();	
			if(iteraciones<=0) {
				System.out.println("Please, introduce a positive value.");
			}
		}while(iteraciones<=0);
		
		
		for (int i=0; i<iteraciones; i++) {
			System.out.println(fibonacci +", ");
			
			fibonacci = contador1+contador2;
			contador1=contador2;
			contador2=fibonacci;
		}
		
		

	}

}
