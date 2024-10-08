import java.util.HashSet;
import java.util.Set;

public class Ex07_Set {
	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<String>(); //타입 확정
		//interface//set을 상속받은 자식클래스는 객체 만들 수 있음 Set s = (Set) new HashSet //업캐스팅
		
		System.out.println(s.size());
		s.add("orange");
		s.add("apple");
		s.add("orange"); //대소문자 완전히 일치해야만 같은 값
		s.add("banana");
		System.out.println(s.size()); //중복 허용x
		System.out.println("s:"+s); //[ , , , ] 요소의 toString 호출되도록 오버라이딩해둠
		boolean result = s.contains("apple");
		System.out.println("result:"+result);//대소문자 구분
		s.remove("apple");
		System.out.println("s:"+s);
		s.clear(); //모든 요소 지움(size = 0)
		System.out.println("s:"+s);
		boolean result2 = s.isEmpty();//요소가 아무것도 없는지?
		System.out.println("result2:"+result2);
	}
}


/*
 list : 들어간 순서 있는 데이터 집합. 중복 허용, 위치번호 있음
 ArrayList
 set : 순서 없음. 중복 허용 않음, 위치번호 없음 
 HashSet
 map : 키는 중복 허용 않고 값은 중복 허용
 순서는 유지되지 않음
 */
