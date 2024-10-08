public class Ex04_알파벳갯수세기_과제 {
	public static void main(String[] args) {
		
		String saying = "Slow and steady Wins the Race";
		int len = saying.length();
		//알파벳의 개수 세기
		//banana : 6글자 >> 6번 반복
		//글자 가져와서 각 알파벳 몇개 있는지 배열에 넣기
		
		//소문자로 바꾸기
		saying = saying.toLowerCase();
		System.out.println("saying:"+saying);
		
		//출력 : a:0 b:1 c:2 d:3 ~ z:1 이런 식으로 
		int[] num = new int[26];
			int i,j;
			for(i=0;i<num.length; i++) {
				for(j=0;j<saying.length();j++) {
					if(saying.charAt(j) == i+97) {
						num[i] = num[i]+1;
					}
				}
			}
			for(i=0;i<num.length;i++) {
				System.out.println((char)(i+97)+":"+num[i]);
			}
			
	}
}