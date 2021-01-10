package com.test03;

public class PrnTest {
	
	/*
	 * System.out.print()- 줄 바꿈 없음
	 * System.out.println()- 줄 바꿈 포함
	 * 
	 * System.out.printf(String format, Object, Object..., args)
	 * java.util.Formatter
	 */
	
	
	public static void main(String[] args) {
		int i = 100;
		
		System.out.print("1. i : \\" +i +"\n");
		System.out.println("2. i : \t " + i);
		System.out.printf("3. i : %10d", i);
		System.out.println("-------------");
		
		// 시험 점수 결과는 100(su)점이고, 학점은 A(ch)가 나왔다
		// 나의 오늘 감정지수는 90.50(d)%이다.
		int su = 100;                    //10자리
		char ch = 'A';                  //5자리
		double d = 90.50d;      //5자리 (소수점2자리)
		//System.out.printf() 를 쓰자.
		
		//내 문제풀이
		//System.out.printf("시험 점수 결과는 "+%10d + su + "점 이고,");
		//System.out.printf("학점은 "+%10d + ch + "가 나왔다,");
		//System.out.printf("나의 오늘 감정지수는" +%+d +"% 이다." );
		
		//정답
		
		System.out.printf("시험 점수 결과는 %10d, 학점은 '%5c'가 나왔다. \n나의 오늘 감정지수는 %5.2f%%이다.", su, ch, d);
		
		
		
		System.out.println("----------");
		
		//오늘은 11\24 입니다. 제 나이는 00입니다.  제 이름은 000입니다.
		int age = 27;
		String name = "김태린";
		
		//내 답
		//System.out.printf("오늘은 11\\24 입니다. 제 나이는 %d입니다. 제 이름은%s ")
		
		//정답
		System.out.printf("오늘은 11\\24입니다. 제 나이는%d입니다. 제 이름은 %s 입니다.", age, name);
		
	}

}
