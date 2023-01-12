package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_2_공통원소_구하기 {
    static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int pa = 0, pb = 0;
        while (pa < n && pb < m) {
            if (a[pa] < b[pb]) {
                pa++;
                continue;
            }
            if (a[pa] > b[pb]) {
                pb++;
                continue;
            }
            answer.add(a[pa++]);
            pb++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        for (int x : solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
