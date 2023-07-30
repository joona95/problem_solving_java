package programmers.입문.day4;

public class 피자_나눠_먹기_2 {

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return getGCD(num2, num1 % num2);
    }

    public static int solution(int n) {
        int gcd = getGCD(n, 6);
        int max = gcd * (n / gcd) * (6 / gcd);
        return max / 6;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}
