package programmers.입문.day11;

public class 주사위의_개수 {
    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1}, 1));
        System.out.println(solution(new int[]{10, 8, 6}, 3));
    }
}
