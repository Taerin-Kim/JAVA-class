package com.test03;

public class MyCalc {

	// 접근제한자 메모리영역 리턴타입 메소드이름 (파라미터) ((파라미터는 입력임))((나오는값은 타입))

	// 더하기
	public static int sum(int i, int j) {
		System.out.print("i : " + i + "\t j : " + j + "\t result : ");
		int result = i + j;

		return result;

	}

	// 빼기
	public static void sub(int i, int j) {
		int result = i - j;
		System.out.printf("%d - %d = %d\n", i, j, result);

	}

	// 곱하기
	// double 형 파라미터 2개를 받아서
	// 두 수를 곱해서
	// 곱한 결과값을 리턴하는데, 리턴하는 값도 double형
	// 메소드 이름은 mul
	// 메모리영역은 static
	// 어디서나 접근 가능

	public static double mul(double d1, double d2) {
		double result = d1 * d2;

		return result;

	}

	// 나누기

	public void div(int i, int j) {

		// '/' : 나눈 값
		int div01 = i / j;

		// '%' : 나머지
		int div02 = i % j;

		System.out.printf("%d / %d = %d\n", i, j, div01);
		System.out.printf("%d %% %d = %d\n", i, j, div02);

	}

}
