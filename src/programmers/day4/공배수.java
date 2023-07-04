package programmers.day4;

import java.util.Scanner;

public class 공배수 {
    static public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(solution(number, n, m));
    }
}
