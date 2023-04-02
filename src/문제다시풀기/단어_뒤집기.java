package 문제다시풀기;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {
    /*
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            String str = kb.next();
            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    */

    static ArrayList<String> solution(String[] words) {
        ArrayList<String> answer = new ArrayList<>();
        for(String word: words) {
            String tmp = new StringBuilder(word).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = kb.next();
        }
        for(String word : solution(words)) {
            System.out.println(word);
        }
    }
}
