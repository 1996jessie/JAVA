
public class Ex01_출력문 {
	public static void main(String[] args) {  // main 매서드
		System.out.println(10); // ; 세미콜론
		System.out.println(); // 엔터
		System.out.println(20);
		System.out.println('가'); // 문자
		System.out.println("가");
		//System.out.println('가나다'); // '' 안에는 한글자만 가능
		System.out.println("가나다"); //문자열
		System.out.println(' '); // 한칸 출력
		System.out.println("");
		
		System.out.println(10+20);
		System.out.println("10+20"); // 연산이 아닌 문자로 인식해서 그대로 출력됨
		System.out.println("10+20=" + 10+20); // 10+20=0 + : 연달아 ~ (연결)
		System.out.println("10+20=" + (10+20)); // () 내부 먼저 연산
		//3+5=8 출력하기(연습)
		System.out.println("3+5=8");
		System.out.println("3+5=" + (3+5));
		System.out.println("안녕하세요\t저의이름은'이예원'입니다.\n\n반갑습니다."); // ''는 "" 내부에서 그대로 출력
		System.out.println("안녕하세요\t저의이름은\"이예원\"입니다.\n\n반갑습니다."); // ""는 "" 내부에서 출력되지 않음 > \" 써서 출력해야 함
		System.out.println("\"쌍용강북센터\"에 등록하신 여러분을 환영합니다.");
		
		System.out.println("--------------------");
		int a = 123;
		//a = 123입니다.출력
		System.out.println("a = "+ a + "입니다." );
		System.out.printf("a = %d입니다.\n",a); // 맨 마지막에 빈줄 삽입(\n없으면 그 다음 출력이 이어서 나옴)
		//System.out.printf("a=%5d입니다.",a);
		
		char b = 'B';
		//b = B입니다.출력
		System.out.println("b = " + b + "입니다.");
		System.out.printf("b = %c입니다.\n", b);
		//System.out.printf("b = %d입니다.", b); // 66 출력 안됨
		System.out.printf("b = %d입니다.\n", (int)b); // int 사용해서 문자를 정수로 바꾸면 가능
		float c = 72.346f; // f 안 쓰면 double로 인식		
		//c = 72.346입니다.출력
		System.out.println("c = " + c + "입니다.");
		System.out.printf("c = %f입니다.\n", c); // 컴퓨터가 실수를 정확하게 파악하지 못하는 문제로 72.346001로 출력됨
		System.out.printf("c = %7.2f입니다.\n", c); // 7은 전체 자리수, 2는 소수 아래 자리수(셋째자리에서 반올림)
		System.out.printf("c = %.2f입니다.\n", c); // 소수점 아래 자리수는 지정, 그 외에는 딱 필요한 만큼만 자리 잡아줌(전체 자리수는 생략 가능)
		
		/*
		 * 서식문자
		 * 정수 : %d     %5d : 입니다 앞에 5자리 비도록 함
		 * 문자 : %c
		 * 실수 : %f
		 * 문자열 ; %s
		 */
		
		String s;
		s = "아이유"; // ""로 둘러싼 문자열 하고 싶으면 string 사용
		System.out.println("s = " + s + "입니다.");
		System.out.printf("s = %5s입니다.\n", s);
		//아이유의 나이는 123살 입니다.
		System.out.println(s +"의 나이는 " + a + "살 입니다."); // ln에는 서식문자 절대 쓰지 말 것
		System.out.printf("%s의 나이는 %d살 입니다.\n",s,a); // f에는 서식문자 꼭 쓸 것, 서식문자 개수 = 변수 개수, 변수 여러개는 ,로 연결
		
	}
}

/*
  주석처리
  class 이름만 변경하면 안된다. 
  파일명을 변경하면 class 이름도 자동으로 변경된다.
  문자는 따옴표로 둘러싸야 한다.
  단축키 
  복사 : ctrl + c
  붙여넣기 : ctrl + v
  잘라내기 : ctrl + x
  복붙 : ctrl + alt + 방향키
  라인이동(잘라내기+붙여넣기) : alt + 방향키
  실행 : ctrl + f11
  한줄 삭제 : ctrl + d
  여러줄 삭제 : 블럭 잡고 ctrl + d
  되돌리기 : ctrl + z
  출, 칸맞춤 : ctrl + i
  전체 선택 : ctrl + i
  / : 슬래시
  \ : 역슬래시
  : : 콜론
  ; : 세미콜론
  자동 import : ctrl+shift+O
  
 */