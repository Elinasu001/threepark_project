package com.kh.statement.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.kh.statement.model.dao.StudentDAO;
import com.kh.statement.model.vo.Student;

public class StudentService {
	
	
	// [커넥션 보관 방식 안내]
	// - 이 Service 인스턴스는 생성 시 DB 커넥션을 1회 획득해 필드(conn)에 저장합니다.
	// - 각 서비스 메서드는 '그 커넥션'을 DAO에 넘겨 사용한 뒤, 메서드 말미에 close(conn)으로 닫습니다.
	// ※ 주의: 한 번 닫힌 커넥션은 재사용할 수 없습니다. 즉, 이 인스턴스는
	//        메서드 한 번 호출 후엔 conn이 닫힌 상태가 되므로, 다음 호출을 하려면
	//        새 StudentService()를 만들어야 합니다.
	//        (실무/권장 패턴: 메서드마다 getConnection() → finally에서 close)
	private Connection conn = null;

	/**
	 * 생성자
	 * - DB 커넥션을 1회 획득하여 필드(conn)에 저장한다.
	 * - 이 인스턴스 수명 동안 같은 커넥션을 사용하지만,
	 *   각 메서드에서 close(conn) 호출 후에는 더 이상 사용할 수 없다.
	 */
	public StudentService() {
		
		this.conn = getConnection();
	}
	
	
	
	/**
	 * @return 조회된 학생 목록, 데이터가 없으면 빈 리스트 반환, null은 반환하지 않는다.
	 */
	public List<Student> findAll() {
		
		List<Student> students = new StudentDAO().findAll(conn);

		close(conn);
		
		return students;
		
	}
	
	
	/**
	 * @param studentId
	 * @return 조회된 학생 객체; 존재하지 않으면 null
	 */
	public Student findById(int studentId) {
		
		Student student = new StudentDAO().findById(conn, studentId);
		
		close(conn);
		
		return student;
	}
	
	
	
	public Student findByDomitory() {
		return null;
	}
	
	
	
	public Student findByMajor() {
		return null;
	}
	
	
	public Student findByDormitory() {
		return null;
	}
	
	
	public int updateStudent() {
		return 0;
	}
	
	
	
	public int updateDormitory() {
		return 0;
	}
	
	
	
	public int save(Student student) {
		
		int result = new StudentDAO().save(conn, student);
		
		if(result > 0) {
			commit(conn);
		} 
		
		close(conn);
		
		return result;
	}
	
	
	
	public int delete() {
		return 0;
	}
	
	
}
