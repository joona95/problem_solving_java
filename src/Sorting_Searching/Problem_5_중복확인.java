package Sorting_Searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem_5_중복확인 {
    static String solution(int n, int[] arr) {
        String answer = "U";
        /*
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                return "D";
            }

            set.add(arr[i]);
        }
         */
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++) {
            if(arr[i] == arr[i+1])
                return "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
