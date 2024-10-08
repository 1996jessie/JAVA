import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		
		String s1 = "AA"; //String은 기본자료형 아님 // 리터럴 문자열 : 하나의 공간(주소 같음)
		String s2 = new String("BB"); // new 할 때마다 새로운 공간(주소 다름)
		System.out.println(s1);
		System.out.println(s2);
		
		String str1 = "Have a nice day"; //a : 97
		String str2 = "Have A nice day"; //A : 65
//		String str1 = new String("Have a nice day");
//		String str2 = new String("Have a nice day");
		String str3 = "하하하";
		
		int len = str1.length(); //공백 포함
		System.out.println("len:"+len); 
		boolean result1 = str1.equals(str2); //대소문자까지 완전 같아야 true
		System.out.println("result:"+result1); 
		if(result1 == true) {
			System.out.println("두 문자열 같음");
		}else {
			System.out.println("두 문자열 같지 않음");
		}
		
		boolean result2 = str1.equalsIgnoreCase(str2); //대소문자 무시하고 비교
		System.out.println("result2:"+result2);
		if(result2 == true) {
			System.out.println("두 문자열 같음");
		}else {
			System.out.println("두 문자열 같지 않음");
		}
		
		int result3 = str1.compareTo(str2); //문자열이 같으면 0 //97-65=32차이//65-97=-32차이//앞-뒤 아스키코드
		System.out.println("result3:"+result3); 
		if(result3 ==0) {
			System.out.println("두 문자열 같음");
		}else {
			System.out.println("두 문자열 같지 않음");
		}
		
		int result4 = str1.compareToIgnoreCase(str2); //대소문자 무시하고 비교
		System.out.println("result4:"+ result4);
		if(result4 ==0) {
			System.out.println("두 문자열 같음");
		}else {
			System.out.println("두 문자열 같지 않음");
		}
		
		System.out.println(str1 == str2); //주소값 비교 //다르면 다시 만들지만 똑같으면 새로 만들지 않음//new String하면 새로 만들어져서 항상 주소 다름

		String result5 = str1.concat(str3); //두 문자열을 연결해라
//		String result5 =str1+str3;
		System.out.println("result5:"+result5);
		
		char result6 = str1.charAt(str1.length()-1); //위치는 0부터 시작 //개수는 1부터 시작// 길이-1 : 마지막 글자
		System.out.println("result6:"+result6);
		
		int result7 = str1.indexOf("day"); //str1에서 nice가 시작하는 위치 //indexOf 오버로딩 //-1이면 해당 단어 없음
		System.out.println("result7:"+result7);
		if(result7 == -1) {
			System.out.println("해당 단어는 없습니다.");
		}else {
			System.out.println("해당 단어가 있습니다.");
		}
		
		int result8 = str1.indexOf('a'); //한글자는 작은따옴표'' //처음 만난 a의 위치만 찾음 //int ch : 숫자 쓰거나 '' 안에 한글자
		System.out.println("result8:"+result8);

		int result9 = str1.lastIndexOf('a'); //뒤에서부터 찾음
		System.out.println("result9:"+result9);

		String result10 = str1.substring(2, 8); //부분 문자열 2번째부터 8번쨰 자리의 앞자리까지 가져오기(8번째는 가져오지 않음)
		System.out.println("result10:"+result10);
		
		String result11 = str1.substring(2); //2번째부터 끝까지 가져오기 
		System.out.println("result11:"+result11);
		
		String result12 = str1.replace('a', 'x'); //a를 x로 바꾸기
		System.out.println("result12:"+result12);
		
		String result13 = str1.toUpperCase(); //대문자로
		System.out.println("result13:"+result13);
		
		String result14 = str1.toLowerCase(); //소문자로
		System.out.println("result14:"+result14);
		
		Boolean result15 = str1.contains("nice"); //포함 여부 참, 거짓 //정확히 일치해야 함
		System.out.println("result15:"+result15);
		
		String str4= "  ab cd     e  ";
		System.out.println(str4.length()); //배열의 길이 구할 때는 괄호 없지만 메서드 호출은 소괄호 있어야 함
		System.out.println(str4);
		str4 = str4.trim(); //첫 글자 앞에 있는 공백, 마지막 글자 뒤에 있는 공백을 지움(중간 공백은 놔둠)
		System.out.println(str4.length()); 
		System.out.println(str4.toString()); //오버라이딩 //부모는 참조값(=주소), 자식은 문자열 리턴으로 오버라이딩
		
		System.out.println("------------------------------");
		String fullName = "Hello.java";
		
		int index = fullName.indexOf(".");
		System.out.println("index:"+index);
		String fileName = fullName.substring(0, index); //Hello
		String ext = fullName.substring(index+1); //java
//		String fileName = fullName.substring(0,(int)fullName.indexOf('.')); //Hello
//		String ext = fullName.substring((int)fullName.indexOf('.')+1); //java
		
		System.out.println("파일명:"+fileName);
		System.out.println("확장자:"+ext);
		
		System.out.println("--------------------");
		
		String str5 = "Hell$oWo$rld";
		int i;
		String[] result16 = str5.split("\\$"); //문자열 배열 //@ 기준으로 분리 //메타문자는 앞에 \\ 붙여야 함//메타문자 : . $ ^ * + ? [] {}()는 역슬래쉬 2개 필요
		System.out.println(result16.length);
		for(i=0;i<result16.length;i++) {
			System.out.println(result16[i]);
		}
		System.out.println();
		for(String j : result16) {
			System.out.println(j);
		}
		System.out.println("------------------");
		
		String id = "kim";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력:");
		String inputId = sc.next();
		
		System.out.println("비번 입력:");
		String inputPw = sc.next();

		if(id.equalsIgnoreCase(inputId) && pw.equals(inputPw)) { //동시에 참이면
			System.out.println("로그인 가능합니다.");
		}else {
			System.out.println("로그인 불가능합니다.");
		}
	}
}

