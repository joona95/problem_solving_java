package programmers.day16;

import java.util.Arrays;

public class 배열에서_문자열_대소문자_변환하기 {
    public static String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"AAA", "BBB", "CCC", "DDD"})));
        System.out.println(Arrays.toString(solution(new String[]{"aBc", "AbC"})));
    }
}
