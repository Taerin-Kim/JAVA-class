package com.test03;

public class Score {
	
	
	//1. int 형 값 3개를 받아서, 더해서 3으로 나눠서 평균 값을 리턴하는 //double //  getAvg라는 메소드를 만들자
	// 접근은 어디서나 가능하며, non-static으로 만들자.
	
	public double getAvg (int kor, int eng, int math ) {
		
		double avg = (double)(kor + eng+ math)/ 3 ;
		
		return avg;
		
	/*String getAvg = null;
	Switch ((kor1 + eng1 + math1)/3)
	*/
		
	}
	
	
	/*2. double형 평균값 하나를 받아서,
	*값이 90~100 사이면 "A"
	  *       80~89 면  "B"
	 *       70~79 면 "C"
	 *       60~69면 "D"
	 *       ~59면 "F"
	 *       를 리턴하는 getGrade 메소드를 만들자.
	 *       어디서나 접근 가능하며, non-static으로 만들자.
	 *       그리고, 기능은 switch로 만들자, (if사용금지)
	 *       
	 *       hint ! '\' (식)
	 */
	public String getGrade (double avg) {
		String res = null;
		
		switch ((int)avg/10) {
		case 10:
			break;
			
		case 9:
			res = "A";
			break;
			
		case 8:
			res="B";
			break;
		case 7:
			res = "C";
			break;
			
		case 6:
			res = "D";
			break;
			
			default:
				res = "F";
				
		
		}
		
		
		return res;
	}
	
	
	
	
// 3. MTest의  main 메소드에서 getAvg 와 getGrade를 사용하여 홍길동과 이순신의 등급을 출력하자.
}
