package programmers.완전탐색;

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {
    static int len;
    static boolean[] visited;
    static String[] str;
    static Set<Integer> primes;

    static public boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static public void dfs(int x, String s) {

        if (!s.isEmpty() && isPrime(Integer.parseInt(s))) {
            primes.add(Integer.parseInt(s));
            System.out.println(primes);
        }

        if (x >= len)
            return;

        for (int i = 0; i < len; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            dfs(x + 1, s + str[i]);
            visited[i] = false;
        }
    }

    public static int solution(String numbers) {
        len = numbers.length();
        visited = new boolean[len];
        str = numbers.split("");
        primes = new HashSet<>();

        dfs(0, "");

        return primes.size();
    }

    public static void main(String[] args) {
        System.out.println(solution("17"));
        System.out.println(solution("011"));
    }
}
