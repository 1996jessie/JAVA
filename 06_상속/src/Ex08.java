class MyFather {  
	public String name;   
	private String nickname; 
	
	public MyFather(){   
		name = "아버지";   
		nickname = "대장";  
	}  
	public String getNickName(){   //private메서드만 아니면 가능//private메서드면 자식도 호출할 수 없음 //메서드는 일반적으로 public 사용
		return nickname;  
	} 
} 
class MySon extends MyFather {   //MySon은 자신의 변수는 없고 상속받은 변수만 2개 있음
/*
 	MySon() {
		super(); //myfather로 감
	} //숨어있음
 */
	public void sayFatherNames() {   
		System.out.println(name);   //public이라 출력 가능 //protected. default도 가능
		System.out.println(getNickName()); //private이라 get 통해서만 접근 가능
	}

}
public class Ex08{
	public static void main(String[] args) {   
		MySon m = new MySon();   //객체 생성
		m.sayFatherNames();  
	} 
}
