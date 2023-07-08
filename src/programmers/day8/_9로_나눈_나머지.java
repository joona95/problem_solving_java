package programmers.day8;

import java.util.Scanner;

public class _9로_나눈_나머지 {
    static public int solution(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += (c - '0');
        }
        return sum % 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.println(solution(number));
    }
}
