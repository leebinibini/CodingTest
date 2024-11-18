
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        // 응급도의 복사본을 만들어서 정렬합니다.
        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);
        
        // 각 환자의 응급도에 대한 순위를 저장할 배열 생성
        int[] answer = new int[emergency.length];
        
        // 응급도 높은 순서대로 순위를 매깁니다.
        for (int i = 0; i < emergency.length; i++) {
            // 각 응급도에 대해 순위를 찾습니다.
            // sortedEmergency의 길이에서 응급도의 인덱스를 찾으면 순위가 됩니다.
            answer[i] = sortedEmergency.length - Arrays.binarySearch(sortedEmergency, emergency[i]);
        }
        
        return answer;
}}