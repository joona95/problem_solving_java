package programmers.입문.day25;

public class 문자열_밀기 {
    public static int solution(String A, String B) {
        int answer = -1;
        int length = A.length();
        for (int i = 0; i < length; i++) {
            if (A.equals(B))
                return i;
            StringBuilder sb = new StringBuilder();
            sb.append(A.charAt(length - 1));
            sb.append(A, 0, length - 1);
            A = sb.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
        System.out.println(solution("apple", "elppa"));
        System.out.println(solution("atat", "tata"));
        System.out.println(solution("abc", "bca"));
    }
}
