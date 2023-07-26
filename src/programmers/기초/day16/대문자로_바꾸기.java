package programmers.기초.day16;

public class 대문자로_바꾸기 {
    public static String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("AAA"));
    }
}
