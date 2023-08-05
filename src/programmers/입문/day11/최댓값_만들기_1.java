package programmers.입문.day11;

public class 최댓값_만들기_1 {
    public static int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (answer < numbers[i] * numbers[j])
                    answer = numbers[i] * numbers[j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }
}
