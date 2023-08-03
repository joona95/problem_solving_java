package programmers.입문.day9;

import java.math.BigInteger;

public class 구슬을_나누는_경우의_수 {
    public static int solution(int balls, int share) {
        BigInteger answer = new BigInteger("1");
        for (int i = balls; i > balls - share; i--)
            answer = answer.multiply(new BigInteger(String.valueOf(i)));
        for (int i = share; i > 0; i--)
            answer = answer.divide(new BigInteger(String.valueOf(i)));
        return  answer.intValue();
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
        System.out.println(solution(30, 15));
    }
}
