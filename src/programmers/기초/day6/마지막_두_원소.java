package programmers.기초.day6;

import java.util.Arrays;

public class 마지막_두_원소 {
    static public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int lastIdx = num_list.length - 1;
        int lastNum = num_list[lastIdx] > num_list[lastIdx - 1] ? num_list[lastIdx] - num_list[lastIdx - 1] : num_list[lastIdx] * 2;
        answer[answer.length - 1] = lastNum;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 6};
        for (int num : solution(arr1)) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr2 = new int[]{5, 2, 1, 7, 5};
        for (int num : solution(arr2)) {
            System.out.print(num + " ");
        }
    }
}
