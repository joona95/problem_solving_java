package programmers.기초.day12;

import java.util.ArrayList;
import java.util.List;

public class 리스트_자르기 {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int skip = n == 4 ? slicer[2] : 1;
        for (int i = start; i <= end; i += skip) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        for (int num : solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}))
            System.out.print(num + " ");
        System.out.println();
        for (int num : solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}))
            System.out.print(num + " ");
    }
}
