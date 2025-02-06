package 개인문제.브론즈;
// 개인문제 14681
// https://www.acmicpc.net/problem/14681

import java.util.Scanner;

public class B5_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a>0 && b > 0) {        // + +
            System.out.println("1");
        } else if(a>0 && b < 0) {    // + -
            System.out.println("4");
        } else if(a<0 && b < 0) {    // - -
            System.out.println("3");
        } else if(a<0 && b > 0) {    // - +
            System.out.println("2");
        }
    }
}