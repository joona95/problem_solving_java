package programmers.기초.day8;

import java.util.Scanner;

public class 간단한_논리_연산 {
    static public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x1 = sc.nextBoolean();
        boolean x2 = sc.nextBoolean();
        boolean x3 = sc.nextBoolean();
        boolean x4 = sc.nextBoolean();
        System.out.println(solution(x1, x2, x3, x4));
    }
}
