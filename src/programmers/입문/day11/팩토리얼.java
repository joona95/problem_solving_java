package programmers.입문.day11;

public class 팩토리얼 {
    public static int solution(int n) {
        int factorial = 1;
        int answer = 1;
        while (factorial * (answer + 1) <= n) {
            factorial *= ++answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }
}
