package programmers.입문.day18;

public class 문자열안에_문자열 {
    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(solution("ppprrrogrammers", "pppp"));
        System.out.println(solution("AbcAbcA", "AAA"));
    }
}
