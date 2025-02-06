package 공통문제;

import java.util.Scanner;

public class w3_5073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) { // while-True 문
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            // 세 변의 값이 모두 0이면 종료
            if (a == 0 && b == 0 && c == 0)
                break;

            // 아래에 값이면 삼각형이 아님
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Invalid");
            }
            // 두 변의 길이가 같을때
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            }
            // 세 변이 길이가 같을때
            else if (a == b && b == c) {
                System.out.println("Equilateral");
            }
            // 세 변이 길이가 모두 다를 때
            else {
                System.out.println("Scalene");
            }
        }

        scan.close();
    }
}
