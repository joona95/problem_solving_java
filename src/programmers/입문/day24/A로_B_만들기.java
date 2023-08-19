package programmers.입문.day24;

import java.util.Arrays;

public class A로_B_만들기 {
    public static int solution(String before, String after) {
        /*
        int length = before.length();
        boolean[] check = new boolean[length];
        for (char c : after.toCharArray()) {
            for (int i = 0; i < length; i++) {
                if (!check[i] && before.charAt(i) == c) {
                    check[i] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (!check[i])
                return 0;
        }
        return 1;
         */
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return new String(arr1).equals(new String(arr2)) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }
}
