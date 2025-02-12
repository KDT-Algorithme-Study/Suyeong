

package 개인문제.브론즈;

import java.util.*;
public class B1_23882 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); // 배열 크기 N
            int k = sc.nextInt(); // K번째 swap 확인
            int[] arr = new int[n]; // 배열 선언

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt(); // 배열 입력

            int swapCount = 0; // Swap 횟수 저장

            // 선택 정렬 구현
            for (int i = 0; i < n - 1; i++) {
                int minIdx = i; // 가장 작은 원소의 위치

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j; // 더 작은 값이 있다면 minIdx 업데이트
                    }
                }

                // swap 수행
                if (minIdx != i) {
                    int temp = arr[i];
                    arr[i] = arr[minIdx];
                    arr[minIdx] = temp;

                    swapCount++; // swap 횟수 증가

                    // K번째 swap 이면 출력 후 종료
                    if (swapCount == k) {
                        for (int num : arr) System.out.print(num + " ");
                        return;
                    }
                }
            }

            // K번째 swap 이 존재하지 않는 경우
            System.out.println(-1);
        }
    }

