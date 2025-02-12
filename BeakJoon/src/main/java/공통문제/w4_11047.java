//그리디 알고리즘의 특징
//        매 선택이 지역적으로 최적인 해(최적해의 일부)를 만든다.
//        전체적으로도 최적해(Optimal Solution)를 보장하는 경우가 있다.
//        빠르게 풀 수 있으며 시간 복잡도가 보통 O(N) 수준으로 효율적이다.
//        그러나 항상 최적해를 보장하지는 않는다.
package 공통문제;

import java.util.Scanner;

public class w4_11047 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // 동전 종류 개수 = n, 목표 금액 = k
            int n = scan.nextInt(), k = scan.nextInt(), count = 0;
            int[] coin = new int[n]; // 동전 단위를 저장하는 배열

            // 동전 단위 입력 받기
            for (int i = 0; i < n; i++) coin[i] = scan.nextInt();

            // 큰 단위의 동전부터 사용하여 k를 줄여나감
            for (int i = n - 1; i >= 0; i--) {
                count += k / coin[i]; // 해당 동전으로 사용할 수 있는 개수 추가
                k = k % coin[i]; // 남은 금액 업데이트
            }

            // 최소 동전 개 수 출력
            System.out.println(count);
        }
    }

