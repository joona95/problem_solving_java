package Sorting_Searching;

import java.util.Scanner;

public class Problem_4_Least_Recently_Used {
    static int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];
        /*
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (queue.size() < s) {
                queue.add(arr[i]);
            } else {
                if (queue.contains(arr[i])) {
                    queue.remove(arr[i]);
                } else {
                    queue.poll();
                }
                queue.add(arr[i]);
            }
        }
        for (int i = 0; i < s; i++) {
            answer[s - 1 - i] = queue.poll();
        }
         */
        for (int i = 0; i < n; i++) {
            int idx = s - 1;
            for (int j = 0; j < s; j++) {
                if (arr[i] == cache[j]) {
                    idx = j;
                }
            }

            for (int j = idx; j > 0; j--) {
                cache[j] = cache[j - 1];
            }
            cache[0] = arr[i];
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
