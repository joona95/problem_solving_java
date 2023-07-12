package programmers.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 배열_만들기_1 {
    public static int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        for (int i=1; i<=n/k; i++) {
            answer.add(i * k);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int num : solution(n, k))
            System.out.println(num);
    }
}
