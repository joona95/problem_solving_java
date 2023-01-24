package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Problem_3_크레인_인형뽑기_카카오 {
    static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(board[j][moves[i]-1] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.add(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for(int i=0;i<m;i++) {
            moves[i] = in.nextInt();
        }
        System.out.println(solution(n, board, m, moves));
    }
}