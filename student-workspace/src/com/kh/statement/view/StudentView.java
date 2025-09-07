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
			System.out.println("2. 학생 정보 조회 (ID)");
			System.out.println("3. 학생 정보 조회 (학생 이름)");
			System.out.println("4. 학생 정보 조회 (전공명)");
			System.out.println("5. 학생 정보 조회 (기숙사명)");
			System.out.println("6. 학생 아이디로 전공 정보 수정 ");
			System.out.println("7. 학생 아이디로 기숙사 정보 수정");
			System.out.println("8. 학생 추가");
			System.out.println("9. 학생 삭제(자퇴/재적 여부)");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : findAll(); break;
			case 2 : findById(); break;
			case 3 : findByName(); break;
			case 4 : findByMajor(); break;
			case 5 : findByDormitory(); break;
			case 6 : updateStudent(); break;
			case 7 : updateDormitory(); break;
			case 8 : save();  break;
			case 9 : delete();  break;
			case 10 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("유효하지 않은 입력입니다.");
						
			}
		}
	
	}
	
	private void findAll() {
		System.out.println("---------- 학생 전체 조회 서비스입니다. ---------");
		
		List<Student> students = stc.findAll();
		
		System.out.println("\n조회된 학생수는 " + students.size() + "명 입니다.");
		
		if(students.isEmpty()) {
			System.out.println("조회결과가 존재하지 않습니다.");
		} else {
			
			for(Student student : students) {
				System.out.println("========================");
				System.out.print("학번 : " + student.getStudentId() + ", ");
				System.out.print("성명 : " + student.getStudentName() + ", ");
				System.out.print("생년월일 : " + student.getBirthDate() + ", ");
				System.out.print("성별 : " + student.getGender() + ", ");
				System.out.print("입학일 : " + student.getEnrollDate() + ", ");
				System.out.print("전공명 : " + student.getMajorId() + ", ");
				System.out.print("기숙사명 : " + student.getDormId());
				System.out.println();
				
			}
		}
	}
	
	
	
	private void findById() {
		System.out.println("---------- 학생 정보 조회(ID) 조회하는 서비스입니다. ----------");
		System.out.println("학번을 입력해주세요. (ID) > ");
		int studentId = sc.nextInt();
		sc.nextLine();
		
		Student student = stc.findById(studentId);
		
		if(student != null) {
			System.out.println("========================");
			System.out.println("학번 : " + student.getStudentId() + ", ");
			System.out.println("이름 : " + student.getStudentName() + ", ");
			System.out.println("가입날짜 : " + student.getEnrollDate() + ", ");
			System.out.println("전공명 : " + student.getMajorName() + ", ");
			System.out.println("기숙사명 : " + student.getDormName());
			System.out.println("========================");
		}else {
			System.out.println("조회에 실패하셨습니다.");
		}
	}
	
	
	
	
	
	private void findByName() {
		
	}
	
	
	
	
	private void findByMajor() {
		
	}
	
	
	
	private void findByDormitory() {
		
	}
	
	
	
	private void updateStudent() {
		
	}
	
	
	
	private void updateDormitory() {
		
	}
	
	
	
	private void save() {
		System.out.println("---------- 학생 추가 서비스입니다. ----------");
		System.out.println("이름을 입력해주세요 > ");
		String studentName = sc.nextLine();
		System.out.println("생년월일을 입력해주세요 > ex YYYY-MM-DD ");
		String birthDate = sc.nextLine();
		System.out.println("성별을 입력해주세요 > (ex 'M' or 'F' ");
		String gender = sc.nextLine();
		System.out.println("입학날짜를 입력해주세요 > (ex YYYY-MM-DD ");
		String enrollDate = sc.nextLine();
		System.out.println("전공 아이디를 입력해주세요 > ");
		int majorId = sc.nextInt();
		sc.nextLine();
		System.out.println("기숙사 아이디를 입력해주세요 > ");
		int dormId = sc.nextInt();
		sc.nextLine();
		
		int result = stc.save(studentName, birthDate, gender, enrollDate, majorId, dormId);
		
		if(result > 0) {
			System.out.println("학생 추가에 성공하셨습니다.");
		} else {
			System.out.println("학생 추가에 실패하셨습니다.");
		}
	}
	
	
	
	private void delete() {
		
	}
	
}
