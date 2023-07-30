package programmers.입문.day4;

public class 피자_나눠_먹기_3 {
    public static int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : (n / slice) + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 10));
        System.out.println(solution(4, 12));
    }
}
