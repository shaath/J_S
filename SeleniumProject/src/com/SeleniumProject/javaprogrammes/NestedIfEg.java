package com.SeleniumProject.javaprogrammes;

public class NestedIfEg {

	public static void main(String[] args) {
		int a=50;
		int b=200;
		int c=1000;
		
		if(a > b && a > c){
			System.out.println("A is greater");
		}else if (b > a && b > c) {
			System.out.println("B is greater");
		}else if (c > a &&  c > b) {
			System.out.println("C is greater");
		}

	}

}
