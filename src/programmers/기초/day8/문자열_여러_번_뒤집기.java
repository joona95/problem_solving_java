package programmers.기초.day8;

public class 문자열_여러_번_뒤집기 {
    static public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        for (int[] query : queries) {
            for (int i = query[0]; i <= (query[0] + query[1]) / 2; i++) {
                char tmp = answer[i];
                answer[i] = answer[query[0] + query[1] - i];
                answer[query[0] + query[1] - i] = tmp;
            }
        }
        return String.valueOf(answer);
    }

    //substring하여 stringbuilder에서 reverse하는 방식

    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam",
                new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}
