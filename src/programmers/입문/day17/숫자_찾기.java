package programmers.입문.day17;

public class 숫자_찾기 {
    public static int solution(int num, int k) {
        int idx = String.valueOf(num).indexOf(String.valueOf(k));
        if (idx != -1)
            idx++;
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, 7));
    }
}
