package programmers.입문.day7;

public class 각도기 {
    public static int solution(int angle) {
        if (angle < 90)
            return 1;
        if (angle == 90)
            return 2;
        if (angle < 180)
            return 3;
        return 4;
    }

    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }
}
