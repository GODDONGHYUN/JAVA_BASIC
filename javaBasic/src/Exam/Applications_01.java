package Exam;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

// 결과 값은 첫 번째로 나오는 음수의 인덱스를 return -> 배열 = 인덱스 이렇게 나오는거죠?
// 음수가 없으면 마이너스 1을 리턴  -> 조건문
// 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성

// 사용자가 배열의 길이를 입력하면 arrayList를 사용해서 배열을 생성하고,
// 그 생성한 배열을 토대로 조건에 맞는 출력 결과를 얻어야함
// 길이가 6인 배열을 생성 했을때 {13, 4, 15, 46, -3, -2 15} 예를 들어 이렇게 생성했다치면 그 생성한 배열을 인덱스 번호 값을
// 빙글 빙글 돌면서 처리를 해야함

// 제한사항

// 5 ≤ numList의 길이 ≤ 100
// -10 ≤ numList의 원소 ≤ 100

// 입출력 예

 

// [12, 4, 15, 46, 38, -2, 15] → 5
// [13, 22, 53, 24, 15, 6] → -1

// 무작위 값을 가진 ArrayList 생성
class RandomArrayList{
	
 public static ArrayList<Integer> Solution(int length) {
     ArrayList<Integer> numList = new ArrayList<>(); // numList라는 배열 생성
     Random random = new Random();
     
     // -10에서 100 사이의 무작위 값 할당
     for (int i = 0; i < length; i++) {
         int randomValue = random.nextInt(111) - 10;
         numList.add(randomValue);
     }
     return numList;
 }
}


//첫 번째 음수의 인덱스 찾기
class FindFirstIndex {
 public static int Solution(ArrayList<Integer> numList) {
     for (int i = 0; i < numList.size(); i++) {
         if (numList.get(i) < 0) {
             return i;
         }
     }
     // 음수가 없으면 -1 리턴
     return -1;
 }
}

public class Applications_01 {
	
	public static void main(String[] args) {
		// 배열의 길이 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 길이를 입력하세요 : ");
        int length = scanner.nextInt();
       

        // 입력된 길이가 조건에 맞지 않으면 다시 입력 요청
        while (length < 5 || length > 100) {
            System.out.println("잘못된 입력입니다. 5 이상, 100 이하의 값을 입력하세요.");
            length = scanner.nextInt();
        }

        // ArrayList 생성 및 무작위 값 할당
        ArrayList<Integer> numList = RandomArrayList.Solution(length);

        // 결과 출력
        System.out.print(numList + " : ");

        // 첫 번째 음수의 인덱스 찾기
        int firstIndex = FindFirstIndex.Solution(numList);
       
        // 결과 출력
        if (firstIndex != -1) {
            System.out.print( firstIndex );
        } else {
            System.out.print(-1);
        }

		
	}
}
