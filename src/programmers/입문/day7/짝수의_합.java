package programmers.입문.day7;

import java.util.stream.IntStream;

public class 짝수의_합 {
    public static int solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
        //return IntStream.iterate(0, i -> i <= n, i -> i + 2).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}
