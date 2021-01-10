package com.test01;

public class MethodTest02 {
	
	public static void main(String[] args) {
		// method 호출 방법
		// 1.  static method : class.method();
		
		Method01.publicMethod();
		Method01.protectedMethod();
		Method01.defaultMethod();
		//Method01.privateMethod();     //private method 는 해당 class 내에서만  (not visible)
		//Method01.abc();                         // abc는 없다. (undefined)
		
		
		
	
		// 2. non-static method 
		//class(참조타입) 변수 = new class();
		//변수.method();
		Method01 method01 = new Method01();
		//타입         변수               = 값
		method01.nonStaticMethod();
		
		//objectaid
		//UML : Unified Modeling Language 

	}

}
