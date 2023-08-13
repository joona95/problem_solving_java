package programmers.입문.day19;

public class _7의_개수 {
    public static int solution(int[] array) {
        int answer = 0;
        for (int num : array) {
            String[] strArr = String.valueOf(num).split("");
            for (String str : strArr) {
                if (str.equals("7"))
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }
}
