package programmers.기초.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 콜라츠_수열_만들기 {
    static public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n = 3 * n + 1;
            }
            arr.add(n);
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i : solution(n))
            System.out.println(i);
    }
}
