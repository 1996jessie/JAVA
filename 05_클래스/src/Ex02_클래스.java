class Student { //한 프로젝트 안에서 클래스 이름이 중복으로 있으면 안됨
	String name; //인스턴스 변수 why)객체를 만들 때마다 새로 규정되어 계속해서 다른 값을 가질 수 있음
	int kor, eng, math; //인스턴스 변수 
	static String school; //static(=정적=class) 변수(static : 공유자원) //먼저 넣어줘야 함(나중에 넣으면 먼저값 null) // 여러 객체에서 공유 가능
	//static 변수는 객체를 만들기 전에도 생성 가능
	//인스턴스 변수는 객체를 만들기 전에는 값을 넣을 수 없으
	Student () { //디폴트생성자 존재
		System.out.println("Student");
	}
}

public class Ex02_클래스 {
	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println("stu:"+stu);
		stu.name = "서현";
		stu.kor = 77;
		stu.eng = 88;
		stu.math = 99;
		//stu.school = "쌍용고";  the static field Student.school should be accessed in a static way 오류
		Student.school = "쌍용고"; //static 변수는 클래스 이름으로 접근
		System.out.println("학생 이름:"+stu.name);
		System.out.println("국어 점수:"+stu.kor);
		System.out.println("영어 점수:"+stu.eng);
		System.out.println("수학 점수:"+stu.math);
		System.out.println("고등학교명:"+Student.school);
		System.out.println();
		
		Student stu2 = new Student(); 
		System.out.println("stu2:"+stu2);
		stu2.name = " 박보검";
		stu2.kor = 55;
		stu2.eng = 76;
		stu2.math = 34;
		//stu2.school = "쌍용고";//양쪽에 같은 값이면 굳이 중복해서 넣을 필요 없음
		System.out.println("학생 이름:"+stu2.name);
		System.out.println("국어 점수:"+stu2.kor);
		System.out.println("영어 점수:"+stu2.eng);
		System.out.println("수학 점수:"+stu2.math);
		System.out.println("고등학교명:"+Student.school);

	}
}
//인스턴스 변수와 정적변수의 특징, 차이점 정리