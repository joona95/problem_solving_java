package programmers.기초.day17;

import java.util.stream.IntStream;

public class 문자열이_몇_번_등장하는지_세기 {
    public static int solution(String myString, String pat) {
        return IntStream.range(0, myString.length()).filter((i) -> myString.substring(i).startsWith(pat)).map(i -> 1).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("aaaa", "aa"));
    }
}
