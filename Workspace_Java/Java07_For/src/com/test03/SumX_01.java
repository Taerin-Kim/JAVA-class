package com.test03;

public class SumX_01 {

	public static void main(String[] args) {

		int count = 1;
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i == j) || (i + j == 4)) {
					sum += count;
				}

				System.out.printf("%3d", count++);
			}
			System.out.println();
		}

		System.out.println("\nX의 총 합 : " + sum);
	}

}
