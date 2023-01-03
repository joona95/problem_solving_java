package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_4_단어_뒤집기 {

    /*
    static String solution(String word) {
        String answer = "";
        int len = word.length() - 1;
        for (int i = len; i >= 0; i--) {
            answer += word.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            String word = in.next();
            String result = solution(word);
            System.out.println(result);
        }
    }
     */

    static ArrayList<String> solution(int num, String[] words) {
        ArrayList<String> answer = new ArrayList<>();
        /*
        for (String word : words) {
            String tmp = new StringBuilder(word).reverse().toString();
            answer.add(tmp);
        }
        */
        for (String word : words) {
            char[] s = word.toCharArray();
            int lt = 0, rt = word.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] words = new String[num];
        for (int i = 0; i < num; i++) {
            words[i] = in.next();
        }
        for (String word : solution(num, words)) {
            System.out.println(word);
        }
    }
}
