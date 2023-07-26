package programmers.기초.day18;

public class 문자열_바꿔서_찾기 {
    public static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<myString.length();i++) {
            if (myString.charAt(i) == 'A')
                sb.append('B');
            else
                sb.append('A');
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }


    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
    }
}
