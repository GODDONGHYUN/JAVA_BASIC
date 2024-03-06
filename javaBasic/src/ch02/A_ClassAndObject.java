package ch02;

//클래스 : 공통된 속성과 기능을 하나로 정의해둔 것
// [접근제어자] class 클래스명 {속성, 기능}   -> 여기서 접근제어자라고 함은 public, private,protected 또는 default 가시성을 정의하는 부분
// 주의 할 점! 클래스를 선언할 때는 클래스 외부에서 선언

class ExampleClass1 {
	// 속성 : 클래스가 가질수 있는 정보나 상태
	// 일반적으로 변수로 표현
	// 변수는 선언만 하고 초기화는 아래에서 함
	
	// 인스턴스 변수
	// 각 인스턴스마다 독립적으로 값을 가지는 변수
	int attribute1;
	double attribute2;
	
	// 클래스 변수 (스태틱 변수, 정적 변수)
	// 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
	// 속성 앞에 static 키워드를 사용하여 지정할 수 있음
	/* 제약조건
	   static 메소드는 오직 static멤버만 접근 가능
	   => static메소드도 static멤버와 로드되는 시점이 동일하기 때문에 객체가 생성되지 않은 상황에서도 변수를 사용할 수 있어야 한다.
	   this 키워드 사용 불가
       => this는 호출 당시 실행 중인 객체를 가리키는 레퍼런스인데 static메소드는 객체가 생성되지 않은 상황에서도 호출이 가능하기 때문이다.
    */
	static int staticAttribute;
	
	// Method
	// 기능 : 클래스가 가질수 있는 행동이나 작업(메서드)
	// 클래스로 생성된 객체를 통해서 호출 가능
	// [접근제어자 일반 제어자] 반환타입 메서드명(매개변수타입 매개변수명[, ...]) : 선언부
	// {메서드 기능 구현} : 구현부
	
	// 인스턴스 메서드는 '반드시' 인스턴스를 생성하고 인스턴트에서 사용가능하다
	
	// 매개변수 : O , 반환 값 : O
	int method1(int arg1, int arg2) {
		// 기능 구현
		// 반환타입이 void가 아니면 반드시 선언한 반환타입의 결과값을 return으로 반환해야함
		return 0;
	}

	// 매개변수 : X, 반환값 : O
	int method2() {
		return 0;
	}

	// 매개변수 : O , 반환값 : X
	void method3(int arg1) {
		// void에서의 return은 강제로 메서드를 종료하기 위해 사용
	}

	// 매개변수 : X , 반환값 : X
	void method4() {		
	    System.out.println(attribute1);
	    System.out.println(staticAttribute);
	
	  //  method2();
	  //  staticMethod();


	}
	
	// 클래스 메서드(스태틱 메서드, 정적 메서드)
	// 모든 인스턴스가 공유하는 메서드
	// 반환 타입 앞에 static 키워드를 붙혀서 사용
	static void staticMethod() {
		// 클래스 메서드에서는 instance 변수 접근 및 instance 메서드 호출이 불가능 !
		// System.out.println(attribute1);
		// System.out.println(staticAttribute);
		
		// method2();
		// staticMethod();
	}
	
	// 생성자 : 클래스의 인스턴스를 생성하는 순간에 호출되는 메서드 (초기화 이전)
	// 클래스와 같은 이름을 가지고 있고, 반환 타입이 존재하지 않음 -> 무조건 인스턴스를 반환해서 반환타입이 존재 하지 않는거임
	// 클래스명 ([매개변수,...]) {인스턴스가 생성될 때 할 작업}
	ExampleClass1(int attribute1 , double attribute2) {
		System.out.println("ExampleClass1 인스턴스 생성 !");
		
		// 의존성이 내부에서 주입하는 형태
		// 속성 값이 생성 이전에 결정이 되었기 때문에 코드의 안정성이 저하
		// attribute1 = 99;
		// attribute2 = -99.99;
		
		// 의존성을 외부에서 주입하는 형태
		// 속성 값이 생성 당시에 결정 되기 때문에 코드의 안정성을 향상
		  this.attribute1 = attribute1;
		// this 키워드 : 자기 인스턴스를 지칭
		  this.attribute2 = attribute2;
		// this.staticMethod();
	}
	
