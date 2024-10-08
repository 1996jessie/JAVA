import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex10_HashMap {
	public static void main(String[] args) {
		//검색은 주로 map 이용
		
		Map<String,String> dic = new HashMap<String, String>();
		
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
		System.out.println("dic:"+dic);
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("찾는 단어는?(q입력시 종료)");
			String word = sc.next();
			if(word.equals("q")) { //q도 null 나오므로 먼저 넣어야 함
				break;
			}
			if(dic.get(word)==null) {
				System.out.println("잘못 입력헀습니다.");
			}
			else {
				System.out.println("뜻:"+dic.get(word));
			}
		}
		while(true);
		System.out.println("프로그램을 종료합니다.");
		
	}
}


