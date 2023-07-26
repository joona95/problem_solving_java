package programmers.기초.day9;

import java.util.Scanner;

public class 접미사인지_확인하기 {
    public static int solution(String my_string, String is_suffix) {
        /*
        Optional<String> answer = IntStream.rangeClosed(0, my_string.length()-1).mapToObj(my_string::substring).filter((s -> s.equals(is_suffix))).findAny();
        return answer.isPresent() ? 1 : 0;
         */
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String is_suffix = sc.next();
        System.out.println(solution(my_string, is_suffix));
    }
}
