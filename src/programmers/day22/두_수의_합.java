package programmers.day22;

public class 두_수의_합 {
    public static String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < Math.min(a.length(), b.length()); i++) {
            String numStr = String.valueOf((a.charAt(a.length() - 1 - i) - '0')
                   + (b.charAt(b.length() - 1 -i) - '0'));
            if (sb.length() > i) {
                int num = Integer.parseInt(numStr) + (sb.charAt(0) - '0');
                numStr = String.valueOf(num);
                sb.deleteCharAt(0);
            }
            sb.insert(0, numStr);
        }
        String subStr = a.length() > b.length() ? a.substring(0, a.length() - b.length()) : b.substring(0, b.length() - a.length());
        for(int i=0;i<subStr.length();i++) {
            String numStr = String.valueOf(subStr.charAt(subStr.length() - 1 - i) - '0');
            if (sb.length() > Math.min(a.length(), b.length()) + i) {
                int num = Integer.parseInt(numStr) + (sb.charAt(0) - '0');
                numStr = String.valueOf(num);
                sb.deleteCharAt(0);
            }
            sb.insert(0, numStr);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("582", "734"));
        System.out.println(solution("18446744073709551615", "287346502836570928366"));
        System.out.println(solution("0", "0"));
    }
}

/*

 */