package programmers.입문.day7;

public class 특정_문자_제거하기 {
    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }
}
