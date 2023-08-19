package programmers.입문.day24;

public class k의_개수 {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        for (int idx = i; idx <= j; idx++) {
            for (char c : String.valueOf(idx).toCharArray()) {
                if (String.valueOf(c).equals(String.valueOf(k)))
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }
}
