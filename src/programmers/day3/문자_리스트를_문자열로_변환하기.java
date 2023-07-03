package programmers.day3;

public class 문자_리스트를_문자열로_변환하기 {
    static public String solution(String[] arr) {
        /*
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
         */

        return String.join("", arr);
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};

        System.out.println(solution(arr));
    }
}
