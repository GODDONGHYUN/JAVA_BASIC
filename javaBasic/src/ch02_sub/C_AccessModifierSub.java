package ch02_sub;

// ch02에 선언된 AccessModifier 클래스는
// 접근 제어사가 default이기 때문에 외부패키지에서 import가 불가능 !
// import ch02.AccessModifier;

// ch02에 선언된 C_AccessModifier 클래스는
// 접근 제어자가 public이기 때문에 외부 패키지에서 import가 가능
import ch02.C_AccessModifier; // 클래스 앞에 public이 붙혀져있어서 다른 패키지 내의 클래스에서 접근 가능


class SubClass extends C_AccessModifier {

	void method () {
		super.protectedVariable = 0;
		
	 }
}

public class C_AccessModifierSub {

	public static void main(String[] args) {
		
		C_AccessModifier instance = new C_AccessModifier();
		
		// C_AccessModifier 클래스의 privateVariable 필드는
		// 접근제어자가 default이기 때문에 외부 패키지에서 접근 불가능 !
		// instance.privateVariable = 0;
		
// ==============================================================================================================		
		
		// C_AccessModifier 클래스의 defaultVariable 필드는
		// 접근제어자가 default이기 때문에 외부 패키지에서 접근 불가능 !
		// instance.defaultVariable = 0;
		
// ==============================================================================================================		
		
		// C_AccessModifier 클래스의 protectedVariable 필드는
		// 접근 제어자가 proteced 이기 때문에 외부 패키지에서는 접근이 불가능 !
		// 단, C_AccessModifier 클래스를 확장(상속)한 클래스 에서는 접근이 가능  !
		// 상단의 Subclass 참조
		// instance.protectedVariable = 0;

// ==============================================================================================================		
		
		// C_AccessModifier 클래스의 publicVariable 필드는
		// 접근 제어자가 public 필드이기 때문에 외부 패키지에서는 접근이 가능 !
		instance.publicVariable = 0;
		
		
		
		// instance.a = 0
		
	}
}
