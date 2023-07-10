package programmers.day9;

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}
