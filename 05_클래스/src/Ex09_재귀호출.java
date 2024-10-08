
public class Ex09_재귀호출 {
	public static void main(String[] args) {
		show(3); //호출
	}
	static void show(int cnt) { //cnt = 3,2,1
		System.out.println("Hi~" + cnt);
		if(cnt == 1) { //cnt=1이면 호출한 곳(show(1)>show(2)>show(3))으로 돌아가라 //단번에 show(3)으로 돌아오지 않음
			return;
		}show(--cnt); //show 메서드 안에서 show 메서드 호출 : 재귀호출
	}
}
