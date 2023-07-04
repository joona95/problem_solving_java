package programmers.day4;

import java.util.Scanner;

public class flag에_따라_다른_값_반환하기 {
    static public int solution(int a, int b, boolean flag) {
        /*
        if (flag) {
            return a + b;
        }
        return a - b;
         */
        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();

        System.out.println(solution(a, b, flag));
    }
}
