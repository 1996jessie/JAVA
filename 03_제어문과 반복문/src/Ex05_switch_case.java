import java.util.Scanner;

public class Ex05_switch_case {

	public static void main(String[] args) {
		//과일명 입력해서 fruit 변수에 넣고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("과일명 입력:");
		String fruit = sc.next();
		System.out.println("과일명:"+fruit);
		switch(fruit) { //정수, 정수형 변수, 문자열, 한글자 문자 가능 VS 실수형 변수 사용 X
		case "apple" : System.out.println("사과");//문자열도 가능, 단 ""안에, 대문자, 소문자 정확히 일치해야 함
			break;
		case "grape" : System.out.println("포도");
			break;
		case "peach" : System.out.println("복숭아");
			break;
		default : System.out.println("그 밖의 과일");
		}
	}

}

//아직은 if로 바꾸기 어려움