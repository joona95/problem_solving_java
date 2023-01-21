package Map_Set;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem_5_K번째_큰_수 {
    static int solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    int sum = arr[i] + arr[j] + arr[l];
                    set.add(sum);
                }
            }
        }
        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k)
                return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
