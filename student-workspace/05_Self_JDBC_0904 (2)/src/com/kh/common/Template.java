package com.kh.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Template {


	
	
	/**
	 * JDBC 드라이버를 등록하는 메소드이므로 프로그램 실행시 한 번만 하면 됨. (여태 매 메소드마다 집어넣고 실행해왔는데 사실 그럴 필요가
	 * 없다는 것.)
	 */
	public static void registDriver() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * DB의 연결정보를 가지고 있는 Connection 객체를 생성하여 반환해주는 메소드
	 */
	public static Connection getConnection() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("resources/driver.properties"));
			
			// String keyA = prop.getProperty("A");
			// System.out.println("A 키 값의 Value : " + keyA);

			Connection conn = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
			conn.setAutoCommit(false);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	/**
	 * 트랜잭션 처리 메소드 - Connection 객체를 이용하여 commit 작업을 시켜줌.
	 */
	public static void commit(Connection conn) {

		try {
			if (conn != null)
				conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/** Connection 객체를 이용하여 rollback하는 메소드
	 * 
	 */
	public static void rollback(Connection conn) {

		try {
			if (conn != null)
				conn.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * JDBC용 객체를 반납해주는 메소드(각 객체별로) - Connection
	 */
	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	/**
	 * statement 반납 메소드 - 다형성 적용하여 PreparedStatement 객체도 Statement 타입으로 받을 수 있음.
	 */
	public static void close(Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * ResultSet 반납 메소드
	 */
	public static void close(ResultSet rset) {
		try {
			if (rset != null)
				rset.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
