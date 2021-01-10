package com.test02;

import com.test01.Method01;

public class MethodTest03 {

	public static void main(String[] args) {
		// 1. static method
		Method01.publicMethod();
		//Method01.protectedMethod();   //같은 패키지가 아니라서 not visible
		//Method01.defaultMethod();
		//Method01.privateMethod();
		
		// 2. non-static method
		Method01 test = new Method01();
		test.nonStaticMethod();
		
	}
}
