package programmers.기초.day24;

public class l로_만들기 {
    public static String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()) {
            if (c < 'l') {
                sb.append('l');
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }
}
