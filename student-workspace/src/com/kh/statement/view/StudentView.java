package com.kh.statement.view;

import java.util.List;
import java.util.Scanner;

import com.kh.statement.controller.StudentController;
import com.kh.statement.model.vo.Student;


public class StudentView {

	private Scanner sc = new Scanner(System.in);
	private StudentController stc = new StudentController();
	
	public void mainMenu() {
		while(true) {
			System.out.println(" ------- 학생 관리 프로그램 ------- "); 
			System.out.println("1. 학생 전체 조회");
			System.out.println("2. 학번별 학생 조회");
			System.out.println("3. 학생 성명 조회");
			System.out.println("4. 전공별 학생 조회");
			System.out.println("5. 기숙사별 학생 조회");
			System.out.println("6. 학생 추가");
			System.out.println("7. 학생 변경");
			System.out.println("8. 학생 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : findAll(); break;
//			case 2 : findByNum(); break;
//			case 3 : findByNAme(); break;
//			case 4 : findByMaj(); break;
//			case 5 : findByDorm(); break;
//			case 6 : insert(); break;
//			case 7 : update(); break;
//			case 8 : delete();  break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("유효하지 않은 입력입니다.");
						
			}
		}
	
	}
	
	private void findAll() {
		System.out.println("\n전체 학생 목록입니다.");
		
		List<Student> students = stc.findAll();
		
		System.out.println("\n조회된 총 사원수는 " + students.size() + "명 입니다.");
		
		if(students.isEmpty()) {
			System.out.println("조회결과가 존재하지 않습니다.");
		} else {
			
			for(Student student : students) {
				System.out.println("========================");
				System.out.println("학번 : " +student.getStudentId() + ", ");
				System.out.print("성명 : " + student.getStudentName() + ", ");
				System.out.print("생년월일 : " + student.getBirthDate() + ", ");
				System.out.print("성별 : " + student.getGender() + ", ");
				System.out.print("입학일 : " + student.getEnrollDate() + ", ");
				System.out.print("전공ID : " + student.getMajorId() + ", ");
				System.out.print("기숙사ID : " + student.getDormId() + ", ");
				System.out.println();
				
			}
		}
	}
	
	
	
	
	
	
	
}
