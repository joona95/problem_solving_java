package Sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem_6_장난꾸러기 {
    static List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        for(int i=0;i<n;i++) {
            if(arr[i] != sortArr[i]) {
                answer.add(i+1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        for(int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
