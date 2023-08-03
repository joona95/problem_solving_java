package programmers.입문.day9;

public class 가위_바위_보 {
    public static String solution(String rsp) {
        String[] split = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            switch (s) {
                case "2":
                    sb.append("0");
                    break;
                case "0":
                    sb.append("5");
                    break;
                case "5":
                    sb.append("2");
                    break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
}
