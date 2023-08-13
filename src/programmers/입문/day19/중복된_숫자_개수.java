package programmers.입문.day19;

public class 중복된_숫자_개수 {
    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int num : array) {
            if (num == n)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution(new int[]{0, 2, 3, 4}, 1));
    }
}
