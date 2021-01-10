package com.test02;

public class Gugudan_01 {

	public static void main(String[] args) {
		// for문 사용하여 출력!!
		// while문 사용 금지!

		// 1. 2단부터 9단까지 전체 출력
		// gugu01();
		guguWhile01();

		// 2. 아규먼트로 들어온 값의 단만 출력
		// gugu02(5);
		guguWhile02();
	}

	public static void guguWhile01() {

		// 초기값
		int i = 2;
//조건식
		while (i < 10) {
			System.out.println("<" + i + "단>");

			int j = 1;
			while (j < 10) {
				System.out.printf("%d *%d = %d\n", i, j, (i * j));
				j++;
			}
		
			// 증감식
			i++;
			System.out.println(); 
			
		}

	}

	public static void guguWhile02() {

	}

	public static void gugu01() {
		for (int i = 2; i < 10; i++) {
			System.out.println("<" + i + "단>");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, (i * j));
			}

			System.out.println();
		}

	}

	public static void gugu02(int dan) {

		System.out.println("<" + dan + "단>");

		for (int j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", dan, j, (dan * j));
		}
	}

}
