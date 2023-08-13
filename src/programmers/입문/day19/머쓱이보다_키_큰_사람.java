package programmers.입문.day19;

public class 머쓱이보다_키_큰_사람 {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int h : array) {
            if (h > height)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(solution(new int[]{180, 120, 140}, 190));
    }
}
