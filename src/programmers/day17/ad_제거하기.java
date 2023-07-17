package programmers.day17;

import java.util.Arrays;

public class ad_제거하기 {
    public static String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter((str) -> !str.contains("ad")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"and","notad","abcd"})));
        System.out.println(Arrays.toString(solution(new String[]{"there","are","no","a","ds"})));
    }
}
