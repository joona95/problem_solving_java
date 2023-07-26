package programmers.기초.day16;

public class A_강조하기 {
    public static String solution(String myString) {
        /*
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()) {
            if (c != 'a' && c != 'A') {
                c = Character.toLowerCase(c);
            }
            if (c == 'a') {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
         */
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');
        return myString;
    }

    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }
}
