import java.util.Calendar; //java.util

public class Ex14_Calendar {
	public static void main(String[] args) {
		//Calendar cal = new Calendar(); 
		//접근제어자 : protected : 같은 패키지, 다른 패키지의 상속받은 하위클래스기 떄문에 이 생성자로 올 수 없음
		Calendar cal = Calendar.getInstance(); //getInstance : calender 리턴
		System.out.println("cal:"+cal.toString()); //toString 오버라이딩(참조값 대신 현재시간 출력)
		int x = cal.get(Calendar.YEAR); //Calendar.YEAR=static final 변수=1
		System.out.print("오늘 날짜는 "+x+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+1+"월 "); //Calendar.MONTH=static final변수=2//월은 1월이 0부터 시작
		System.out.println(cal.get(Calendar.DATE)+"일 ");
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분 "+second+"초 입니다.");
		
		int yoil = cal.get(Calendar.DAY_OF_WEEK); //요일 = 7
		System.out.println(yoil); //숫자 출력//일요일이 1
		String[] week = {"","일","월","화","수","목","금","토"};
		System.out.println(week[yoil]+"요일");
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		
	
	
	}
}

