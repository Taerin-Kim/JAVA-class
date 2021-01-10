package com.test03;

public class SumX {

	/*
	 * 1      2     3    4    5  
	 * 6      7     8    9   10 
	 * 11 12 13 14     15
	 * 16 17 18 19     20
	 * 21 22 23 24     25
	 * 이렇게 출력하고,
	 * X의 합을 출력하자. hint %3
	 * X의 합 = 117
	 */
	
	public static void main(String[] args) {
	
		int i = 0;
		
		for (i=1; i<26; i++) {
			System.out.print(i);
			if(i%5==0) {
				System.out.println();
				}
		}
	int sum = 0;
		
		for (i=1;i<26;i++) {
			if (i%3==0) {
				sum=+ i;
				System.out.printf("\n%d", sum=+i);
			}
			System.out.println();
		}
	}
}
	
		
		
	
	

