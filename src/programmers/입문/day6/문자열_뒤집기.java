package programmers.입문.day6;

public class 문자열_뒤집기 {
    public static String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }
}
