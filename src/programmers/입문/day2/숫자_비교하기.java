package programmers.입문.day2;

public class 숫자_비교하기 {
    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));
    }
}
