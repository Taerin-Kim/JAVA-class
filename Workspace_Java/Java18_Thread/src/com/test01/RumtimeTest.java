package com.test01;

import java.io.IOException;

public class RumtimeTest {

	public static void main (String[]args) {
		Runtime rt = Runtime.getRuntime();
		
		try {
			Process prc = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		} catch (IOException e) {	
			e.printStackTrace();
		}
		
	}
}
