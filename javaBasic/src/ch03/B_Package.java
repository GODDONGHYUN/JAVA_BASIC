package ch03;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class B_Package {

	public static void main(String[] args) {
		
		// # Wrapper 클래스 : 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 있도록 하는 클래스
		// 일반적으로 기본형 데이터 타입의 풀네임에 첫 글자를 대문자로 지정하면 Wrapper 클래스가 됨
		Integer wrapperInt = 10;
		Double wrapperDouble = 10.0;
		Boolean wrapperBoolean = false;
		String wrapperString = "String";
		
		// 자주 사용하는 기능
		// parse 메서드 : 문자열을 특정 타입으로 변환
		 int number = Integer.parseInt("123");
		
		// toString 메서드 : 특정 타입의 값을 문자열로 변환
		String string = Integer.toString(123);
		
		// 1234567890 :
		// 이 숫자는 몇자리 까지 있으면 1의자리부터 10억자리까지의 각각의 숫자 출력 문제 나옴
		// 10 1의 자리 : 0 10의 자리: 9 ... 이렇게 나와야하는거임
		
		// # Collection Framework : java에서 데이터 구조에 대한 표준화된 기법 제공
// =============================================================================================================================		
		// List (인터페이스) : 데이터를 저장할 때 중복을 허용하고 순서가 존재함
		List<Integer> arrayList; //  int[] arrayList; ㅡ> 비스무리한 느낌
		// List<Object> arrayList;  -> 밑에 보면 int 타입과 string 타입이 둘 다 있는데,
		// 이럴경우에는 get을 쓸 때 타입이 뭔지 모르기때문에 object를 안써야 돼
		
		// ★ ArrayList ★ : List 중에서 내부 배열을 사용하여 인덱스를 사용한 검색이 빠름
		arrayList = new ArrayList<>(); // 빈 배열 생 성!{}
		System.out.println(arrayList);
		// LinkedList : 이중 연결 기법을 사용하여 추가, 삭제가 빠름
		// arrayList = new LinkedList<>();
		
		// add() : List에 요소를 추가
		// 추가할 요소의 데이터 타입은 반드시 제너릭으로 지정한 타입으로만 추가 가능
		arrayList.add(10); // {10}
		System.out.println(arrayList);
		// arrayList.add("adad");
		
		// get() : List의 특정 인덱스 요소에 접근
		// List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		// 기본형 데이터타입의 변수로 반환 값을 받을 경우 null 값을 받을 수 있음을 주의
		 int arrayElement = arrayList.get(0);
		 System.out.println(arrayElement);
		
		// set() : List의 특정 인덱스 요소를 변경
		// List 인덱스 범위를 초과하는 인덱스를 지정 할 수 없음 !
		 arrayList.set(0,  50);
		 System.out.println(arrayList);
		
		// remove() : List의 특정 요소를 삭제
		// List의 인덱스 번호 값을 넣어도 가능하고 요소의 값을 넣어도 가능하다 !
		// 다만 지금은 Integer라 컴파일러가 빡대가리라서 인식을 못함
		arrayList.remove(0);  
		System.out.println(arrayList);
		
		// size() : List의 길이를 반환                                            
		System.out.println(arrayList.size());
		
// ================================================================================================================
		
		// Set : 데이터를 저장 할 때 중복을 허용하지 않고 순서가 존재하지 않음 (집합)
		Set<String> set;		
	    // HashSet : 해싱 기법을 사용해서 검색 속도가 빠름
		// set = new HashSet<>();
		// TreeSet : 요소를 정렬해서 추가
		 set = new TreeSet<>();
		// add() : Set에 요소를 추가 단, 동일한 요소가 이미 추가되어 있다면 추가하지 않음 !
		set.add("Banana");
		System.out.println(set);
		set.add("Apple");
		System.out.println(set);
		set.add("Banana1");
		System.out.println(set);
		// set.add("Banana");   ㅡ> 중복된 요소를 기입하면 출력 안돼 !
		// System.out.println(set);
		
		// remove() : Set에서 특정 요소를 제거
		// 제거하고자 하는 요소가 없더라도 예외가 발생하지 않음 !
		// System.out.println(set.remove("Apple"));  ㅡ> boolean remove(Object o); 삭제가 됐다면 true 아니면 false를 반환
		 set.remove("Apple");
		System.out.println(set);
		
		// contains() : Set에서 특정 요소가 존재하는지 확인
		// contains()는 집합안에 요소가 있는지 없는지 여부를 확인을 해서 T / F (boolean) 타입으로 출력됨
		System.out.println(set.contains("Apple"));
		System.out.println("====================================================================");
		
		// Map : 키와 값이 한 쌍으로 이루어진 요소들의 집합, 키는 중복 불가능, 값은 중복 가능
		Map<String, String> map;  // Key : String / Value : String  
		
		// HashMap : 해싱 기법으로 키의 검색 속도가 빠름
		// map = new HashMap<>();
		
		// TreeMap : 키를 정렬하여 저장
		 map = new TreeMap<>();
		
		// put() : Map에 키와 값을 추가
		// 만약 동일한 키가 존재한다면 해당 키의 값을 변경
		map.put("Apple", "사과");
		System.out.println(map);
		map.put("Banana","바나나");
		System.out.println(map);
		map.put("Apple", "링고");
		System.out.println(map);
		map.put("Banana1","바나나");
		System.out.println(map);
		
		// get() : Map에서 특정 키를 가지는 요소를 반환
		// 존재하지 않는 키로 검색할 경우 null을 반환 !
		System.out.println(map.get("Apple"));
		
		// remove() : Map에서 특정 키를 가지는 요소를 제거
		// remove 작업에 성공하면 해당 키의 값을 반환
		// System.out.println(map.remove("Apple"));
		map.remove("Apple");
		System.out.println(map);

// ===============================================================================================================		

		class Human {
			String name;
			String address;
			int age;
		}
		
		Human human1 = new Human();
		human1.name = "홍길동";
		human1.address = "부산광역시 진구";
		human1.age = 10;
		// name = "홍길동"
		// address = "부산광역시 진구"
		// age = "10";
		
		// Map<String, String> human2  = new HashMap<>();
		Map<String, Object> human2 = new HashMap<>();
		human2.put("name", "홍길동");
		human2.put("address", "부산광역시 진구");
		human2.put("age", "열살");
		// 1 문제점 : 사용 혹은 추가 할 때 오타(실수)에 대한 가능성
		human2.get("nmae");

		// 2 문제점 : 타입의 안정성의 문제  ㅡ> 위에서 저렇게 쓰이는 경우 정수로 받고 싶어도 모든 타입이 들어가기때문에 get 메서드를 사용해서 해당하는 키 값을 기입해도 컴파일 에러가 발생하지 않지만 출력하면 예외가 발생해서 코드가 터져버림
		Integer age = (Integer) human2.get("age");
	}
}