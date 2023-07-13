package programmers.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 왼쪽_오른쪽 {
    public static String[] solution(String[] str_list) {
        /*
        int idx = IntStream.range(0, str_list.length)
                .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                .findFirst()
                .orElse(-1);
        if (idx == -1) {
            return new String[]{};
        }
        if (str_list[idx].equals("l") && idx - 1 >= 0) {
            return Arrays.copyOfRange(str_list, 0, idx);
        }
        if (str_list[idx].equals("r") && idx + 1 <= str_list.length - 1) {
            return Arrays.copyOfRange(str_list, idx + 1, str_list.length);
        }
        return new String[]{};
         */
        return IntStream.range(0, str_list.length)
                .boxed()
                .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                .findFirst()
                .map(i -> {
                    if (str_list[i].equals("l")) {
                        return Arrays.copyOfRange(str_list, 0, i);
                    }
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                })
                .orElseGet(() -> new String[]{});
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(solution(new String[]{"l"})));
        System.out.println(Arrays.toString(solution(new String[]{"u"})));
    }
}
