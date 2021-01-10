package com.test02;

public class Gugudan {

	public static void main(String[] args) {
		// for문 사용하여 출력!!
		// while문 사용 금지!

		// 1. 2단부터 9단까지 전체 출력
		gugu01();

		// 2. 아규먼트로 들어온 값의 단만 출력
		gugu02(5);

	}

	public static void gugu01() {
		// for(초기값;조건식;증감식)
		int i = 0 ;
		int j = 0;
//2단 곱하기 출력
		for (int i1= 2; i1<10;i1++ ) {
			System.out.printf("\n%d단", i1);
			
			for(int j1=1; j1<10; j1++) {
				
				System.out.printf("\n%d * %d = %d", i1, j1, i1*j1);
			}
			
			System.out.println();
		}
			
	}

	public static void gugu02(int dan) {
		

	}

}
