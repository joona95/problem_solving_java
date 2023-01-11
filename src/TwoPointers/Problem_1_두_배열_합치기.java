package TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1_두_배열_합치기 {
    static ArrayList<Integer> solution(int n, int m, int[] arrA, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pa=0, pb=0;
        while(pa < n && pb < m) {
            if(arrA[pa] <= arrB[pb]) {
                answer.add(arrA[pa++]);
            }
            else {
                answer.add(arrB[pb++]);
            }
        }
        while(pa < n) {
            answer.add(arrA[pa++]);
        }
        while(pb < m) {
            answer.add(arrB[pb++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrA = new int[n];
        for(int i=0;i<n;i++) {
            arrA[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arrB = new int[m];
        for(int i=0;i<m;i++) {
            arrB[i] = in.nextInt();
        }

        for(int x : solution(n, m, arrA, arrB)) {
            System.out.print(x + " ");
        }
    }
}
