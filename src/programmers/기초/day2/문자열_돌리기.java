package programmers.기초.day2;

import java.util.Scanner;

public class 문자열_돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}
