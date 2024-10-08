
public class Ex12_StringBuffer {
	public static void main(String[] args) {
		String s1 = "Have ";
		String s2 = "a ";
		String s3 = "nice day";
		String s4 = s1+s2+s3; //400번지는 바뀌지 않음 //String : 수정이 불가능한 클래스 //StringBuffer : 수정 가능한 클래스
		System.out.println(s4.toString());
//		Object toString(); //참조값 리턴
//		String toString(); //변수값 출력
		
		String s5 = s4.replace("nice","good");
		System.out.println("s5:"+s5);
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Have "); //객체 만드는 작업 꼭 해줘야 함 //속도가 빠름
		sb.append("a "); //조금씩 추가
		sb.append("nice day");
//					 7   11
//		sb => Have a nice day
		sb.replace(7, 11, "good"); //nice까지를 good으로 바꿔라
		System.out.println("sb1:"+sb.toString());
		
		sb.insert(7, "nice "); //끼워넣기
		System.out.println("sb2:"+sb.toString());
		
		sb.delete(7, 11); //삭제 //끝나는 숫자는 포함하지 않음
		System.out.println("sb3:"+sb.toString());
		
		sb.reverse(); //뒤집기
		System.out.println("sb4:"+sb);
		
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1.equals(str2));
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1.equals(sb2));
//		Object equals : 주소값(참조값) 비교
//		StringBuffer equals : 주소값(참조값) 비교
		String ss1 = sb1.toString(); //문자열 같은지 확인하려면 String으로 오버라이딩해서 비교
		String ss2 = sb2.toString();
		System.out.println(ss1.equals(ss2));
	}
	
}

//java.lang => Math, String, System, Wrapper(Integer, Character, Float~), StringBuffer, Object 
