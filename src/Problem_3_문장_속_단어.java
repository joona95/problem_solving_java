import java.util.Scanner;

public class Problem_3_문장_속_단어 {

    static String solution(String str) {
        String answer = "";
        /*
        String[] words = str.split(' ');
        for (String word : words) {
            if (answer.length() < word.length()) {
                answer = word;
            }
        }
        */
        int pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            if (tmp.length() > answer.length()) {
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > answer.length())
            answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = solution(str);
        System.out.println(result);
    }
}
