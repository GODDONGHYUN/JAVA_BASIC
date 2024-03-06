package ch02;

// 인터페이스 : 클래스가 구현해야'만'하는 메서드들을 선언하는 참조 타입
// 인터페이스의 모든 변수는 public static final 형태
// 인터페이스의 모든 메서드는 public abstract 형태가 와야함 (default나 static 형태의 메서드가 올 수도 있음)
// 인터페이스는 다중 구현이 가능       (implement를 한 클래스  ==== 구현체)
// 인터페이스에서 정의 된 메소드는 반드시 구현체에서 구현되어야 한다

// 접근 제어자 interface 인터페이스명 {...}
// 넓이 공식
// 삼각형 넓이 구하기 - Double 밑변, Double 높이 ㅡ> Double 삼각형 넓이
// 정사각형 넓이 구하기 - Double 변 ㅡ> Double 정사각형 넓이
// 직사각형 넓이 구하기 - Double 밑변, Double 높이 ㅡ> Double 직사각형 넓이
// 원 넓이 구하기 - Double 반지름 ㅡ> Double 원넓이 (여기서 원주율이 빠진 이유는 절대적인 상수는 인터페이스에 기입 안함)

interface AreaCarculation {
	
	public static final double PI = 3.14;
	
	// 인터페이스 메서드 생성
	public abstract double getTriangleArea (double bottom, double height);
	public abstract double getSquareArea (double side);
	public abstract double getRectangleArea (double bottom, double height);
	public abstract double getCircleArea (double radius);
}

// 인터페이스는 implements 키워드를 이용해서 클래스에 구현해야함
class MyMath implements AreaCarculation {

	@Override
	public double getTriangleArea(double bottom, double height) {		
		return bottom * height / 2;
	}

	@Override
	public double getSquareArea(double side) {
		return side * side;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {		
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {	
		return radius *radius * PI;
	}
	
}

class MyMathV2 implements AreaCarculation {
	@Override
	public double getTriangleArea(double bottom, double height) {		
		return bottom * height / 2;
	}

	@Override
	public double getSquareArea(double side) {
		return Math.pow(side, 2);
	}

	@Override
	public double getRectangleArea(double bottom, double height) {		
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {	
		return radius *radius * PI;
	}
}

public class G_Interface {

	public static void main(String[] args) {
		
		AreaCarculation instance = new MyMathV2(); // 기존에 있던 코드의 데이터를 유지시키고 코드의 안정성을 향상 시키기 위해 다형성, 인터페이스의 확장을 사용

	}

}