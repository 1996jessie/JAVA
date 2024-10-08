
public class Ex03_메서드 {
	public static void main(String[] args) { //main 메서드 정의 
		System.out.println("기상");
		System.out.println("세수");
		
		meal(); //meal 메서드 호출  //위치를 지정하지 않으면 한번도 출력되지 않음
		
		System.out.println("집청소");
		System.out.println("독서");
		
		meal(); //meal 메서드 호출
		
		System.out.println("TV");
		
		meal(); //meal 메서드 호출
		
		System.out.println("취침");

	}//main 끝
	
	public static void meal() {   //메서드 정의 //묶음의 이름은 마음대로 설정 
		System.out.println("식탁닦기");
		System.out.println("수저놓기");
		System.out.println("밥, 국, 반찬 세팅");
		System.out.println("먹고 설겆이");
		////return;
	}//meal 끝 //meal 호출한 곳으로 돌아감
	
}//class 끝


/*
메서드 : 특정한 작업을 반복해서 실행할 수 있도록 별도의 묶음을 만든 뒤 호출하여 실행
특정한 작업을 수행하도록 독립적으로 작성된 프로그램
항상 정의와 호출이 있어야 함
재사용 가능
 */
