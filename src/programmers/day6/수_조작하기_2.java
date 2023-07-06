package programmers.day6;

public class 수_조작하기_2 {
    static public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int num = numLog[i] - numLog[i-1];
            switch (num) {
                case 1 : sb.append("w"); break;
                case -1 : sb.append("s"); break;
                case 10 : sb.append("d"); break;
                case -10 : sb.append("a"); break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }
}
