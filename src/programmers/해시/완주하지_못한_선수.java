package programmers.해시;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public static String solution(String[] participant, String[] completion) {
        /*
        List<String> names = new ArrayList<>(List.of(participant));
        for (String completionName : completion) {
            names.remove(completionName);
        }
        return names.get(0);
         */
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            participantMap.put(name, participantMap.get(name) - 1);
        }
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}
