package programmers.기초.day8;

import java.util.Scanner;

public class 주사위_게임_3 {
    static public int solution(int a, int b, int c, int d) {
        if (a == b && b == c && c == d)
            return 1111 * a;
        if (a == b && b == c)
            return (int) Math.pow(10 * a + d, 2);
        if (a == b && b == d)
            return (int) Math.pow(10 * a + c, 2);
        if (a == c && c == d)
            return (int) Math.pow(10 * a + b, 2);
        if (b == c && c == d)
            return (int) Math.pow(10 * b + a, 2);
        if (a == b && c == d)
            return (a + c) * Math.abs(a - c);
        if (a == c && b == d)
            return (a + b) * Math.abs(a - b);
        if (a == d && b == c)
            return (a + b) * Math.abs(a - b);
        if (a == b)
            return c * d;
        if (a == c)
            return b * d;
        if (a == d)
            return b * c;
        if (b == c)
            return a * d;
        if (b == d)
            return a * c;
        if (c == d)
            return a * b;
        return Math.min(Math.min(Math.min(a, b), c), d);
    }

    //정렬로 풀기
    //Map으로 넣어서 같은 값 몇 개있는지 바로 확인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(solution(a, b, c, d));
    }
}
