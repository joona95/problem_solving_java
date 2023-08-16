package programmers.입문.day22;

public class 유한소수_판별하기 {

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return getGCD(num2, num1 % num2);
    }

    public static int solution(int a, int b) {
        int n = getGCD(a, b);
        b /= n;
        if (b % 2 == 0) {
            while (b % 2 == 0) {
                b /= 2;
            }
        }
        if (b % 5 == 0) {
            while (b % 5 == 0) {
                b /= 5;
            }
        }
        return b == 1 ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(12, 21));
    }
}
