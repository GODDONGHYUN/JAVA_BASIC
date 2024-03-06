package ch01;

import java.util.Scanner;

public class C_Operator {

	public static void main(String[] args) {
		
		// 연산자
				int a = 15;
				int b = 7;
				double c = 15.0;
				double d = 7.0;
				
				int intResult;
				double doubleResult;
				
				// 산술 연산자 : 사칙연산 작업 숫 자 데이터에 대해서 연산을 수행
				
				// 더하기 : +
				
				// 좌항에 우항을 더한 값을 반환
				intResult = a + b;    // 22 a 와 b 둘 다 정수타입이라 intResult에도 정수가 들어간다.
				doubleResult = c + d; // 22.0
				
				doubleResult = a + b; // 정수와 정수 타입을 더해도 doubleResult에 들어가때 자동형변환이 일어나서 정상적으로 값이 들어간다
				intResult = (int) (c + d); // intResult는 정수고 c 와 d는 실수이기때문에 강제 형변환을 해줘야한다

				doubleResult = a + d; // 정수 + 실수는 실수이기때문에 intResult가 아닌 doubleResult에 더한 값을 할당 해야한다.
				
				// 빼기 : -
				// 좌항에 우항을 뺀 결과를 반환
				intResult = a - b; // 8
				doubleResult = c - d; // 8.0
				
				// 정수 - 실수 = 실수
				doubleResult = a - d;
				
				// 곱하기 : *
				// 좌항에 우항을 곱한 결과를 반환
				intResult = a * b; // 105
				doubleResult = c * d; // 105.0
				
				// 정수 * 실수 = 실수
				doubleResult = a * d;
				
				// 나누기 : /
				// 좌항에 우항을 나눈 결과를 반환  - > 진짜 실제로 연산 후 나온 결과를 반환 !  
				// 정수 나누기 정수의 결과는 실수부가 버려짐
				// 실수 나누기 실수의 결과는 실수부가 포함돼서 결과를 도출함
				intResult = a / b; // 2
				System.out.println(intResult);
				doubleResult = c / d; // 2.142857142857143
				System.out.println(doubleResult);
				doubleResult = a / d; // 2.142857142857143
				System.out.println(doubleResult);
				
				// 나머지 : %
				// 좌항에 우항을 나눈 나머지를 반환
				intResult = a % b; // 1
				doubleResult = c % d; // 1.0

				// 증감 연산자
				// 피연산자의 값을 1 증가 혹은 감소
				// 증가 연산자 : ++
				// 감소 연산자 : --
				int number = 5;
				// intResult = ++number + 5; "11" > number를 먼저 1 증가 시킨 후 연산을 진행함.
				// intResult = number++ + 5; "10" > 이 코드에서는 number의 값이 증가를 하지않는다. 연산을 한 후 number의 값이 증가를 하기 때문에 증감하지 않은 값인 5로 할당이 되어서 연산이 됨
				System.out.println(intResult);    // 따라서 이 이후에 number를 출력을 하면 1이 증가가 된 값인 6이 출력이 되는 것임 !

		// ===================================================================================================================================
				
				// 대입 연산자 : 좌항에 우항을 대입
				// 일반 대입 연산자 : =
				// 상수에 초기화를 할때를 제외하고 좌항이 반드시 변수이어야 함
				// 좌항에 우항을 할당
				number = 10;
				
				// 복합 대입 연산자 : 산술연산=
				// 좌항에 사용되는 변수는 반드시 초기화가 되어 있어야 함
				// 좌항에는 변경 가능한 일반 변수가 와야함 ( 상수 불가능 )
				// 좌항에 우항을 연산한 결과를 좌항에 대입
				number += 10; // 20 number에 10을 더한 값을 다시 number에 할당
				number -= 7;  // 13 number에 7을 뺀 값을 다시 number에 할당
				number *= (7 - 5); // 26 우항을 무조건 먼저 계산한 후 나온 값인 2를 위에서 number에 할당한 값인 13을 곱한 값을 다시 number에 할당
				
				// int number1;
				// number1 += 10;
				
				// 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리값으로 반환
				boolean booleanResult;
				// 같다, 다르다 연산
				// == : 좌항과 우항이 같으면 true 다르면 false
				// != : 좌항과 우항이 다르면 true 같으면 false
				booleanResult = a == b;  // a 와 b의 값이 다르기 때문에 false
				System.out.println(booleanResult);
				booleanResult = a != b; // a 와 b의 값이 다르기때문에 true
				System.out.println(booleanResult);
				
				String string = "Hello";
				booleanResult = string == "Hello";
				System.out.println(booleanResult);
				
				// 작다, 작거나 같다 연산
				// < : 좌항이 우항보다 작으면 true, 같거나 크면 false
				/// <= : 좌항이 우항보다 작거나 같으면 true, 크면 false
				booleanResult = a < c;
				System.out.println(booleanResult); // a가 c랑 같기 때문에 false
				booleanResult = a <= c;
				System.out.println(booleanResult); // a가 c랑 같기 때문에 true
				
				// 크다, 크거나 같다 연산
				// > : 좌항이 우항보다 크면 true, 좌항이 우항보다 같거나 작으면 false
				// >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
				booleanResult = a > c;
				System.out.println(booleanResult); // a가 c랑 같기 때문에 false
				booleanResult = a >= c;
				System.out.println(booleanResult); // a가 c랑 같기 때문에 true
				
		// ===================================================================================================================================
				
				// 논리 연산자 : 피연산자가 모두 논리형태로 논리 값을 조합하는 것
				// 논리 값이 오는게 아니라 논리 식이 오는 것임 착각하면 안돼 !
				// && : AND 연산 - 좌항과 우항이 모두 true이면 true, 하나라도 false이면 false
				 booleanResult = false && false;   // true
				 System.out.println(booleanResult);
				 booleanResult = a > b && c > d;  // true
				 System.out.println(booleanResult);
				
				// || : OR 연산 - 좌항과 우항 중 하나라도 true면 true, 모두 false면 false
				booleanResult = true || true; // true
				System.out.println(booleanResult);
				booleanResult = a < b || c > d;
				//               false || true -> true가 존재하기 때문에 true
				System.out.println(booleanResult);
			
				// a : 15 b : 7
				booleanResult = (a > b) && (a > ++b); // AND연산자의 경우 앞이 True여야 뒷 부분이 무조건 실행 된다 이 구문 같은 경우 False라 뒷 부분을 읽지 않음
				System.out.println(booleanResult);
				System.out.println(b);
				
				booleanResult = (a > b) || (a  > ++b); // OR연산자의 경우 앞이 False여야 뒷 부분이 무조건 실행 된다 이 구문 같은경우 True라 뒷 부분을 읽지 않음
				System.out.println(booleanResult);
				System.out.println(b);
				
				// 삼항 연산자 : 간단한 조건에 따라 결과를 반환하는 연산자
				// 조건(논리식) ? 참일 때 결과 : 거짓일 때 결과
				Scanner scanner = new Scanner(System.in);
				System.out.print("나이 : ");
				
				int age = scanner.nextInt();            
				                      // age가 19보다 크면 성인 / 작거나 같으면 미성년자를 출력
				String stringResult = age > 19 ? "성인" : "미성년자";
				System.out.println(stringResult);

	}

}
