import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15_Date {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now:"+now.toString()); //toString 생략해도 됨
		System.out.println(now.getYear()+1900); //1900년부터 시작
		System.out.println(now.getMonth()+1);//1월이 0
		System.out.println(now.getDate()); //일
		System.out.println(now.getDay()); //요일 //월요일이 1, 일요일이 0
		System.out.println(now.getHours());
		
		SimpleDateFormat sdf, sdf2; //날짜형식 간단하게 지정하는 클래스
		sdf = new SimpleDateFormat("yy-MM-dd일 E요일");
		System.out.println(sdf.format(now));
		sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss"); //M:월, m:분 //a : 오전/오후
		System.out.println(sdf2.format(now));
	}
	
	
}
