package programmers.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class n개_간격의_원소들 {
    public static int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).boxed().filter(i -> i % n == 0).mapToInt(i -> num_list[i]).toArray();
        //return IntStream.iterate(0, i -> i < num_list.length, i -> i + n).map(i -> num_list[i]).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 2)));
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 4)));
    }
}
