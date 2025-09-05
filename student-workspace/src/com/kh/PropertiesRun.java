package com.kh;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.setProperty("A", "B");
		try {
			 // prop.store(new FileOutputStream("driver.properties"), "setting for DBMS"); -> 작성하고 나면 프로젝트 새로고침 잊지 말 것.
			 prop.storeToXML(new FileOutputStream("member-mapper.xml"), "MEMBER SQL");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}