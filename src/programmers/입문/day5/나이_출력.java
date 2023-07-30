package programmers.입문.day5;

public class 나이_출력 {
    public static int solution(int age) {
        return 2022 - (age - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution(40));
        System.out.println(solution(23));
    }
}
