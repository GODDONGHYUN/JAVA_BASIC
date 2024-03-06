package chapter01;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
	  // 데이터 타입

	  // 정수형 타입
	  // byte(1 byte), short(2 byte), int(4 byte), long(8 byte)
		
	  byte b1 = 0;
	  byte b2 = 127;
	  // byte b3 = 128; X! (byte 범위 : -127~ 127)
		
	  short s1 = 128;
	  short s2 = 32767;
	  // short s3 = -32768; X! (short 범위 : -32767 ~ 32767)
		
	  int i1 = 32768;
	  int i2 = 2147483647;
	  //int i3 = 2147483648; X! (int 범위 : -2,147,483,647 ~ 2,147,483,647)
		
	  long l1 = 2147483648L; // 원래라면 int를 초과하는 값이 들어가야하지만 자바 자체에서 int로 인식하기 때문에 뒤에 L을 붙혀서 변환을 해줘야함
	  
	  // 실수형 타입
	  // float (4 byte) double (8 byte)
	  float f1 = 3.1415f; // 실수도 double 값으로 인식? 하기때문에 뒤에 f를 붙혀줘야함 (사용 잘 안함) 
	  double d1 = 3.1415;
	  
	  // 논리형 타입
	  // boolean ( 1 byte)
	  boolean bool1 = true;
	  boolean bool2 = false;
	  
	  // 문자 타입
	  // char ( 2 byte)
	  char c1 = 'a';
	  char c2 = 97;    // 아스키 코드 표에서 10진수 a를 표현한 것
       System.out.println(c1); // = a
	   System.out.println(c2); // = a
	  
	  // 입력 (System.in)
      // java.util.Scanner  Scanner 객체
      Scanner sc = new Scanner(System.in);
      int inputNumber = sc.nextInt();
      System.out.println(inputNumber);
      long inputCharacter = sc.nextLong();
      System.out.println(inputCharacter);
	  
	  // 형 변환
	  // 자동 형변환
	  byte by1 = 100;
	  int number1 = by1;
	  System.out.println(number1);
	  
	  float float1 = number1;
	  System.out.println(float1);
	  
	  // 강제 형변환
	  // 사이즈(byte)가 큰 변수에서 작은 변수로 데이터를 저장할때 발생
	  int number2 = 1000; 
	  byte by2 = (byte) number2;
	}

}
