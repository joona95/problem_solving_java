package programmers.입문.day23;

public class 로그인_성공 {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (String[] db_id_pw : db) {
            if (id_pw[0].equals(db_id_pw[0])) {
                if (id_pw[1].equals(db_id_pw[1])) {
                    return "login";
                }
                else {
                    return "wrong pw";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }
}
