package programmers.입문.day20;

public class 다항식_더하기 {
    public static String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int xCnt = 0;
        int cnt = 0;
        for (String s : arr) {
            if (!s.equals("+")) {
                if (s.contains("x")) {
                    s = s.replace("x", "");
                    xCnt += s.isEmpty() ? 1 : Integer.parseInt(s);
                } else {
                    cnt += Integer.parseInt(s);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (xCnt > 1)
            sb.append(xCnt);
        if (xCnt > 0) {
            sb.append("x");
            if (cnt > 0)
                sb.append(" + ");
        }
        if (cnt > 0)
            sb.append(cnt);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
        System.out.println(solution("5 + 7"));
    }
}
