import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex03_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>(); //java.util //저장소 만든 상태 //요소들의 확정 자료형 써야 함 //요소 타입 확정
		int size = lists.size(); //몇개 들어있는지?
		System.out.println("size:"+size); 
		
		lists.add("태연"); //넣을 때 add //0
		lists.add("윤아"); //1>>2
		lists.add("수영"); //2>>3
		lists.add(1, "효연"); //1번에 효연 넣고 싶음 //끼워넣기 //뒤로 밀림
		size = lists.size(); //몇개 들어있는지 확인하는 메서드
		System.out.println("size:"+size); //들어가는만큼 공간 생김
		String s = lists.get(2);
		System.out.println("s:"+s);
		System.out.println("lists:"+lists); 
		System.out.println("lists:"+lists.toString());//toString 오버라이딩 //요소 리턴
		ArrayList<String> a = new ArrayList<String>();
		a.add("수지");
		a.add("제니");
		lists.addAll(a); //addAll: 컬렉션 안에 컬렉션 넣을 수 있음
		System.out.println("lists:"+lists); 
		
		String[] arr = new String[lists.size()];//방 6개짜리 배열
		lists.toArray(arr);
		System.out.println(arr[3]);
		
		lists.remove("효연"); //위치번호 or 해당 요소 직접 쓰기//1이라고 써도 됨
		System.out.println("lists:"+lists); //윤아가 1번
		
		ArrayList<String> del = new ArrayList<String>();
		del.add("윤아");
		del.add("수지");
		lists.removeAll(del); //통채로 삭제
		System.out.println("lists:"+lists); 
		
		lists.add("수영"); //중복 가능
		System.out.println("lists:"+lists);
		
		int index = lists.indexOf("제니"); //제니의 위치
		int index2 = lists.indexOf("수영"); //첫번째 수영의 위치만 찾음
		int index3 = lists.lastIndexOf("수영"); //뒤에서부터 수영의 위치 찾음\
		//없는 글자의 위치 찾으면 -1
		System.out.println("index:"+index);
		System.out.println("index2:"+index2);
		System.out.println("index3:"+index3);
		
		boolean result = lists.contains("수영"); //리스트에 포함 여부 확인//있으면 true//없으면 false
		System.out.println("result:"+result);
		
		lists.set(1, "아이유"); //덮어쓰기
		System.out.println("lists:"+lists); 
		
		int i;
		for(i=0;i<lists.size();i++) {
			String s2 = lists.get(i);
			System.out.println(s2); //하나씩 출력
		}
		Iterator<String> it = lists.iterator(); //interface //하나씩 반복하고 싶을 때 //요소들이 문자열이라 String
		while(it.hasNext()) { //관리하는 게 있는지 물어봄//있으면 true
			//하나 가져와서 출력//더 있는지 확인 //true //가져와서 출력 //더 있는지 확인 //없으면 false //빠져나감
			String s3 = it.next(); 
			System.out.println(s3); 
		
		System.out.println("=======================");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.next();
		
		//index
		int index4 = lists.indexOf(name);
		if(index4 != -1) {
			System.out.println("가입한 회원입니다.");
		}else {
			System.out.println("가입하지 않은 회원입니다.");
		}
		
		//contains
		boolean result2 = lists.contains(name);
		if(result2 == true) {
			System.out.println("가입한 회원입니다.");
		}else {
			System.out.println("가입하지 않은 회원입니다.");
		}
		

		boolean flag = false;
		for(i=0;i<lists.size();i++) {
			if(name.equals(lists.get(i))) {
				System.out.println("가입한 회원입니다.");
				flag = true;
				break;
			}
		}if(flag==false) {
			System.out.println("가입하지 않은 회원입니다.");
		}
		
		System.out.println("==================================");
		
		ArrayList<Integer> lists2 = new ArrayList<Integer>();
		lists2.add(10); //e 타입 리턴 : 객체 만들 때 확정된 타입 리턴
//		lists2.add(new Integer(10)); //오토박싱
		lists2.add(20);
		lists2.add(30);
		System.out.println("lists2:"+lists2.toString());
		
		for(i=0;i<lists2.size();i++) {
//			Integer n = lists2.get(i);
			System.out.println(lists2.get(i));
		}
		
		Iterator<Integer> it2 = lists2.iterator();
		while(it2.hasNext()) {
//			Integer n2 = it2.next();
			System.out.println(it2.next());
		}
		
		Integer i1 = lists2.get(1);
		System.out.println("i1:"+i1);
		
		
		}

	}
}
/*
 배열 : 고정된 크기
 컬렉션 : 동적으로 메모리 확장/축소 가능한 저장 공간
 객체만 저장 가능 int ->Integer
 3가지 인터페이스 중 하나를 상속받은 클래스로 만들 수 있다.
 list : 들어간 순서 있는 데이터 집합. 중복 허용, 위치번호 있음
 ArrayList 
 set : 순서 없음. 중복 허용 않음, 위치번호 없음
 map : 키는 중복 허용 않고 값은 중복 허용
 키와 값의 쌍으로 이루어짐
 순서는 유지되지 않음
 */

