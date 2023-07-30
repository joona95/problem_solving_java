package programmers.입문.day5;

import java.util.Arrays;

public class 아이스_아메리카노 {
    public static int[] solution(int money) {
        /*
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
         */
        return new int[] { money / 5500, money % 5500 };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }
}
