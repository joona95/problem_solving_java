package programmers.day10;

import java.util.Scanner;

public class 문자열_뒤집기 {
    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        sb.insert(0, my_string.substring(0, s));
        sb.append(my_string.substring(e + 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(solution(my_string, s, e));
    }
}
