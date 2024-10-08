import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09_HashMap {
	public static void main(String[] args) {
		
		Map<String,Integer> hm =new HashMap<String,Integer>(); //interface //key와 value
		System.out.println(hm.size());
		
		hm.put("윤아", 10); //두 데이터를 한 묶음으로 넣어야 함
		hm.put(new String("서현"), new Integer(20));
		hm.put("윤아", 30); //윤아 덮어쓰기
		hm.put("수영", 40);
		hm.put("효연", 10);
		System.out.println(hm.size());
		System.out.println("hm:"+hm); //toString 오버라이딩 //{key=value, key=value, key=value, key=value}//순서 없음

		Integer age = hm.get("효연"); //key값만 넣어야 함//반복문 돌릴 필요 없음 //key갑 없으면 null
		System.out.println("age:"+age); //key의 value 출력 가능
		if(age == null) {
			System.out.println("값 없음");
		}else {
			System.out.println("age:"+age);
		}
		
		boolean result = hm.containsKey("수영");
		System.out.println("result:"+result);
		
		boolean result2 = hm.containsValue(40);
		System.out.println("result2:"+result2);
		
		Set<String> keyset = hm.keySet(); //key만 나오게 함 //위치번호 없고 중복 데이터 허용하지 않음//{} 아니고 []로 출력됨
		System.out.println("keyset:"+keyset);
		
		for(String key:keyset) {
			System.out.println(key+":"+hm.get(key));
		}
		
	}
}


/*
 Map ; key와 value의 한 쌍으로 구성됨
 위치번호(순서) 없음
 key : 중복 허용하지x
 value : 중복 허용
*/
