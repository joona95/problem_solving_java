package programmers.기초.day16;

public class 소문자로_바꾸기 {
    public static String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("aaa"));
    }
}
