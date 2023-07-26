package programmers.기초.day4;

import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class 조건_문자열 {
    static public int solution(String ineq, String eq, int n, int m) {
        /*
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            }
            else {
                return n < m ? 1 : 0;
            }
        }

        if (eq.equals("=")) {
            return n >= m ? 1 : 0;
        }

        return n > m ? 1 : 0;

         */


        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;

    }

    /*
    속도는 그냥 if문 사용이 0.01 ~ 0.03ms, bifunction 사용이 2 ~ 3 ms
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ineq = sc.next();
        String eq = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(solution(ineq, eq, n, m));
    }
}
