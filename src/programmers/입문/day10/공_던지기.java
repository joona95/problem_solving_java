package programmers.입문.day10;

public class 공_던지기 {
    public static int solution(int[] numbers, int k) {
        int idx = 0;
        int cnt = 1;
        while (cnt < k) {
            idx += 2;
            cnt++;
        }
        return numbers[idx % numbers.length];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
    }
}