	// 오버로딩(OverLoading) : 같은 클래스 내에서 같은 이름의 메서드를 여러개 작성할 수 있도록 하는 방법
	// 오버로딩 조건
	// 1. 메서드 이름을 중복해서 작성하지만 매개변수의 타입 및 개수를 다르게 작성
	// 2. 메서드의 반환타입과 메서드의 매개변수의 이름은 오버로딩에 영향을 미치지 않음
	void overloadMethod() {
		
	}
	
	void overloadMethod(int arg) {
		
	}
	
	void overloadMethod(double arg) {
		
	}
	
	void overloadMethod (int arg1, double arg2) {
		
	}
	
	void overloadMethod (double arg1, int arg2) {
		
	}
	
	// int overloadMethod (double arg1, int arg2) {  ㅡ > 반환 타입을 다를게 했을 때는 오버로딩이 적용 X !
	//	return 0;
	//  }
	
	// void overloadMethod (double double1, int int1) { ㅡ > 변수이름이 달라도 오버로딩 적용 X
	//	
	// }
	
	// 생성자도 메서드의 일종이기 때문에 오버로딩이 가능
	ExampleClass1() {
		this.attribute1 = 99;
		this.attribute2 = -99.99;
	}
	
	ExampleClass1(int attribute1) {		
		this(attribute1 , -99.99);
	}
}

// fields: 클래스의 속성을 정의하는 변수들 예시
// 축구선수 (FootballPlayer)  
// 이름 (name - String)  
// 포지션 (position - String)      

// 생년월일 (birth - String)
// 키 (height - Double)
// 몸무게 (weight - double)
// 국적 (country - String)
// 주발 (mainFoot - String)
// 팀 (team - String)
// 골 (goal - int)
// 어시스트 (assist - int)
// 경고 수 (foul - int)


// 각각 매개변수가 다를 뿐이지, field 안에 있는 기존 데이터로 알 수가 없어서 매개변수를 통해 외부에서 끌어와서 써야함 !
// 잠자기 (sleep) - 작업 : "(취침 시간) ~ (기상 시간)까지 취침"
// 밥먹기 (eat)   - 작업 : "(음식) 먹음" 출력
// 훈련하기 (train) - 작업 : "훈련 !!" 출력
// 경기결과내기 (setGameResult) - 작업 : 골, 어시스트, 경고 수 속성 변경
// 이적하기  (moveTeam) - 작업 : 팀 변경

// 인스턴스변수 (전역변수) : 클래스에 직접 속하는 각 객체가 자체 복사본을 가지는 변수
// 실존하는 데이터를 잘 정의하는게 중요함!
class FootballPlayerA {
	String name;
	String position;
	String birth;
	double height;
	double weight;
	String country;
	String mainFoot;
	String team;
	int goal;
	int assist;
	int foul;
	
	void sleep(String bedtime, String wakeUpTime) {
		System.out.println(bedtime + "~" + wakeUpTime);
	}
	
	void eat (String food) {
		System.out.println(food + "먹음");
	}
	void train () {
		System.out.println("훈련 !!");
	}
	
	void setGameResult (int goalResult, int assistResult, int foulResult ) {
		goal += goalResult;
		assist += assistResult;
		foul += foulResult;
	}
	
	void moveTeam (String destinationTeam) {
		team = destinationTeam; // 전역변수 team의 값을 destinationTeam에 할당 하겠다(바꾸겠다).
	}
	
	void printInformation () {		
	System.out.println(name + "의 정보");
	System.out.println("포지션 : " + position);
	System.out.println("생년월일 : " + birth);
	System.out.println("키 : " + height);
	System.out.println("몸무게 : " + weight);
	System.out.println("국적 : " + country);
	System.out.println("주발 : " + mainFoot);
	System.out.println("소속팀 : " + team);
	System.out.println("득점 : " + goal);
	System.out.println("도움 : " + assist);
	System.out.println("파울 : " + foul);
		
	}
}

public class A_ClassAndObject {
     
	// 전역 필드 (전역 변수)
	// String team;
	
