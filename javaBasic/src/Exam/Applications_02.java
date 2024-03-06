package Exam;
import java.util.Arrays;

// array = {0,1,2,3,4}
// query = {{0, 1}, {1, 2}, {2, 3}};

// 0번째 쿼리 : 0,1번째 인덱스 번호에 해당하는 값 1씩 더하기
// query: {0, 1} , array = {0,1,2,3,4} : result {1,2,2,3,4} 반환
// -> 1번째 쿼리 : 1,2번째 인덱스 번호에 해당하는 값 1씩 더하기
// query: {1,2} , array = {1,2,2,3,4} : result {1,3,3,3,4} 반환
//-> 2번째 쿼리 : 2,3번째 인덱스 번호에 해당하는 값 1씩 더하기
//query: {2,3} , array = {1,3,3,3,4} : result {1,3,4,4,4} 반환


public class Applications_02 {
	
    // 배열과 쿼리를 받아서 배열을 업데이트하는 메서드
    public int[] solution(int[] array, int[][] queries) {
        // 모든 쿼리에 대해 반복
        for (int q = 0; q < queries.length; q++) {
            int start = queries[q][0];; // 쿼리의 시작 인덱스
            int end = queries[q][1];   // 쿼리의 끝 인덱스

            // 시작부터 끝까지의 모든 인덱스에 대해 배열 값을 1씩 증가
            for (int i = start; i <= end; i++) {
                array[i]++;
            }
        }

        // 업데이트된 배열 반환
        return array;
    }

    public static void main(String[] args) {
    	Applications_02 solution = new Applications_02();

        // 주어진 예시 배열
        int[] array = new int[]{0, 1, 2, 3, 4};

        // 주어진 예시 쿼리
        int[][] queries = new int[][]{{0, 1}, {1, 2}, {2, 3}};

        // solution 메서드를 호출하여 결과 값을 도출하는 동작 수행
        int[] result = solution.solution(array, queries);

        // 결과 출력
        System.out.print("Array : " + Arrays.toString(array));
        System.out.println(" Queries[index] : " + Arrays.deepToString(queries));
        System.out.println("             ㅡ>  result :" + Arrays.toString(result));
    }
}