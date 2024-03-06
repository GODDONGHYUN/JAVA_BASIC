package ch03;

import java.util.ArrayList;
import java.util.List;

// 제너릭 : 클래스나 메서드에서 사용할 데이터 타입을 외부에서 받아오는 기법
// 주의 점 : 제너릭에서 method를 받아오는 행위는 자주 발생하지 않지만 제너릭에서는 업캐스팅이 절대 불가능 함 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// Test1, Test2 형태로 클래스를 사용하게 되면 코드의 중복이 발생함
class Test1 {
	String subject;
	int score;
}

class Test2 {
	String subject;
	String score;
}

// Test3 형태로 클래스를 사용하게 되면 타입의 안정성이 떨어짐
class Test3 {
	String subject;
	Object score;
}

// 제너릭 클래스 : 클래스 내부에 있는 데이터 타입을 외부에서 받아오도록 할때 사용하는 방법
// class 클래스명 <매개타입> { 매개타입, 변수명 ...}
class Test4<T> {  // 여기서 T는 매개타입을 말함
	String subject;
	T score;
}

// class Test5 {
//	
//	static <T> void method(T arg) {
//		System.out.println(arg);
//	}
// }

class Test5 {  
	// 제너릭 메서드 : 해당 메서드의 매개변수의 타입이나 반환 타입에서 사용할 타입을 외부에서 받아오려 할 때 사용
	// <매개타입> 반환 타입 메서드명 (<매개타입> 매개변수) {...}
	static <T> void method(List<T> arg) {
		System.out.println(arg);
	}
	// ? : 와일드 카드로 제너릭에 대해서 모든 타입을 받을 수 있도록 함
	static void wildCardMethod (List<?> arg) {
		System.out.println(arg);
	}
	
	// ? extends 클래스명 : 특정 클래스 혹은 특정 클래스를 상속 한 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인 클래스 또는 자손 클래스)
	static void extendMethod (List<? extends MyClass> arg ) {
		System.out.println(arg);
	}
	// ? super 클래스명 : 특정 클래스 혹은 특정 클래스가 상속한 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인 클래스 또는 조상 클래스)
	static void superMethod (List<? super MyClass> arg) {
		System.out.println(arg);
	}
}

class SuperClass {
	
}

class MyClass extends SuperClass {
	
}

class SubClass extends MyClass {
	
}

public class C_Generic {

	public static void main(String[] args) {
		
		Test3 myTest = new Test3();
		myTest.subject = "국어";
		myTest.score = 95; // 클래스에서 Object로 타입을 선언했기때문에 이 인스턴스에서는 Integer로 초기화	
		
		Test3 yourTest = new Test3();
		yourTest.subject = "경영학원론";
		yourTest.score = "A+"; // 클래스에서 Object로 타입을 선언했기떄문에 이 인스턴스에서는 String으로 초기화
		
		// myTest.score
		
		Test4<Integer> hisTest = new Test4<>();
		hisTest.score = 95;
		// hisTest.score = "A+";  ㅡ> 인스턴스 생성시 타입을 Integer로 지정해뒀기 때문에 이 코드를 작성하면 컴파일 에러 발생
		
		Test4<String> herTest = new Test4<>();
		herTest.score = "A+";
		
        // Test5.method("object");
        // Test5.method(10);
		
		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");
		
		List<Boolean> arrayList2 = new ArrayList<>();
		arrayList2.add(true);
		arrayList2.add(false);
		arrayList2.add(true);
		
		Test5.method(arrayList1);
		Test5.method(arrayList2);
		
		Test5.wildCardMethod(arrayList1);
		Test5.wildCardMethod(arrayList2);
// =========================================================================================================================		
		SuperClass SuperClass = new SuperClass();
		MyClass MyClass = new MyClass();
		SubClass SubClass = new SubClass();
		
		List<SuperClass> superList = new ArrayList<>();
		superList.add(SuperClass);
		List<MyClass> myList = new ArrayList<>();
		myList.add(MyClass);
		List<SubClass> subList = new ArrayList<>();
		subList.add(SubClass);
		
		Test5.wildCardMethod(superList);
		Test5.wildCardMethod(myList);
		Test5.wildCardMethod(subList);
		
		// Test5.extendMethod(superList); ㅡ> List에 오는 타입이 반드시 MyClass를 상속받은 클래스만 가능하게 제약을 걸어서 superlist는 메소드 호출이 불가능
		Test5.extendMethod(myList);
		Test5.extendMethod(subList);
		
		Test5.superMethod(superList);
		Test5.superMethod(myList);
		// Test5.superMethod(subList); ㅡ> List에 오는 타입이 반드시 SuperClass를 상속받은 클래스만 가능하게 제약을 걸어서 subList는 불가능
		
	}
}