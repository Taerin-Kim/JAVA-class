package com.vehicle;

public class MTest {

	public static void main(String[] args) {
	
		
		Car myCar = new Truck(" 파란"); //출력 : 파란색 트럭 생성
		myCar.accelPedal();                        //속도가 15 올라갑니다
		myCar.accelPedal();
		System.out.println(myCar);
		myCar.breakPedal();
		myCar.breakPedal();
		myCar.breakPedal();
		System.out.println(myCar);


 myCar = new SportsCar("빨간");
	myCar.accelPedal();                        //속도가 15 올라갑니다
	myCar.accelPedal();
	System.out.println(myCar);
	myCar.breakPedal();
	myCar.breakPedal();
	myCar.breakPedal();
	System.out.println(myCar);
		
	}
}
