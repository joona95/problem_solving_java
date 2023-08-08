package programmers.입문.day14;

public class 가까운_수 {
    public static int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            int x = Math.abs(num - n);
            if (x < min || (x == min && answer > num)) {
                answer = num;
                min = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
    }
}