	public static void main(String[] args) { // main : 기능
		// 지역 필드 (지역 변수)
		// String team;
		
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화 한 것 (객체)
		// 클래스명 참조변수명 = new 클래스명();
		// 두 인스턴스가 각각의 독립된 인스턴스 지만, 속성의 값을 다를지라도 동일한 클래스에 해당하는 인스턴스이기 때문에 속성과 기능은 같다.
		ExampleClass1 instance1 = new ExampleClass1(0,0); // 얘도 참조형 데이터 타입이기 때문에 출력히면 특정 주소가 나옴
		ExampleClass1 instance2 = new ExampleClass1(0,0); // 얘도 참조형 데이터 타입이기 때문에 출력히면 특정 주소가 나옴
		
		System.out.println(instance1);
		System.out.println(instance2);
		
		System.out.println("=====================================================================================");
		
		// 인스턴스가 가지고 있는 속성에 접근하는 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance1.attribute2 = 3.14;
		System.out.println(instance1.attribute1);
		System.out.println(instance1.attribute2);
		System.out.println(instance2.attribute1);
		System.out.println(instance2.attribute2);
		
		// 인스턴스가 가지고 있는 메서드 호출 방법
		// 인스턴스.메서드();
		// 인스턴스 메서드를 호출 할 때는 매개변수가 존재하는 메서드이면 해당하는 갯수만큼 데이터를 할당해줘야한다
		instance1.method1(1, 2); // 1, 2라는 데이터가 메서드 선언부분으로 올라가서 arg1, arg2에 각각 1,2를 '복사'해서 할당을 하고, 그 결과 값은 return 값인 0이 된다.
		instance1.method2();
		instance1.method3(0);
		instance1.method4();
		
		// 기존 클래스를 이용한 인스턴스 생성
		FootballPlayerA son = new FootballPlayerA();
		FootballPlayerA lee = new FootballPlayerA();
		
		// 인스턴스 생성 후 선언했던 변수에 값을 집어넣음 -> 클래스에는 해당 값 안들어감 !
		
		son.name = "손흥민";
		son.position = "공격수";
		son.birth = "920708";
		son.height = 183.0;
		son.weight = 77.0;
		son.country = "대한민국";
		son.mainFoot = "오른발";
		son.team = "토트넘 홋스퍼";
		son.goal = 0;
		son.assist = 0;
		son.foul = 0;
			
		lee.name = "이강인";
		lee.position = "미드필더";
		lee.birth = "010209";
		lee.height = 174.0;
		lee.weight = 71.0;
		lee.country = "대한민국";
		lee.mainFoot = "왼발";
		lee.team = "파리 생제르맹";
		lee.assist = 0;
		lee.foul = 0;
		
		
		// 생성한 인스턴스에다가 기존에 생성한 메서드 값을 추가
		son.sleep("21:00", "06:00");
		son.eat("컵라면");
		son.train();
		son.setGameResult(1, 1, 0);
		son.moveTeam("아스날 FC");
						
		lee.moveTeam("수원 삼성");
		
		// 반복되는 출력 구문을 메서드로 만들어서 중복 작업 없이 출력
		lee.printInformation();
		System.out.println("==============================================================================================");
		son.printInformation();
		System.out.println("==============================================================================================");
		
		// 클래스 변수는 클래스로 직접 접근이 가능
		ExampleClass1.staticAttribute = 99;
		
		// instance 변수와 메서드는 '반드시' 인스턴스를 생성하여 인스턴스로 접근 및 호출을 해야한다.
		//  ExampleClass1.attribute1 = 10;
		//  ExampleClass1.method1(0, 0);
		
		System.out.println(instance1.staticAttribute);  // 접근은 가능하나 eclipse에서 클래스 변수에 접근하는 방식이 맞냐 라고 물어보는거임
		System.out.println(instance2.staticAttribute);
		
		ExampleClass1.staticMethod();
		instance1.staticMethod(); // 접근은 가능하나 eclipse에서 클래스 메서드에 접근하는 방식이 맞냐 라고 물어보는거임
		instance2.staticMethod();
		
		ExampleClass1 instance3 = new ExampleClass1(99, -99.99);
		System.out.println(instance3.attribute1);
		System.out.println(instance3.attribute2);
		
		ExampleClass1 instance4 = new ExampleClass1(999, 99.99);
		System.out.println(instance4.attribute1);
		System.out.println(instance4.attribute2);
		// instance4.attribute1 = 999;
		// instance4.attribute2 = 99.99;
		
		ExampleClass1 instance5 = new ExampleClass1();
		System.out.println(instance5.attribute1);
		System.out.println(instance5.attribute2);
		ExampleClass1 instance6 = new ExampleClass1(100);
		System.out.println(instance6.attribute1);
		System.out.println(instance6.attribute2);
		


	}
}