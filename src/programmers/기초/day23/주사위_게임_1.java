package programmers.기초.day23;

public class 주사위_게임_1 {
    public static int solution(int a, int b) {
        if (a % 2 != 0 && b % 2 != 0)
            return (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        if (a % 2 == 0 && b % 2 == 0)
            return Math.abs(a - b);
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(6, 1));
        System.out.println(solution(2, 4));
    }
}
