import java.util.Scanner;

public class Problem_9_숫자만_추출 {

    static int solution(String str) {
        int answer = 0;
        /*
        String tmp = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                tmp += c;
            }
        }
        answer = Integer.parseInt(tmp);
        */
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57)
                answer = answer * 10 + (c - 48);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int result = solution(str);
        System.out.println(result);
    }
}
