package programmers.day14;

public class 홀수_vs_짝수 {
    public static int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 0) {
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }
        return Math.max(evenSum, oddSum);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
    }
}
