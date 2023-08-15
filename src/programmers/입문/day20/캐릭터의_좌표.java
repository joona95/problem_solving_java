package programmers.입문.day20;

import java.util.Arrays;

public class 캐릭터의_좌표 {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0,0};
        for (String key : keyinput) {
            if (key.equals("up") && answer[1] + 1 <= board[1]/2)
                answer[1] += 1;
            if (key.equals("down") && answer[1] - 1 >= -board[1]/2)
                answer[1] -= 1;
            if (key.equals("left") && answer[0] - 1 >= -board[0]/2)
                answer[0] -= 1;
            if (key.equals("right") && answer[0] + 1 <= board[0]/2)
                answer[0] += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
        System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7,9})));
    }
}
