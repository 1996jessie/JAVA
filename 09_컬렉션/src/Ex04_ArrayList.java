import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
				
	}
	public String toString() { //오버라이딩
		return name+"/"+age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


public class Ex04_ArrayList {
	public static void main(String[] args) {
		Person p1 = new Person("제니",30);
		Person p2 = new Person("지수",40);
		Person p3 = new Person("로제",50);
		
		ArrayList<Person> lists = new ArrayList<Person>(); //name과 age로 구성된 Person객체 들어옴 // 내가 만든 객체 들어옴

				
//		lists.add(p1);
//		lists.add(p2);
//		lists.add(p3);
		Person[] arr = new Person[] {
									new Person("제니",30),
									new Person("지수",40),
									new Person("로제",50)
									};
		int i;
		for(i=0;i<arr.length;i++) {
			lists.add(arr[i]);
		}
		
		lists.add(new Person("리사",60)); //직접 넣어도 됨
		Person x = lists.get(0);
		System.out.println("x:"+x); //참조값 리턴//toString 오버라이딩 안되어 있음
		
		System.out.println("lists"+lists.toString()); //[ , , , ] 요소의 toString 호출되도록 오버라이딩해둠 //요소도 오버라이딩해야 보기좋게 출력
		
		for(i=0;i<lists.size();i++) {
			Person p = lists.get(i);
			System.out.println(p);
		}System.out.println();
		
		Iterator<Person> it = lists.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}
		
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 이름:");
		String name = sc.next();
		for(i=0;i<lists.size();i++) {
			Person p = lists.get(i);
			if(p.getName().equals(name)) {
				System.out.println(p.getName()+"의 나이는 "+p.getAge()+"입니다.");
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("찾는 이름이 없습니다.");
		}	
		System.out.println();
		
		flag = false;
		System.out.println("삭제할이름:");
		String delName = sc.next();
		for(i=0;i<lists.size();i++) {
			Person p = lists.get(i);
			if(delName.equals(p.getName())) {
				lists.remove(i);
				System.out.println("삭제 성공! lists:"+lists);
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("찾는 이름이 없습니다.");
		}

	}
}
