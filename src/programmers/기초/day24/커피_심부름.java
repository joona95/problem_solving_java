package programmers.기초.day24;

import java.util.Arrays;

public class 커피_심부름 {
    public static int solution(String[] order) {
        return Arrays.stream(order).mapToInt(str -> {
            if (str.contains("americano") || str.contains("anything"))
                return 4500;
            return 5000;
        }).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }
}
