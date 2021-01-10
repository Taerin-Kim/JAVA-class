package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest04 {

	// DEPT 테이블에 값 저장
	public static void main(String[] args) {
		insert();

	}

	public static void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println(" 부서이름 입력 : ");
		String dname = sc.next();
		System.out.println(" 지역 입력 : ");
		String loc = sc.next();
		
		// 1. 드라이버 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		// 2. ,계정연결
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "kh";
		String password = "kh";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		// 3. 쿼리준비
		// 4. 쿼리실행 
		
		String sql = " INSERT INTO DEPT "
				+ "  VALUES ( "  + deptno + " , ' " + dname + " ', ' " + loc + " ' ) ";
		Statement stmt = null;
		//ResultSet rs = null;
		
		try {
			
			stmt = con.createStatement();
		
		int res = stmt.executeUpdate(sql);
		if(res>0) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				stmt.close();
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		
	}

}
