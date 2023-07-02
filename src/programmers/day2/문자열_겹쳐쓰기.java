package programmers.day2;

import java.util.Scanner;

public class 문자열_겹쳐쓰기 {
    static public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        System.out.println(solution(my_string, overwrite_string, s));
    }
}
