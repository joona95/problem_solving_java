package programmers.입문.day10;

public class 점의_위치_구하기 {
    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0)
            return 1;
        if (dot[0] < 0 && dot[1] > 0)
            return 2;
        if (dot[0] < 0 && dot[1] < 0)
            return 3;
        return 4;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 9}));
    }
}
