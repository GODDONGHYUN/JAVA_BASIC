package ch01;

public class B_Datatype {

	public static void main(String[] args) {
		
		// 기본형 데이터 타입
		
		// 정수형 데이터 타입 : 실수부가 없는 정수를 나타냄
		// byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// -128 ~ 127
		
		 byte byte1 = 127;
		//  byte byte2 = 128;  에러 발생 ! (Type Mismatch: cannot convert from int to byte)
		                                           // 기본적으로 값이 저장될때 리터럴 값은 int로 인식이 되기때문에 에러에서도 int로 표기 됨
		
		// short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ 32767
		
		short short1 = 32767;
		// short short2 = 32768; 에러 발생 ! (Type Mismatch: cannot convert from int to short)
		
		// int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2147483648 ~ 2147483647;
		
		int int1 = 2_147_483_647;
	    // int int2 = 2_147_483_648; 에러 발생 ! (the literal 2_147_483_648 of type int is out of range) // int는 byte, short와 다르게 int 범위를 넘어가버리기때문에 저장이 애초에 안돼서 에러가 이렇게 출력		
		
		// long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		long long1 = 2_147_483_648L;  // int와는 다르게 long은 구별하는 표기법이 있음
		
		// ========================================================================================================================
		
		// 실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		// float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 6-7 자리에서 오차가 발생
		
		float float1 = 3.1415926535F;  
		System.out.println(float1);  // = 3.1415927
		
		// double: 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 15-17 자리에서 오차가 발생
		
		double double1 = 3.1415926535;
		System.out.println(double1);  // 오차범위 까지 도달하지 않았기 때문에 3.1415926535 그대로 출력
		
		// ========================================================================================================================
		
		// 문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
		// char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
		// 0 ~ 65535
		
		char char1 = 'a';
		char char2 = 97;
		System.out.println(char1);
		System.out.println(char2);
		
		// 논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		// boolean: 1byte(8bit)의 크기를 가지는 논리형 데이터 타입
		// true, false
		
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		// ========================================================================================================================
		
		// 형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		
		// 자세히 볼 필요 없고 개념만 알고 있으면 나중에 실질적으로 사용할 일이 드뭄(?)
		
		// 자동 형변환 (묵시적 형변환) : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		int number = 10;
		long longNumber = number;
		
		
		// 강제 형변환 (명시적 형변환) : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때 발생
		// 할당하고자 하는 큰 데이터 타입 변수 앞에 (작은 데이터 타입)을 붙혀줌
		
		
		// number = longNumber => 에러 발생 ! (longNumber cannot be resolved to a variable)
		
		 number = (int) longNumber;  
		
		 number = 127;
		 byte byteNumber =  (byte) number;  // -> 출력하게 되면 엉뚱한 값인 -128이 출력된다. 여기서 주의해야할 점은 데이터 손실이 일어 날수 있다. 		
		 System.out.println(byteNumber);
		
		
		// 데이터 타입은 다른데 같은 크기의 데이터 타입의 형변환  (short, char) (int, double)
		// 자동이 되던 말던 암묵적으로 강제 형변환을 사용한다.
		
		 short shortNumber = 97;
		 char character = 97;
		
		// shortNumber = character;
		
		 int intNumber = 100;
		 float floatNumber = 100;
		
		// 이 친구는 강제 형변환으로 형변환을 해야함
		// intNumber = floatNumber;   에러 발생! (Type mismatch cannot convert from float to int)
		
		// ========================================================================================================================
		
		
		
		 // 참조형 데이터 타입 : 객체의 참조 (즉, 메모리주소)를 저장한다. 클래스, 인터페이스, 배열, 열거형 등을 포함
		 // 참조 데이터 타입의 기본 값은 'null' 이며 , 이는 어떤 객체도 참조하지 않음을 의미
		 // 그래서 반드시 참조 데이터 타입의 변수를 사용하기 전에 반드시 객체를 할당 해야하고 그렇지 않으면 NullPointerException이 발생한다.
		
		// 배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		// new 연산자를 이용해서 '생성'을 해야함
		// 한번 생성된 배열의 크기는 변경할 수 없음
		
		/* 선언
		  	 데이터 타입[] 변수명(배열명);
		   생성
		     변수명 = new 데이터타입[크기];	
		*/
		
		 int[] numbers; // 선언
		 numbers = new int[5];  // 생성
		 System.out.println(numbers); // 이대로 출력을 해버리면 배열 주소가 출력이 됨 (배열 주소는 다 다름)
		
		 int[] numbers2 =  {1 , 2 , 3 , 4 , 5} ;  // 초기화
		 int[] numbers3 = new int[] {1 , 2 , 3 , 4 , 5}; // 생성과 동시에 초기화		
		 System.out.println(numbers2);
		 System.out.println(numbers3);
		
		 // 배열의 요소에 접근 할 수 있는 '인덱스' 사용
		 // 인덱스는 0번부터 시작 마지막 인덱스는 길이 -1번
		 int item = numbers2[0];
		 System.out.println(item);
		 item = numbers[0];         // 실질적으로 초기화를 안했고, 0으로 할당이 되어서 0이 출력 되는거임 ㅇㅋ?
	     System.out.println(item);
	     numbers[0] = 99;           // 여기서 numbers 배열 0번 인덱스에 99를 재할당
	     System.out.println(item);  // item에는 할당을 안했기때문에 출력하면 그대로 0이 출력
	     item = numbers[0];         // item에 numbers 0번 인덱스 값인 99를 할당
	     System.out.println(item);  //  99출력
	    
	    
	     System.out.println("=============================");
	     System.out.println("=============================");
	     System.out.println("=============================");
	    
	     // 인덱스 범위를 초과하는 인덱스에 접근할 시 예외 발생
	     // System.out.println(numbers[5]);
	    
	     // numbers : {99, 0, 0, 0 , 0} X , [I@182decdb O  -> 실질적으로는 배열 값이 들어가는게 아니라 배열 주소가 들어감
	     System.out.println(numbers);
	     numbers2 = numbers;        
	    
	     // numbers2 : {99, 0, 0, 0, 0} X, [I@182decdb O -> 얘도 마찬가지로 변수에 배열 값이 아니라 주소가 들어감
	     System.out.println(numbers2);
	     numbers[4] = -99; // numbers[4]번 인덱스에 -99를 재할당
	    
	     // numbers : {99, 0, 0, 0, -99}
	     // numbers2 : {99, 0, 0, 0, -99}
	    
	     System.out.println(numbers2[4]); // 그래서 numbers2[4]번 인덱스도 똑같이 -99가 출력이됨
	    
	     // 즉, numbers배열을 numbers2에 할당 할때 실질적으로 배열의 값이 아닌 주소를 할당하고 , numbers2 주소와 numbers 주소가 같기때문에 numbers의 4번 인덱스 값을 -99로 재할당하고 numbers2 의 4번 인덱스를 출력해도 똑같이 -99가 출력이 되는 것을 볼 수 있다  
	    
	     // int numbers1 = 0;
	     // int numbers2 = number1;
	     // number1 = -99;
	     // System.out.println(number1);
	     // System.out.println(numbers2);
	    
	    
	     // ========================================================================================================================
	    
	     char[] chars1 = {'a', 'p', 'p', 'l', 'e'};
	     System.out.println(chars1);
	    
	    
	     // String : 문자열을 표현하는데 사용되는 참조형 데이터 타입
	     // 문자열을 다루는데 유용한 여러가지 기능을 제공해주고 있음
	     String string1 = "apple";
	    
	     // String의 주요 기능
	     String statement = "  My name is IronMan  ";
	    
	     // 1. 문자열 결합
	     // + 혹은 concat(문자열)으로 두 문자열을 연결할 수 있다
	     System.out.println(statement + "!!!");
	     System.out.println(statement.concat("???"));
	    
	     // 2. 문자열 비교
	     // equals(문자열) : 두 문자열이 동등한지 비교
	     // compareTo(문자열) : 두 문자열을 사전순으로 비교
	     // compareToIgnoreCase(문자열) : 대소문자 구분없이 사전순으로 비교
	      System.out.println(statement.equals("My name is hulk"));  // 다르기 때문에 false로 출력
	      System.out.println(statement.compareTo("apple")); // 아스키 코드상으로 비교  -20 출력
	      System.out.println(statement.compareToIgnoreCase("apple"));
	      
	     // 3. 문자열 길이
	     // length() : 문자열의 길이를 반환
	      System.out.println(statement.length()); // 공백 포함 18을 반환해서 출력해줌
	      
	     // 4. 문자열 변환
	     // toUpperCase() : 모든 문자를 대문자로 변경
	     // toLowerCase() : 모든 문자를 소문자로 변경	
	     // trim() : 문자열의 앞뒤 공백을 모두 제거
	     System.out.println(statement.toUpperCase());
	     System.out.println(statement.toLowerCase());
	     System.out.println(statement.trim());
	    

	     // 5. 문자열 찾기
	     // indexOf(문자열) : 찾고자 하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
	     // lastIndexOf(문자열) : 찾고자 하는 문자열의 마지막으로 찾은 위치의 인덱스 번호를 반환
	     statement = "내가 그린 기림 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘못 그린 기린 그림이다.";
	     System.out.println(statement.indexOf("그림"));  // 그림의 인덱스 번호인 9가 출력
	     System.out.println(statement.indexOf("하마"));  // 없는 단어이기 때문에 -1을 출력
	     System.out.println(statement.lastIndexOf("그림")); // 마지막으로 찾은 그림의 인덱스 번호 값을 출력 -> 48
	     System.out.println(statement.lastIndexOf("하마")); // 없는 단어 이기때문에 -1을 출력
	    
	    
	     // 6. 부분 문자열
	     // subString(시작인덱스), subString(시작인덱스, 종료인덱스) : 문자열을 원하는 크기만큼 추출
	     System.out.println(statement.substring(48)); // 시작인덱스 번호 값의 위치인 그림부터 끝까지 출력
	     System.out.println(statement.substring(3, 10)); // 시작인덱스 번호 값의 위치 부터 10번 인덱스 번호 값의 경계선까지 문자열을 춮력
	    
	     // null : 아직 어떠한 값도 지정되지 않은 상태
	     String string2 = null;
	     System.out.println(string2);
	     System.out.println(string2.substring(48)); // 예외 발생 !
	    
	    
	    
	}

}