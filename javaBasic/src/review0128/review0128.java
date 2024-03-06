package review0128;

import java.util.Date;

// 개발 -> 프로그래밍

// 현실 세계의 문제를 컴퓨터로 해결하자 !!

// 현실 세계의 정보를 데이터로 나타내기위해 코드로 표현

// 변수 : 일반 변수 (하나의 표현)
// 배열 -> 같은 타입 데이터를 여러개로 묶어서 표현
// 구조체 -> 서로 다른 타입의 데이터를 묶어서 표현
// 클래스 -> 기능을 묶어서 표현
class Participation {
	String name;
	String profile;
	String email;
	Date time;
}

class Math {
	int add (int a , int b) {
		return a + b;
	}
}
public class review0128 {

	public static void main(String[] args) {
		
		// 다른 타입을 하나로 관리 하는 것 
		Participation participation1 = new Participation();
		participation1.name = "고동현";
		participation1.profile = "https://~~";
		participation1.email = "email";
		participation1.time = new Date();
		
		// 새로운 타입을 만들어서 19명의 데이터를 하나로 관리
		Participation[] participations = new Participation[19];
		
		for (int index = 0; index <  participations.length; index++)  {
			Participation participation = new Participation();
			participations[index] = participation;
		}
		
		
		
	}

}
