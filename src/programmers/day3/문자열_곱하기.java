package programmers.day3;

import java.util.Scanner;

public class 문자열_곱하기 {
    static public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k ; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int k = sc.nextInt();

        System.out.println(solution(my_string, k));
    }
}
