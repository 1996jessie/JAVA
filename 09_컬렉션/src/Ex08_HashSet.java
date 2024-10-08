import java.util.HashSet;
import java.util.Set;

public class Ex08_HashSet {
	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(10);//i.add(new Integer(10)) : autoboxing
		hs.add(20);
		hs.add(30);
		System.out.println("hs:"+hs);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		Integer i;
		for(i=0;i<5;i++) {
			Integer a = (Integer)(int)(Math.random()*10)+1; 
			hs2.add(a);
		}
		System.out.println("hs2:"+hs2); //무조건 5번 하라고 하면 중복 있을 경우 다 안 출력되는 문제 발생
		
		HashSet<Integer> hs3 = new HashSet<Integer>();
		int count = 0;
		while(true) {
			count++;
			int a = (int)(Math.random()*10)+1; 
			hs3.add(a);
			if(hs3.size()==5) { //5개 출력될 때까지 반복
				break;
			}
		}
		System.out.println("count:"+count);
		System.out.println("hs3:"+hs3); 
		
	


		
		
	}
}
//HashSet 이용해서 로또 문제 다시 풀어보기
