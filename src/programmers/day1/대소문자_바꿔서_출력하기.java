package programmers.day1;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char c : a.toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
                continue;
            }
            System.out.print(Character.toLowerCase(c));
        }
    }
}