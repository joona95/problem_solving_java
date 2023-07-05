package programmers.day5;

import java.util.Scanner;

public class 주사위_게임_2 {
    static public int solution(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        }
        if (a == b && b == c) {
            return (a + b + c)
                    * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                    * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        return (a + b + c)
                * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solution(a, b, c));
    }
}
