package programmers.기초.day10;

import java.util.Scanner;

public class 접두사인지_확인하기 {
    public static int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String is_prefix = sc.next();
        System.out.println(solution(my_string, is_prefix));
    }
}
