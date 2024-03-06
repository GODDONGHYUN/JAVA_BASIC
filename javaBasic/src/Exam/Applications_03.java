package Exam;

// 정수 number가 주어질 때, 주어진 number의 자리 수의 합을 return한다. 단, 입력 값이 0이하의 정수이면 0을 반환한다.

public class Applications_03 {
    // 정수 number의 자리 수의 합을 반환하는 메서드
    public int solution(int number) {
        // 입력 값이 0 이하인 경우 0을 반환
        if (number <= 0) {
            return 0;
        }

        // 자리 수의 합을 저장할 변수
        int sum = 0;

        // 입력된 정수의 각 자리 수를 더함
        while (number > 0) {
            sum += number % 10; // 현재 자리의 숫자를 더함  
            number /= 10; // 다음 자리로 이동
        }

        return sum;
    }

    public static void main(String[] args) {
    	Applications_03 solution = new Applications_03();

        // 예시
        int test1 = 123456789;
        int test2 = -123456789;

        // 결과 출력
        System.out.println(test1 + " → " + solution.solution(test1));
        System.out.println(test2 + " → " + solution.solution(test2));
    }
}
