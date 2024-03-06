package ch02;

import java.util.ArrayList;

// 속 성 (field)
// GalaxyPhone
// 제조사 : (maker - String)
// 모델명 : (modelName - String)
// 소유자 : (owner - String)
// 전화번호 : (telNumber - String)
// 전원상태 : (power - boolean)

// 기 능 (method)
// 전원버튼누름 : onPower - power 상태를 부정
// 전화걸기 : call - power가 true일 때 상대방 (전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기 : emergency - "112로 전화를 겁니다."
// 휴대전화정보보기 :  getInformation power가 true일 때

// ===== (전화번호) =====
// 제조사 : (제조사)
// 모델명 : (모델명)
// 소유자 : (소유자)

// 출력

class GalaxyPhone {
	static String maker;     // 제조사
	String modelName; // 모델명
	String owner;     // 소유자
	String telNumber; // 전화 번호
	Boolean power; // 전원 상태 true : 켜짐, false : 꺼짐
	
	void onPower () {
		power = !power; // 이 메서드를 호출 할때 마다 전원 상태 변경  -> default = false ! 꺼짐 상태
	}
	
	
	void call (String toTelNumber) {
		if (!power)  return; // 전원이 꺼져있으면 여기서 코드가 멈춤
			
		System.out.println(toTelNumber + "로 전화를 겁니다.");
		
		
	}
	
	static void emergency () {
		System.out.println("112로 전화를 겁니다.");
	}
	
	void getInformation () {
		if (!power)  return; // 전원이 꺼져있으면 여기서 코드가 멈춤
		
			System.out.println("===" +  telNumber +"===");
			System.out.println("제조사 : " + maker);
			System.out.println("모델명 : " + modelName);
			System.out.println("소유자 : " + owner);
			
	}
	
}

// Drama
// 방송사 : (broadcastingCompany - String)
// 제목 : (title - String)
// 배우 : (actors - String[])
// 장르 : (genre - String)
// 시청률 : (viewRating - double)
// 부작 : (series - int)

//정보 보기: getInformation
// ===== (title) =====
// 방송사 : (broadcastingCompany)
// 장르 : (genre)
// 부작 : (series)
// 시청률 : (viewRating)%
// 배우 : (actor), (actor), (actor) ...               전지현, 김수현, 박해진, 유인나

// Drama 클래스 정의
class Drama {
	String broadcastingCompany; // 방송사
	String title;               // 제목
	String[] actors;            // 배우
	String genre;               // 장르
	double viewRating;          // 시청률
	int series;                 // 부작
	
// Drama 클래스에 대한 메서드 정의	
	void getInformation () {
		System.out.println("===" + title + "===");
		System.out.println("방송사 :" + broadcastingCompany);
		System.out.println("장르 : " + genre );
		System.out.println("부작 : " + series + "부작");
		System.out.println("시청률 : " + viewRating + "%");
		for (int index = 0; index < actors.length; index++ ) {
			// System.out.pring("배우 : " + actors[index]}
 
			// {"A", "B", "C"}  ->   배열의 값이 3이라 치면 인덱스가 0, 1, 2니까 index가 반복하면서 조건에 따라 저 숫자보다 작으면 ,를 찍고 초과하면 ,를 안찍는다.
			// if (index < actors.length - 1) System.out.print(", ");
			
			// index < actors.length - 1
			// true - actors[index + ","] / false - actors[index]
			
			// 삼항 연산자 활용
			System.out.print("배우 : ");
			System.out.print(index < actors.length - 1 ? actors[index] + ", " : actors[index]);
			// index가 actors 배열의 길이 - 1 보다 작으면 인덱스 번호에 해당하는 값 뒤에 ,를 붙히고 아니면 안붙히고 출력해라 즉, false이면 마지막 인덱스 번호 값에 해당하는 값이 나오는거지
		}
			
	}
	
}

// TriangleMath
// 빗변 구하기 - getHypotenuse
// 삼각형 둘레 구하기 - getCircumference
// sin 구하기 - getSin
// cos 구하기 - getCos
// tan 구하기 - getTan

class TriangleMath {
	
