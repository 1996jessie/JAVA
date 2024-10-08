
public class Ex04_관계논리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //자동으로 생성된 매서드라는 뜻(평소엔 삭제해두도록)
		
		int a = 10;
		int b = 10;
		boolean c = a < b;
		System.out.println("a<b : "+c);
		System.out.println("a<b : "+(a < b)); //연산자를 문자와 함께 쓸 때는 괄호로 둘러싸야 함
		// <=, >=처럼 등호는 오른쪽에 : 관계연산자
		
		c = a == b; // 같다 : ==
		System.out.println("c:"+c);
		c = a != b; // 다르다 : !=
		System.out.println("c:"+c);
		
		c = a>1 && b>1; // && : and 연산자
		System.out.println("c:"+c);
		
		c = a<1 && b>1;  // && 중심으로 모두 참일때만 참, 하나라도 거짓이면 거짓
		//참 거짓은 boolean에서만 가능
		System.out.println("c:"+c);
		
		c = a<1 || b>1;  // || 중심으로 모두 거짓일때만 거짓, 하나라도 참이면 참
		System.out.println("c:"+c);
		
		System.out.println(!(5<3)); //! : 사실을 반대로 바꾸겠다, IF !5<3이면 5를 반대로 바꾸겠다는 것인데 5는 T/F의 문제가 아니라서 사용할 수 없음

	}

}


/*
관계연산자
>= : 크거나 같다
<= : 작거나 같다
== : 같다
!= : 같지않다
*/
/*
논리연산자
&& : and 연산자
	T && T : T
	T && F : F : 하나라도 F면 F
	F && F : F
|| : or 연산자
	T || T : T
	T || F : T
	F || F : F
! : not 연산자
	!true : F
	!false : T
*/
