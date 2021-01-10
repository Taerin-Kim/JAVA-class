package com.test04;

public class Student {

	// 정답
	public static int getSum(int kor, int eng, int math) {

		int res = kor + eng + math;

		return res;

	}
	
	public static double getAvg(int sum) {
		return (double) sum / 3;
	}

	public static void main(String[] args) {
		int kor, eng, math;
		kor = eng = math = 0;

		kor = 100;
		eng = 39;
		math = 78;

		int sum = 0;
		double avg = 0;

		sum = getSum(kor, eng, math);
		System.out.printf("총 합 : %d", sum);
		
		
		//avg = getAvg(sum);
		avg = getAvg(getSum(kor, eng, math));
		System.out.println("평균 :" + String.format( "%2f",  avg)); 
	
	
		
		/*
		 * student 클래스 안에서 만들자 1. 과목 파라미터 세개를 넣어주면 총점을 리턴하는 getSum이라는 이름의 메소드를 만들자. 2. 총
		 * 합 파라미터 한개를 가진 getAvg라는 이름의 메소드를 만드는데, 리턴은 평균을 리턴한다. 3. main 메소드에서 위의 메소드들을
		 * 호출하여 각각 sum 변수와 avg변수에 리턴되는 값을 담고, 해당변수들을 출력하자.
		 * 
		 * +평균은 소수점 둘째자리까지만 출력하자.
		 */
	}

}
