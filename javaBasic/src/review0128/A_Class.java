package review0128;

//개발 -> 프로그래밍

//현실 세계의 문제를 컴퓨터로 해결하자 !!

//현실 세계의 정보를 데이터로 나타내기위해 코드로 표현

// 변수 : 일반 변수 (하나의 표현)
// 배열 -> 같은 타입 데이터를 여러개로 묶어서 표현
// 구조체 -> 서로 다른 타입의 데이터를 묶어서 표현	
// 클래스 -> 기능을 묶어서 표현
// JVM -
/* 
메서드 영역 : 모든 쓰레드가 공유하면 클래스의 구조 정보와 static으로 선언된 변수 혹은 메서드가 저장되는 공간
힙 영역 : 모든 쓰레드가 공유하며 클래스로 생성된 인스턴스와 배열이 저장되는 공간 (가비지 컬렉션의 주요 대상)
스택 영역 : 각 쓰레드 별로 존재하는 공간, 지역 변수나 메서드 호출 데이터가 저장 됨 (각 메서드가 종료 되면 제거 됨)
 */

// # Class :  공통적 성질을 가진 대상들의 정의, 현실 세계의 주체(객체)의 정보를 표현하는 방법
// # 접근제어자 일반 제어자 class 클래스명 {...}
class ClassName  {
	// # 속성(변수) : 현실 세계 주체가 가질 수 있는 정보나 상태 
	// # 기능(메서드) : 현실 세계 주체가 행 할 수 있는 동작, 행동
	
	// # 생성자 : 인스턴스를 생성할 때 실행될 작업을 정의한 특별한 메서드
	// # 클래스명과 동일한 이름, 반환타입 X
	// # 생성자를 개발자가 작성하지 않으면 자바 컴파일러가 자동으로 기본 생성자 생성
	// # 개발자가 생성자를 작성하면 자동으로 기본 생성자를 만드는 행위를 컴파일러가 하지 않음
	ClassName () {

	}
	
	// 오버라이딩 : 같은 이름의 메서드를 매개변수의 조합만 다르게 하여 여러개 정의 하는 것
	void method() {
		System.out.println("출력");
	}
	void method(String arg) {
		System.out.println( arg + "출력");
	}
}

// # 이력서 표현  Resume
class Resume {
	String koreanName;
	String englishName;
	String contact;
	String email;
	String address;
	String profileImage;
	
	// 학력사항 
	String period;
	String SchoolName;
	String  major;
	double credit;
	double totalCredit;
	boolean isGraduation;
	EducationHistory[] educationHistories;
	ExperienceHistory[] experienceHistories;
	Certificate[] certificates;
	String writeDate;
	String writer;
	
	
	Resume (String koreanName, String englishName, String contact, String email, String profileImage) {
		this.koreanName = koreanName;
		this.englishName = englishName;
		this.contact =  contact;
		this.email = email;
		this.profileImage = profileImage;
	}
	

	
	
	/*
	 * EducationHistory educationHistoriy1; 
	 * EducationHistory educationHistory2;
	 * EducationHistory educationHistory3; 
	 * EducationHistory educationHistory4;
	 * EducationHistory educationHistory5;
	 */
	
}

// 학력사항은 사람에 따라 적는게 달라서 매번 변수 선언을 하면 데이터 관리가 어려우니 하나로 묶어서 구조체 형태의 클래스를 생성
class EducationHistory {
	String period;
	String schoolName;
	String  major;
	double credit;
	double totalCredit;
	boolean isGraduatation;
	
	// 반드시 경력사항을 한번 입력해야하는 경우 매개변수로 값을 모두 받아와 생성자를 생성
	EducationHistory ( String period, String schoolName, String major, double credit , double totalCredit, boolean isGraduatation ) {
		this.period = period;
		this.schoolName = schoolName;
		this.major = major;
		this.credit = credit;
		this.totalCredit = totalCredit;
		this.isGraduatation = isGraduatation;
	}
}

// 경력사항 
class ExperienceHistory {
	String period; // 근무 경력 기간
	String workplace;  // 근무지
	String position;  // 직위
	String businessDetail; // 업무 내용
}

// 자격증 
class Certificate {
	String acquisitionDate;
	String name;
	String level;
	String issuePlace;
}

class User {
	String id;
	String password;
	String name;
}

// # class : 회원관리 (기능들의 집합)
class UserManagement {
	// # 회원등록
	void userRegist (String id, String password, String name) {
		// # 회원 등록 작업
		
	}
	// # 회원 정보보기 -> User에 대한 정보를 반환해야해서  User 타입으로 작성
	User getUser (String id) {
		return new User();
	}
	
	// # 회원 정보수정
	void userUpdate (String id, String password, String name) {
		// 회원 수정작업
	}
	
	// # 회원 정보삭제
	void userDelete (String id) {
		// # 회원 삭제 작업
	}
}
public class A_Class {

	public static void main(String[] args) {
		
		Resume kodonghyun = new Resume("고동현","Ko Dong Hyun","01011111111","부산광역시 진수 에이원 프라자 4층","profileImage"); // 이력서에 대한 고동현이라는 새로운 이력서 인스턴스 생성
		// kodonghyun.koreanName = "고동현";
		// kodonghyun.englishName = "Ko Dong Hyun";
		// kodonghyun.contact = "01011111111";
		// kodonghyun.address = "부산광역시 진수 에이원 프라자 4층";
		// kodonghyun.profileImage = "profileImage";
		
		
		
	}

}
