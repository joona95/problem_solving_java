package programmers.입문.day9;

public class 개미_군단 {
    public static int solution(int hp) {
        int answer = 0;
        answer += hp / 5;
        hp = hp % 5;
        answer += hp / 3;
        hp = hp % 3;
        answer += hp;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }
}
