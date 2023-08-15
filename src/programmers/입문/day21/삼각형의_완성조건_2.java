package programmers.입문.day21;

public class 삼각형의_완성조건_2 {
    public static int solution(int[] sides) {
        int answer = Math.min(sides[0], sides[1]);
        answer += sides[0] + sides[1] - 1 - Math.max(sides[0], sides[1]);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2}));
        System.out.println(solution(new int[]{3,6}));
        System.out.println(solution(new int[]{11,7}));
    }
}
