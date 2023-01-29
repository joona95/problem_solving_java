package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem_7_교육과정_설계 {
    static String solution(String str1, String str2) {
        Queue<Character> queue = new LinkedList<>();
        for (char x : str1.toCharArray()) {
            queue.offer(x);
        }
        for (char x : str2.toCharArray()) {
            if (queue.contains(x)) {
                if (queue.poll() != x)
                    return "NO";
            }
        }
        if (!queue.isEmpty())
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(solution(str1, str2));
    }
}
