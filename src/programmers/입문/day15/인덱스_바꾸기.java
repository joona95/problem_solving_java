package programmers.입문.day15;

public class 인덱스_바꾸기 {
    public static String solution(String my_string, int num1, int num2) {
        char[] charArr = my_string.toCharArray();
        char tmp = charArr[num1];
        charArr[num1] = charArr[num2];
        charArr[num2] = tmp;
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("I love you", 3, 6));
    }
}
