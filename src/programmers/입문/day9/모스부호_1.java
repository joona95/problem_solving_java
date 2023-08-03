package programmers.입문.day9;

public class 모스부호_1 {
    public static String solution(String letter) {
        String[] morse = new String[]{
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};

        StringBuilder sb = new StringBuilder();
        String[] alphabets = letter.split(" ");
        for(String alphabet : alphabets) {
            for(int i=0;i< morse.length;i++) {
                if (alphabet.equals(morse[i])) {
                    sb.append((char) (i + 'a'));
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }
}
