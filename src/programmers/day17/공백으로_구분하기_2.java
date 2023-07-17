package programmers.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 공백으로_구분하기_2 {
    public static String[] solution(String my_string) {
        List<String> strList = new ArrayList<>();
        String str = "";
        for (char c : my_string.toCharArray()) {
            if (c != ' ') {
                str += c;
                continue;
            }
            if (!str.equals("")) {
                strList.add(str);
                str = "";
            }
        }
        if (!str.equals("")) {
            strList.add(str);
        }
        return strList.toArray(String[]::new);
        /*
        //2번째 방법
        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[n] = st.nextToken();
        return result;
         */
        //3번째 방법
        //return Arrays.stream(my_string.trim().split(" ")).filter(x -> !x.equals("")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(" i    love  you")));
        System.out.println(Arrays.toString(solution("    programmers  ")));
    }
}