	// static final double PI = 3.14
	
	static double getHypotenuse(int bottom, int height) {
		// 매개변수 유효성 검사 : 매개변수가 적절한 입력이 되었는지 확인하는 작업
		if (bottom <= 0 || height <= 0) return 0; // 밑변과 높이는 수학적으로 접근하면 0이 될 수가 없기때문에 조건을 걸어둠
	 // if (!(bottom > && height > 0)) return 0;  // 위와 동일한 조건
			
		double result = Math.pow(bottom, 2) + Math.pow(height, 2); // Math.pow = 특정 변수를 제곱
		return Math.sqrt(result); // Math.sqrt = 제곱근 구하는 식
	}
	
	static double getCircumference (int height, int bottom, int hypotenuse) {
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	
	static double getCircumference (double height, double bottom, double hypotenuse) {
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	
	static double getSin(int height, int hypotenuse) {
		if (height <= 0 || hypotenuse <= 0) return 0;
		return height / hypotenuse;
	}
	
	static double getCos(int bottom, int hypotenuse) {
		if (bottom <= 0 || hypotenuse <= 0) return 0;
		return bottom / hypotenuse;
	}
	
	static double getTan(int height, int bottom) {
		if (height <= 0 || bottom <= 0) return 0;
		return height / bottom;
	}
}

public class A_Example {

	public static void main(String[] args) {
		
		// GalaxyPhone 클래스에 대한 각 인스턴스 생성
		GalaxyPhone s23 = new GalaxyPhone();
		GalaxyPhone s24 = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG";
		
		// s23 인스턴트의 속성 설정
		
		// s23.maker ="SAMSUNG";
		s23.modelName = "GalaxyS23";
		s23.owner = "홍길동";
		s23.telNumber = "010-0000-0000";
		s23.power = false;
		
		// s24 인스턴트의 속성 설정
		
		// s24.maker ="SAMSUNG";
		s24.modelName = "GalaxyS24";
		s24.owner = "김철수";
		s24.telNumber = "010-1234-5678";
		s24.power = false;
		
		s23.onPower(); // s23의 전원을 킴
		s24.onPower(); // s24의 전원을 킴
		
		// s23, s24의 정보 출력
		s23.getInformation();
		s24.getInformation();
		
		GalaxyPhone.emergency();
	    // s23.emergency();
		// s24.emergency();
		
		// s24의 전화번호를 변수에 저장
		
		// s23 폰으로 s24 전화번호로 전화걸기
		s23.call(s24.telNumber);
		
		
		// Drama 클래스에 대한 각 인스턴스 생성
		Drama star = new Drama();
		Drama moon = new Drama();
		
		star.actors = new String[3];
		moon.actors = new String[4];
		
		
		// 각 인스턴스의 속성 초기화
		star.broadcastingCompany = "KBS";
		star.title = "별에서 온 그대";
		star.genre = "로맨스";
		star.actors = new String[] {"김수현", "전지현","박해진"};
		star.viewRating = 9.5;
		star.series = 16;
		
		moon.broadcastingCompany = "GBS";
		moon.title = "달에서 온 그대";
		moon.genre = "로맨스";
		moon.actors = new String[] {"김수헌", "전지헌","박희진", "유인나"};
		moon.viewRating = 1.4;
		moon.series = 16;
		
		// star 인스턴스의 정보 출력
		star.getInformation();
		System.out.println();
		
		// 변수, 메서드 구분점 정리
		// star.title; -> 변수는 뒤에 괄호 없이 씀
		// star.getInformation() -> 메서드는 메소드명 뒤에 괄호를 꼭 필요로 함 !
		
		TriangleMath triangleMath = new TriangleMath();
		double bit = TriangleMath.getHypotenuse(3, 4); // 빗변 구하기
		System.out.println(bit);
		
		// System.out.println(TriangleMath.PI); 단일 책임 원칙에 의해서 문법상으론 아무런 문제가 없지만 관용적으로 이 클래스에 관련이 없는 작업을 안하는게 좋다
		// TriangleMath.PI = 0.0;  -> 변경 불가 !
	}

}