package chapter01;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// 제어문 (조건문) if
		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 :");
//		int age = sc.nextInt();
//		if(age > 19) {
//			System.out.println("성인입니다.");
//		} else {
//			System.out.println("미성년자 입니다.");
//		}
		
//		int number = sc.nextInt();
//		if (number > 0) {
//			System.out.println("양수 입니다.");
//		} else if (number < 0 ) {
//			System.out.println("음수 입니다.");
//		} else if (number <= 0 ) {
//			System.out.println("0보다 크거나 같습니다.");
//		}else{
//			System.out.println("0입니다.");
//		}
//      System.out.println(number);		
		
		
		// Ex) 0이 아닐경우에만 연산을 실행해라
		// 0이면 0이다 라고 출력
		int inputValue = sc.nextInt();
		
//	if (inputValue != 0) {	
//	   if (inputValue >= 100) {
//		   int a = 10 / inputValue;
//		   int b = a * inputValue;
//		   b++;
//		   System.out.println(a * b);  
//	   } else {
//		   System.out.println("100 이상입니다.");
//	   }
//
//    } else {
//		System.out.println("0입니다.");
//    }
		
// 코드의 가독성이 떨어지지 않게 효율적으로 작성해야한다
// 조건 검증 코드를 먼저 작성한 후 실제 코드 블럭에 들어가는 프로세스 코드를 써야 뭐가 뭔지 구분이 쉽게 가능함
		if (inputValue == 0) {
			System.out.println("0입니다");
			return;
		}
		if (inputValue >=100) {
			System.out.println("100 이상 입니다");
			return;
		}
		int a = 10 / inputValue;
		int b = a * inputValue;
		b++;
		System.out.println(a * b);
	}	
}







