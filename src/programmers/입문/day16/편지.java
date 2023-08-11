package programmers.입문.day16;

public class 편지 {
    public static int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }
}
