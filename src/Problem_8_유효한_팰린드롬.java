import java.util.Scanner;

public class Problem_8_유효한_팰린드롬 {
    static String solution(String str) {
        /*
        char[] s = str.toUpperCase().toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(s[rt])) {
                rt--;
                continue;
            }
            if (s[lt] != s[rt])
                return "NO";
            lt++;
            rt--;
        }
         */
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equals(tmp))
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = solution(str);
        System.out.println(result);
    }
}
