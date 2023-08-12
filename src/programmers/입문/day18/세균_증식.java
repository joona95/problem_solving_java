package programmers.입문.day18;

public class 세균_증식 {
    public static int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }
}
