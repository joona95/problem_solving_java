package programmers.기초.day18;

public class 간단한_식_계산하기 {
    public static int solution(String binomial) {
        /*
        return IntStream.range(0, binomial.length())
                .filter(i -> binomial.charAt(i) == '+' || binomial.charAt(i) == '*' || binomial.charAt(i) == '-')
                .map(i -> {
                    int a = Integer.parseInt(binomial.substring(0, i - 1));
                    int b = Integer.parseInt(binomial.substring(i + 2));
                    if (binomial.charAt(i) == '+')
                        return a + b;
                    if (binomial.charAt(i) == '-')
                        return a - b;
                    return a * b;
                })
                .sum();
         */
        String[] calculation = binomial.split(" ");
        int a = Integer.parseInt(calculation[0]);
        int b = Integer.parseInt(calculation[2]);
        if (calculation[1].equals("+"))
            return a + b;
        if (calculation[1].equals("-"))
            return a - b;
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

}
