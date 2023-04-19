package 문제다시풀기;

import java.util.Scanner;

public class 암호 {
    static String solution(int cnt, String str) {
        String answer = "";
        /*
        for (int i=0;i<cnt;i++) {
            int sum = 0;
            for(int j=i*7;j<(i+1)*7;j++) {
                if(str.charAt(j) == '#') {
                    sum += Math.pow(2, 6 - j + (i*7));
                }
            }
            answer += (char) sum;
        }
         */
        for(int i=0;i<cnt;i++) {
            String tmp = str.substring(i*7, (i+1)*7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(tmp, 2);
            answer += (char) n;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(cnt, str));
    }
}
