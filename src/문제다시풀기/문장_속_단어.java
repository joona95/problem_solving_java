package 문제다시풀기;

import java.util.Scanner;

public class 문장_속_단어 {
    static String solution(String str) {
        String answer = "";
        String[] words = str.split(" ");
        for(String word : words) {
            if(answer.length() < word.length()) {
                answer = word;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
