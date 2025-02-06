package 공통문제;

import java.util.Scanner;

public class w1_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        for (int i = 0; i < b; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            total += price * count;
        }

        if (total == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}