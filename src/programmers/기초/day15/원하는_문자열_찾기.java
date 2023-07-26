package programmers.기초.day15;

public class 원하는_문자열_찾기 {
    public static int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        return myString.contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
        System.out.println(solution("aaAA", "aaaaa"));
    }
}
