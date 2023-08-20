package programmers.입문.day25;

public class 종이_자르기 {
    public static int solution(int M, int N) {
        return (M - 1) + M * (N - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 2));
        System.out.println(solution(2, 5));
        System.out.println(solution(1, 1));
        System.out.println(solution(3, 4));
    }
}
