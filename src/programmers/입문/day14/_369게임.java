package programmers.입문.day14;

public class _369게임 {
    public static int solution(int order) {
        int answer = 0;
        for (char c : String.valueOf(order).toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }
}
