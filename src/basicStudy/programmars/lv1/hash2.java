package basicStudy.programmars.lv1;

import java.util.Arrays;

/***[문제내용]
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"

***/


public class hash2 {

	public static String failParticipant(String[] participant, String[] completion) {
		String resultParticipant ="";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!completion[i].equals(participant[i])) {
				resultParticipant=participant[i];
			}
		}
		
		if("".equals(resultParticipant)) {
			resultParticipant=participant[participant.length-1];
		}
		
		return resultParticipant;
	}
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String result=failParticipant(participant,completion);
		
		System.out.println(result);
	}

}
