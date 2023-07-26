package programmers.기초.day20;

import java.util.stream.IntStream;

public class 문자열_묶기 {
    public static int solution(String[] strArr) {
        int[] strLength = new int[31];
        for (String str : strArr) {
            strLength[str.length()]++;
        }
        return IntStream.of(strLength).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","bc","d","efg","hi"}));
    }
}
