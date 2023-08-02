package programmers.입문.day8;

public class 외계행성의_나이 {
    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        for(char c : String.valueOf(age).toCharArray()) {
            sb.append((char)(c - '0' + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }
}
