package ch02;

// 다형성 : 하나의 표현이 여러가지 형태로 나타낼 수 있는 것

// 오버로드 : 같은 클래스 내에서 동일한 메서드의 이름으로 여러개의 메서드를 '새로' 정의할 수 있도록 하는 것
// 오버라이드 : 자식 클래스에서 부모 클래스에 정의ㄷ 된 메서드를 '재'정의 하는 것

// Human1 클래스 정의
class Human1 {
	String name;
	int age;
}

// Developer1 클래스 정의, Human1 클래스를 상속
class Developer1 extends Human1 {
	String position;
}
// FootballPlayer1 클래스 정의, Human1 클래스를 상속하고 FootballPlay 인터페이스를 구현
class FootballPlayer1 extends Human1 implements FootballPlay {
	int goal;

	@Override
	public void kick() {
		System.out.println("킥을 차다 !");
	}
}

// FootballPlay 인터페이스 정의
interface FootballPlay {
	// 킥을 나타내는 메서드 선언
	public abstract void kick ();
}

public class H_Polymorphism {

	public static void main(String[] args) {
		
		Human1 human1 = new Human1();
		Developer1 developer1 = new Developer1();
		FootballPlayer1 footballPlayer1 = new FootballPlayer1();
		
		// 업캐스팅 : 하위 클래스 객체를 상위 클래스의 참조 변수에 담을 수 있도록 변환하는 것
		//		   인터페이스 구현 클래스를 구현한 인터페이스의 타입 참조 변수로 담을 수 있도록 하는 것
		
		// Developer1 객체를 Human1 타입의 참조 변수에 담음
        Human1 human2 = new Developer1();
         // human2는 developer1의 모든 속성을 갖지만, human1 타입의 참조변수로 선언되어서 position 접근 불가
       
        // FootballPlayer1 객체를 Human1 타입의 참조 변수에 담음
        Human1 human3 = new FootballPlayer1();
        // human3는 footballPlayer1 의 모든 속성을 갖지만, human1 타입의 참조변수로 선언되어서 goal 접근 불가
       
        // 다운 캐스팅을 위해 FootballPlayer1 객체 생성
		FootballPlay football = new FootballPlayer1();
		// human2.position = "";
		
		// 다운 캐스팅 : 업캐스팅 된 객체를 다시 원래의 타입의 참조 변수에 담을 수 있도록 변환하는 것
		Developer1 developer2 = (Developer1) human2;
		developer2.position = "";

		// Object 클래스의 참조변수는 어떠한 클래스의 인스턴스도 받을 수 있음
		Object object1 = new Human1();         // Human1은 Object의 하위 클래스이므로 업캐스팅 가능
		Object object2 = new Developer1();     // Developer1은 Object의 하위 클래스이므로 업캐스팅 가능
		Object object3 = new FootballPlayer1(); // FootballPlayer1은 Object의 하위 클래스이므로 업캐스팅 가능

		FootballPlayer1 fp = new FootballPlayer1();
		fp.name = "홍길동";
		fp.age = 30;
		fp.goal = 55;

		System.out.println(fp);
		System.out.println(fp.name);
		System.out.println(fp.goal);

		Human1 hm = fp; // 업캐스팅: FootballPlayer1 객체를 Human1 타입의 참조 변수로 담음
		System.out.println(hm);
		System.out.println(hm.name);
		// System.out.println(hm.goal); // 다시 시야가 좁아져서 컴파일 에러 발생
		// hm.kick(); // 다시 시야가 좁아져서 kick 메서드 호출이 불가능

		FootballPlayer1 fpp = (FootballPlayer1) hm; // 다운 캐스팅: Human1 타입의 참조 변수를 FootballPlayer1 타입으로 변환
		System.out.println(fpp);
		System.out.println(fpp.name);
		System.out.println(fpp.goal); // 부모 클래스의 참조 변수를 다운 캐스팅하여 자식 클래스의 인스턴스에 접근 가능

		// 아래 주석 처리한 코드는 부모 클래스의 인스턴스를 자식 클래스의 참조 변수에 담으려고 하기 때문에 컴파일 에러 발생
		// Human1 hmm = new Human1();
		// Developer1 dev = (Developer1) hmm;
		// dev.position = "포지션";
		// System.out.println(dev.position);
		

		
		
	}
	

}
