package programmers.day22;

public class _0_떼기 {
    public static String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }

    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }
}
