package programmers.입문.day18;

public class 제곱수_판별하기 {
    public static int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }
}
