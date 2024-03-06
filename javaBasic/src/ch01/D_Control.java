package ch01;

import java.util.Scanner;

public class D_Control {

	public static void main(String[] args) {
		
		// 제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		
		Scanner scanner = new Scanner(System.in);
        // System.out.println("나이 :");
        // int age = scanner.nextInt();
	
		// 조건문 : 특정 조건이 만족하면 코드를 실행하는 것, 만족하지 않으면 실행하지 않음
		
		// if : 주어진 조건이 true이면 코드를 실행하도록 하는 것
		// if ( 조건-논리표현식 ) { 실행할 코드 }
		
	
        // if ( age > 19 ) {          
        // System.out.println("성인입니다");          
        // }
		
		// age는 17보다 크거나 같거나 19보다 작거나 같아야한다.
		// age >= 17 || age <= 19
		
	
		
		// age는 17보다 크면서 크거나 같으면서 19보다 작거나 같아야한다.
		// age >= 17 && age <= 19
		
		// 논리 연산자의 결과 값은 boolean
		
	    // boolean isHighSchool = age >= 17 && age <= 19;
		
		// if(isHighSchool) {                    
		// System.out.println("고등학생입니다");  
		// }  
		
		// ======================================================================================================================
		

		// 부정연산자 : 논리 표현식을 부정하는 연산
		// ! : true면 false, false면 true

	    // if(!isHighSchool) {                 만약 ishighschool이 아니면 고등학생이 아닙니다를 출력
		//	System.out.println("고등학생이 아닙니다");  
		// }
		
		// ======================================================================================================================
		
		// else : if 문의 조건-논리표현식이 false면 코드를 실행하도록 하는 것
		// if (조건-논리표현식) {true면 실행할 코드}
		// else {false면 실행할 코드}
		
		// 주의점 !
		// 1. else문은 반드시 if문 이후에 와야함 (else 단독으로 사용 불가능)
		// 2. else문에는 조건을 작성하지 않는다.
		
        // if( age > 19) {
        // System.out.println("성인입니다.");
        // }
        // else {
        // System.out.println("미성년자 입니다.");
        // }	
        // System.out.println("프로그램 종료");	
		
		// ======================================================================================================================
		
		// else if : 2개 이상의 조건을 걸 때 사용
		// 문법상으로 존재하는 if문은 아님 !
		// 다중 if 조건문을 걸때 코드블럭 상으로 중괄호가 생략 된 구문이라고 생각하셈
		
		String fruit = "수박";
		if (fruit.equals("사과")) {
			
		} else if (fruit.equals("바나나")) {
			
		} else if (fruit.equals("귤")) {
			
		} else {
			
		}
		
		// ======================================================================================================================
		
		// switch : 특정 변수 또는 값에 따라 실행할 코드 블록의 범위를 결정하는 것
	    /* switch (변수-일반표현식) {
		 case 값1:
		 변수-일반표현식이 값1과 같을때 시작할 코드 위치
		 case 값2 :
		 변수-일반표현식이 값2와 같을때 시작할 코드 위치
		switch 내부에서 break문을 만나면 switch문을 종료
		  break;
		case 값3 :
			변수-일반표현식이 값3과 같을때 시작할 코드 위치
		default :
			변수-일반표현식이 case의 값과 일치하는 것이 없거나
			바로 위에서 break문을 만나지 않으면 실행되는 코드
		} */
		
		// int input = scanner.nextInt();
		// input이 0이면 ABC를 출력
		// input이 1이면 BC를 출력
		// input이 2이면 C
		// input이 3이면 DEF
		// input이 4이면 EF
		// input이 0-4가 아니면 F
		
		/* switch (input){
		 case 0:
			System.out.println("A");
		 case 1:
			System.out.println("B");
		 case 2:
			System.out.println("C");
			break;
		 case 3:
			System.out.println("D");
		 case 4:
			System.out.println("E");
		 default:
			System.out.println("F");
		} */
		
		
		// 아래 조건처럼 if else문 처럼 쓰려면 모든 case 구간에 break를 걸어줘야함 ( 프로젝트 회원가입 코드에 존재함 나중에 참고해서 보셈)
		// input이 0이면 A를 출력
		// input이 1이면 B를 출력
		// input이 2이면 C
		// input이 3이면 D
		// input이 4이면 E
		// input이 0-4가 아니면 F
		
	/*	switch (input){
		 case 0:
			System.out.println("A");
			break;
		 case 1:
			System.out.println("B");
			break;
		 case 2:
			System.out.println("C");
			break;
		 case 3:
			System.out.println("D");
			break;
		 case 4:
			System.out.println("E");
			break;
		 default:
			System.out.println("F");
		} */
		
		System.out.println("========================================================================");
		
		// 반복문 : 특정 조건에 부합하면 지정한 코드를 여러 번 실행하도록 하는 것
		
		// for : 일반적 반복 횟수가 정해져있을 때 사용하는 반복문
		// for (조건에 사용할 변수 초기화; 조건; 조건에 사용할 변수 증감) { 반복할 코드 }
		
		//               true                        false
		// 즉, count 조건에 맞을때 까지만 반복이 실행되고 조건에 벗어나게되면 반복이 멈춘다
		for (int count = 1; count <= 3; count++) {
			System.out.println("안녕하세요.");
		}
		
		for (int count = 1; count <= 5; count++ ) {
			System.out.println(count + "번 안녕하세요.");
		}
		
        // -1번 안녕하세요. 2번 안녕하세요. 5번 안녕하세요. 8번 안녕하세요. 11번 안녕하세요.
	
		for (int count = 1; count <= 5; count++) {
			System.out.println((3* count-4) + "번 안녕하세요.");
		}
		
		System.out.println("========================================================================");
		
		// 구구단
		// 이와 같이 이중 for문은 성능적으로 떨어질 수가 있기때문에 반복되는 규칙을 잘 생각하고 사용하여야 한다
		 for (int i =2; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "*"+ j + "=" + (i * j) + "\t");
		 }
		   System.out.println();
	     }
		
		System.out.println("========================================================================");
		
		int [] numbers = new int [5];
		
		// numbers[0]= 1 ... numbers[4] = 5 반복문으로 출력
		for (int index = 0; index < numbers.length; index++ ) {
			numbers[index] = index + 1;
		}
		
		// 배열 값 출력
		
		
		  for (int index = 0; index < numbers.length; index++) {
		  System.out.println(numbers[index]); }
		

		System.out.println("========================================================================");
		
		// forEach 문
		// 컬렉션(리스트, 배열 등)의 각 요소를 하나씩 변수에 복사하여 사용하는 반복문
		// forEach는 단순히 기존에 있던 값을 복사해서 다른 기능을 하기위한 단순 작업을 위해서 사용되는 용도
		// 실질적으로 반복문을 돌면서 값을 변형하고 이용하려면 for 문을 사용
		// numbers : {1, 2, 3, 4, 5}
	
		for (int number : numbers) {
			number = 0 ;
		}
		for (int number: numbers) {
			System.out.println(number);
		}
		
		System.out.println("========================================================================");
		
		// while : 반복할 횟 수가 정해져있지 않을 때 사용하는 반복문
		// 조건이 true인 동안 반복, 조건이 false가 되면 반복 종료
		int input = 1;
		
		// 입력 값이 짝수이면 true, 아니면 false
		// input에 짝수를 기입하면 안내문과 함께 입력값 출력, 아니면 처음으로 다시 돌아가서 코드 실행
		while ( input != 0 ) {
			input = scanner.nextInt();
		    if (input % 2 != 0 ) {
		    	// continue : 반복문에서 continue문을 만나면 조건 검사로 넘어감
		    	continue; // 저 조건 상에서 input을 2로 나눴을때 0이 아니면 True이기 때문에 조건을 충족시켜서 밑에 구문을 실행 안시키고 다시 조건 검사로 돌아가는거임
		    }
		    if (input == 0) {
		    	break;  // break : 반복문에서 break문을 만나면 반복문을 종료 !
		    }
		    System.out.println("입력 값 : " + input);
		    System.out.println("while 반복문 실행 중.."); // 사용자로부터 코드로 구성한 값이 입력이 될 경우 종료 아니면 무기한 반복
		}
		System.out.println("while 반복문 종료!");
		
	
		for (int index = 0; index < 10; index++) {// true면 continue를 만나서 밑에 구문 실행 X인거임 ㅇㅋ?
			if (index % 3 == 0) continue; // 3의 배수이면 아래 println 코드를 실행 하지않고 다시 반복문으로 이동
			if (index == 8) break;   // index가 8일 경우, 반복문 종료
			System.out.println(index);
		}
	}

}