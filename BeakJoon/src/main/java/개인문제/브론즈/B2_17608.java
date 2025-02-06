package 개인문제.브론즈;
// 개인문제 17608
// https://www.acmicpc.net/problem/17608

import java.util.Scanner;

public class B2_17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 막대기의 개수
        int n = sc.nextInt();

        // 막대기의 높이를 저장하는 배열
        int[] heights = new int[n];

        // 막대기의 높이를 배열에 저장
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt(); // 사용자로부터 높이 입력 받기
        }

        // 막대기의 개수
        int count = 0;
        // max 값
        int maxHeight = 0;


        // 뒤에서부터 높은 막대기를 검사
        for (int i = n - 1; i >= 0; i--) {
            // 현재 막대기의 높이가 `maxHeight`보다 크면 보이는 상태
            if (heights[i] > maxHeight) {
                count++; // 보이는 막대기의 개수 증가
                maxHeight = heights[i]; // 가장 높은 막대기의 높이 업데이트
            }
        }

        // 보이는 막대기의 개수
        System.out.println(count);

        sc.close();
    }
}
