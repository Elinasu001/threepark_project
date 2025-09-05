package com.kh.statement.run;

import com.kh.common.JDBCTemplate;
import com.kh.statement.view.StudentView;

public class StudentRun {

	public static void main(String[] args) {
		
		JDBCTemplate.regisDriver();
		StudentView sv = new StudentView();
		sv.mainMenu();
	}

}
