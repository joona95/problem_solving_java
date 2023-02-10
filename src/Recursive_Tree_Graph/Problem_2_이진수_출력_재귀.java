package Recursive_Tree_Graph;

import java.util.Scanner;

public class Problem_2_이진수_출력_재귀 {
    static void DFS(int n) {
        if (n == 0)
            return;
        DFS(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DFS(n);
    }
}
