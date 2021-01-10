package com.test02;

class MyCalc extends Thread {
	int start;
	int end;
	int sum;

	public MyCalc (int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
			System.out.println("Current Thread : " + currentThread().getName());
		}
	}
}

public class MTest {

	public static void main(String[] args) {

	}

}
