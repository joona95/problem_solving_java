package programmers.기초.day9;

import java.util.Scanner;

public class 문자열의_뒤의_n글자 {
    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int n = sc.nextInt();
        System.out.println(solution(my_string, n));
    }
}
