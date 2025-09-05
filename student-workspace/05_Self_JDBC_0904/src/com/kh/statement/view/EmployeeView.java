package com.kh.statement.view;

import java.util.List;
import java.util.Scanner;

import com.kh.statement.controller.EmployeeController;
import com.kh.statement.model.vo.Employee;

public class EmployeeView {

		private Scanner sc = new Scanner(System.in);
		private EmployeeController ec = new EmployeeController();
		
		public void mainMenu() {
			while(true) {
				System.out.println(" ------- 회원 관리 프로그램 ------- "); // View 파트의 내용, 즉 비주얼적인 부분은 이후에 HTML 등의 파트에서 대체할 예정
				System.out.println("1. 회원 전체 조회");
				System.out.println("2. 부서별 사원 조회");
				System.out.println("3. 직급별 사원 조회");
				System.out.println("4. 사번 입력 조회");
				System.out.println("5. 급여 BEST5 조회");
				System.out.println("6. 급여 WORST5 조회");
				System.out.println("7. 사원 정보 입력");
				System.out.println("8. 사원 정보(급여, 직급, 부서) 수정");
				System.out.println("9. 사원 퇴사 처리");
				System.out.println("0. 프로그램 종료");
				System.out.println("메뉴를 선택해주세요 > ");
				int menuNo = sc.nextInt();
				sc.nextLine();
				
				switch(menuNo) {
				case 1 : findAll(); break;
				case 2 : findByDep(); break;
				case 3 : findByPos(); break;
				case 4 : findByNum(); break;
				case 5 : salBest5(); break;
				case 6 : salWorst5(); break;
				case 7 : insert(); break;
				case 8 : update(); break;
				case 9 : delete();  break;
				case 10 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("유효하지 않은 입력입니다.");
							
				}
			}
			
		}
		
		private void findAll() {
			System.out.println("\n전체 사원 조회 메뉴입니다.");
			// 데이터를 가지고 있지 않으므로 Controller에게 떠넘겨야 함.
			List<Employee> employees = ec.findAll();
			
			System.out.println("\n조회된 총 사원수는 " + employees.size() + "명 입니다.");
			
			if(employees.isEmpty()) {
				System.out.println("조회결과가 존재하지 않습니다.");
			} else {
				
				for(Employee employee : employees) {
					System.out.println("========================");
					System.out.println(employee.getEmpId() + "번 사원의 정보");
					System.out.print("성명 : " + employee.getEmpName() + ", ");
					System.out.print("봉급 : " + employee.getSalary() + ", ");
					System.out.print("부서명 : " + employee.getDepTitle() + ", ");
					System.out.print("직급명 : " + employee.getPosName());
					System.out.println();
					
				}
			}
		}
		private void findByDep() {
			System.out.println("\n부서별 사원 조회 메뉴입니다.");
			System.out.println("조회하실 부서 번호를 입력하세요.");
			System.out.println("1. 인사관리부 2. 회계관리부 3. 마케팅부 4. 국내영업부 5. 해외영업1부 6. 해외영업2부 7. 해외영업3부 8. 기술지원부 9. 총무부");
			// 데이터를 가지고 있지 않으므로 Controller에게 떠넘겨야 함.
			int menuNo = sc.nextInt();
			
			sc.nextLine();
			List<Employee> employees = ec.findByDep();
			sc.nextLine();
			
			
			if(employees.isEmpty()) {
				System.out.println("조회결과가 존재하지 않습니다.");
			} else {
					
				for(Employee employee : employees) {
					
					System.out.println("========================");
					System.out.println(employee.getEmpId() + "번 사원의 정보");
					System.out.print("성명 : " + employee.getEmpName() + ", ");
					System.out.print("봉급 : " + employee.getSalary() + ", ");
					System.out.print("부서명 : " + employee.getDepTitle() + ", ");
					System.out.print("직급명 : " + employee.getPosName());
					System.out.println();
					System.out.println(employee.getDepTitle() + " 부서의 총 사원수는 " + employees.size() + "명 입니다.");	
				}
				
			}
		}
		private void findByPos() {
			
		}
		private void findByNum() {
			
		}
		private void salBest5() {
			
		}
		private void salWorst5() {
			
		}
		private void insert() {
			
		}
		private void update() {
			
		}
		private void delete() {
			
		}
	}

