package programmers.기초.day9;

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_5 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        for(String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k)
                arr.add(num);
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        for (int i : solution(new String[] {"0123456789","9876543210","9999999999999"}, 50000, 5, 5))
            System.out.println(i);
    }
}
