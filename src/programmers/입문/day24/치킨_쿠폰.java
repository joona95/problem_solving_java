package programmers.입문.day24;

public class 치킨_쿠폰 {
    public static int solution(int chicken) {
        int answer = 0;
        while (chicken / 10 > 0) {
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }
}
