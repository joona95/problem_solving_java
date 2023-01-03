package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1_큰_수_출력하기 {
    static ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i])
                answer.add(nums[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        ArrayList<Integer> result = solution(n, nums);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
