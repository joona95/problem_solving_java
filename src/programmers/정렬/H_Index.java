package programmers.정렬;

import java.util.Arrays;

public class H_Index {
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
    //0 1 4 5 6

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
        System.out.println(solution(new int[]{4, 0, 6, 1, 5}));
        System.out.println(solution(new int[]{0, 0, 0}));
    }
}
