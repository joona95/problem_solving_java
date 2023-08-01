package programmers.입문.day7;

public class 양꼬치 {
    public static int solution(int n, int k) {
        return 12000 * n + 2000 * (k - n / 10);
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }
}
