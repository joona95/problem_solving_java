package programmers.day21;

public class 정수_부분 {
    public static int solution(double flo) {
        return (int) flo;
    }

    public static void main(String[] args) {
        System.out.println(solution(1.42));
        System.out.println(solution(69.32));
        System.out.println(solution(69.92));
    }
}
