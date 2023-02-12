package Recursive_Tree_Graph;

import java.util.Scanner;

public class Problem_4_피보나치_재귀 {
    static int[] fibo;
    static int DFS(int n) {
        if(fibo[n] > 0)
            return fibo[n]; //메모이제이션
        if (n == 1)
            return fibo[n] = 1;
        else if (n == 2)
            return fibo[n] = 1;
        else
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibo = new int[n+1];
        DFS(n);
        for(int i=1;i<=n;i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
