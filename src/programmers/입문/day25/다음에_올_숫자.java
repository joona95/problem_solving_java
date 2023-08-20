package programmers.입문.day25;

public class 다음에_올_숫자 {
    public static int solution(int[] common) {
        if (common[1] - common[0] == common[2] - common[1]) {
            return common[common.length - 1] + common[1] - common[0];
        }
        return common[common.length - 1] * (common[1] / common[0]);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{2, 4, 8}));
    }
}
