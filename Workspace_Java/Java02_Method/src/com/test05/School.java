package com.test05;

public class School {

	
	//1. 어디서나 접근할 수 있고, static으로 선언되어 있으며,
	//리턴 타입은 없는 namePrn이라는 메소드를 만들자.
	//파라미터는 String 하나 받을거고,
	//받은 값을 가지고 "내이름은 ??? 입니다." 라고 출력하자 (System.out.printf 를 사용)
	
	//1번
	//public static void namePrn (String [] args) {
	//	 name = 김태린
	//	System.out.printf("내이름은%d입니다.", name);
	
	//1번 답
	public static void namePrn (String name) {
		System.out.printf("내 이름은 %s 입니다.\n ", name );
		
	}
	
	/*
	 *  2. 어디서나 접근할 수 있고, static으로 선언되어 있으며
	 *  리턴타입은 int인 getAge 라는 메소드를 만들자.
	 *  파라미터는 없고, 자신의 나이를 리턴하자.
	 */  
	 
	//public static  int getAge(String[] args) {
		//int i = (27);
		//System.out.printf("제 나이는%d 입니다.", i);
	
	//정답
	
	public static int getAge() {
		int age = 27;
		return age;
				
	}
	
	 /*  
	 *  3. 같은 패키지 내에서만 접근 할 수 있고, non-static 이며,
	 *  리턴타입은 없는 addPrn 이라는 메소드를 만들자.
	 *  파라미터는 String 하나 받을 거고,
	 *  받은 값을 가지고 "우리집은 ??? 입니다." 라고 출력하자 (System.out.printf 사용하자)
	 */
	
	//(내 답)
	//protected void aadPrn (String[] args) {
	
	//정답
	void addrPrn(String addr) {
		System.out.printf("우리집은 %s 입니다.\n", addr);
	}
		
	}
	
	
