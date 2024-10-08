
public class Ex01 {
	public static void main(String[] args) {
		
		try { //예외 발생할 것 같은 의심 코드 넣기 //예외 발생 여부 체크 시도 // 하나의 에러만 체크할 수밖에 없음 //실행해야 에러 여부 알 수 있음
			String str = null;
			System.out.println(str);
			System.out.println(str.length()); 
			//NullPointerException 에러 //NullPointerException : java.lang 패키지 안의 클래스 //import 안해도 됨 
			//new NullPointerException() 객체 만들어짐
			//예외 발생한 곳에서 즉시 catch로 넘어가고 다시 돌아오지 않음(아래의 에러 접근 x)
			System.out.println("예외처리");
			int[] arr = new int[2];
			arr[2] = 10; //new ArrayIndexOutOfBoundsException() 객체 만들어짐
		}catch(NullPointerException e) { //try에서 발생한 에러를 catch가 잡도록 //만들어진 객체를 넘김
			//NullPointerException e = new NullPointerException()
			System.out.println("e:"+e); //왜 에러가 발생했는지 이유
		}catch(ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException()
			System.out.println("e:"+e);
		}finally { //예외가 발생하든 안하든 반드시 처리해야 하는 코드
			System.out.println("finally");
		}
		System.out.println("프로그램 종료");
	}
}


/*
예외가 발생하면 갑자기 관련된 클래스 객체가 생성된다.
NullPointerException e = new NullPointerException()
try에 에러가 발생할 수 있는 코드 넣어두기
예외가 발생하든 안하든 반드시 처리해야 하는 코드
 */
