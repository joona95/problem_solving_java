package programmers.기초.day8;

public class 글자_이어_붙여_문자열_만들기 {
    static public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for(int i : index_list) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe",
                new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(solution("zpiaz",
                new int[]{1, 2, 0, 0, 3}));
    }
}
