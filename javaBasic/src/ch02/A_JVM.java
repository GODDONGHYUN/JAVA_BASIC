package ch02;

class ExampleClass2 {
	static int number = 3;
	double doubleNumber;
	
	
	// void method() {
	//	int number = 0;
	// }
	
	
	//  void method(Sample1 arg) {
	//   arg.data++;
	//  System.out.println("method in : " +
	//  arg.data);
	//  }
	
	
    //	int method() {
    //		int number = 99;
    //		return number;
    //	}
	
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;
	}
	static void  staticMethod() {
		
	}
}

class Sample1 {
	int data;
	
	Sample1() {
		
	}
	Sample1 (Sample1 sample) {
		this.data = sample.data;
	}
}

public class A_JVM {
	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		//number = instance1.method();
		sample = instance1.method();
		//instance1.method(number);
		// instance1.method(sample);
		// System.out.println(number);
		System.out.println(sample.data);
		
		int number2 = number;
		number2++;
		System.out.println(number);
		System.out.println(number2);
		
		
		// 참조형 인스턴스 주소를 복사 하는거기 때문에 둘 다 동일한 주소의 데이터를 가지고 있어서 값이 동일
		Sample1 sample2 = sample;
		sample2.data++;
		
		System.out.println(sample.data);
		System.out.println(sample2.data); // -455 동일한 값 출력
		
	    Sample1	sample3 = new Sample1(sample);
		System.out.println(sample.data);
		System.out.println(sample2.data);
		
		sample3.data++;
		System.out.println(sample3.data);
		
	}
}