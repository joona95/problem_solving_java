package programmers.day17;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public static String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }
}
