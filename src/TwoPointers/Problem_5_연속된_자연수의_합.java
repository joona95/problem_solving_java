package TwoPointers;

import java.util.Scanner;

public class Problem_5_연속된_자연수의_합 {
    static int solution(int n) {
        int answer = 0;
        /*
        //two pointers
        int sum = 0, lt = 1;
        for (int rt = 1; rt <= n / 2 + 1; rt++) {
            sum += rt;
            if (sum == n)
                answer++;
            while (sum >= n) {
                sum -= lt++;
                if (sum == n)
                    answer++;
            }
        }
         */
        //수학
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
