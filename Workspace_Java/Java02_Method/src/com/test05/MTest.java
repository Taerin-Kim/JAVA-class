package com.test05;

public class MTest {
	
	public static void main(String [] args) {
		
		// School class에 만들어 놓은 1,2,3,번 메소드를 호출하여 console에 출력하자
		
		//1번 답
		
		School.namePrn("김태린");
		
		//2번 답
		
		int age = School.getAge();
		System.out.println(age + "세");
		
		//3번 답
		
		School kh = new School();
		kh.addrPrn("서울시");
		

	}
	
}
