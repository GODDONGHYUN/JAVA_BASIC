package ch02;

// 기타 제어자 (비접근 제어자) : 접근 제어와 무관하게 동작을 제어하는 것

// final 제어자 :
// - 클래스 : final 제어자가 붙은 클래스는 확장(상속)할 수 없음
// - 메서드 : final 제어자가 붙은 메서드는 오버라이드할 수 없음
// - 변수 : final 제어자가 붙은 변수는 재할당할 수 없음

final class FinalModifier1  {
	int variable;
}

// class SubModifier1 extends FinalModifier { ㅡ> 사용 불가 !
	
// }

class FinalModifier2 {
	
	final void method () {}
	
}

class SubModifier2 extends FinalModifier2 {  
	
	// void method () {} ㅡ> 오버라이드 불가 !
	
}

class FinanModifier3 {        
	
	final int variable = 10;
	
	void method () {
		// variable = 20; ㅡ> 재할당 불가 !
	}
	
}

// static 제어자 :
// - 메서드 : static 제어자가 붙은 메서드는 인스턴스 생성 없이 클래스로 바로 호출 가능
// - 변수 : static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 접근 가능
class staticModifier {
	
	static int variable;
	
	static void method () {};
	
}

// 제어자의 조합
class Combination {
	
// public + static + final ㅡ> (주로 사용 ) 작업을 할 때 특정 상황이 오면 무조건 특정한 값이 와야한다하는 용도로 쓰여짐
	public static final int NUMBER = 10;
	
// 메서드에서 private + final  ㅡ> 말이 안돼
	private final void method () {} // 작성은 가능하나 의미가 없는 것이라 사용 X !
	
// 메서드에서 private + abstract ㅡ> 말이 안돼 (극 과 극)
// 클래스와 메서드에서 final + abstract ㅡ> 말이 안돼 (극 과 극)
	
}

public class D_Modifier {

	public static void main(String[] args) {
		
		staticModifier.variable = 0; //  접근 가능 !
		staticModifier.method(); // 접근 가능 !
	}

}

