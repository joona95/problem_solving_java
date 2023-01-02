import java.util.Scanner;

public class Problem_12_암호 {
    static String solution(int num, String str) {
        String answer = "";
        /*
        for (int i = 0; i < num; i++) {
            char c = 0;
            for (int j = 0; j < 7; j++) {
                if (str.charAt(i * 7 + j) == '#') {
                    c += Math.pow(2, 6 - j);
                }
            }
            answer += String.valueOf(c);
        }
        */
        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(tmp, 2);
            answer += (char)n;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();
        String result = solution(num, str);
        System.out.println(result);
    }
}
