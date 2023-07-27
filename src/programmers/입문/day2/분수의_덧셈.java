package programmers.입문.day2;

import java.util.Arrays;

public class 분수의_덧셈 {

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = (denom1 * denom2) / getGCD(denom1, denom2);
        int numer = numer1 * (denom / denom1) + numer2 * (denom / denom2);
        int gcd = getGCD(numer, denom);
        return new int[]{numer / gcd, denom / gcd};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }
}
