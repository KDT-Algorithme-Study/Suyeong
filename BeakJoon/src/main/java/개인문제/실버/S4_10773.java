package 개인문제.실버;

import java.util.*;

public class S4_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); // 입력 받을 숫자의 개수
        Stack<Integer> stack = new Stack<>(); // 최근 입력값을 저장할 스택 선언

        // K개의 숫자 입력받기
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                // 0이 입력되면 최근에 입력된 숫자를 제거 (pop)
                if (!stack.isEmpty()) stack.pop();
            } else {
                // 0이 아니면 스택에 추가 (push)
                stack.push(num);
            }
        }

        // 스택에 남아있는 숫자들의 합 구하기
        int sum = 0;
        for (int n : stack) {
            sum += n;
        }

        // 최종 결과 출력
        System.out.println(sum);
    }
}
