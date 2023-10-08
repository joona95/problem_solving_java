package programmers.완전탐색;

public class 모음_사전 {

    static String[] alphabet = {"A", "E", "I", "O", "U"};
    static int answer;
    static boolean isFound;

    static void dfs(String word, String str) {
        //System.out.println(str + " " + answer);

        if (word.equals(str)) {
            isFound = true;
        }

        if (str.length() >= 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            if (!isFound) {
                answer++;
                dfs(word, str + alphabet[i]);
            }
        }
    }

    public static int solution(String word) {
        answer = 0;
        isFound = false;
        dfs(word, "");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
        System.out.println(solution("AAAE"));
        System.out.println(solution("I"));
        System.out.println(solution("EIO"));
    }
}
