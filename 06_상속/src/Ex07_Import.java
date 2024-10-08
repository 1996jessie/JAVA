
//import java.util.Date;
//import java.util.Scanner; //ctrl+shift+O
import java.util.*; //util패키지 안에 있는 모든 클래스를 쓰겠다 //class 이름만 별로 대신할 수 있음

import com.javastudy.Car; // 다른 패키지에 있을 때는 가져다 쓰는 클래스의 위치 알려줘야 함 //디폴트
//import java.lang.String; //java.lang 패키지 안에는 자주 사용하는 클래스들 >> import 안해도 사용 가능 //그 외는 다 import 해야 함
//import java.lang.System;

public class Ex07_Import { 
	public static void main(String[] args) {
		Car c = new Car("모닝", 2024); //com.javastudy.Car의 Car이 public이라 접근 가능
		c.prnCar();
		
		//java.util.Scanner sc = new java.util.Scanner(System.in); //매번 써도 되지만 맨 위에서 import 하는게 편리
		Scanner sc = new Scanner(System.in);
		//java.util.Date d = new java.util.Date(); 
		Date d = new Date(); 
		System.out.println(d); //보통 참조변수에는 주소가 들어옴 //Date 클래스는 실행한 날짜가 나옴
		
		//String s = new String("재미있는 자바공부"); 
		String s = "재미있는 자바공부";
		System.out.println(s); //주소 안나오고 문자열 나옴 //System s = new System() 안함
		
	}
}
