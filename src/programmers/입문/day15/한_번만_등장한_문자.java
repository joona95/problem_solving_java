package programmers.입문.day15;

import java.util.Arrays;

public class 한_번만_등장한_문자 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (String str : s.split("")) {
            if (s.indexOf(str) == s.lastIndexOf(str))
                sb.append(str);
        }
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }
}
