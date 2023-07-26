package programmers.기초.day9;

import java.util.Arrays;
import java.util.Scanner;

public class 접미사_배열 {
    public static String[] solution(String my_string) {
        int length = my_string.length();
        String[] answer = new String[length];
        for(int i=0;i<length;i++){
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        for(String str : solution(my_string))
            System.out.println(str);
    }
}
