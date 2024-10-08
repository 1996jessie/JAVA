import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_FileInputStream {
	public static void main(String[] args) {
		int i;
		FileInputStream fis = null; //참조변수 초기화 필요
		FileOutputStream fos = null;
		try {//현재 작업 중인 프로젝트 안에 있으면 경로 다 안 써도 됨 
			fis = new FileInputStream("Ex05_from.txt"); 
			//객체가 만들어지면 자바파일과 from.txt 사이의 연결 다리(스트림) 생성//이름 = fis//단방향 : 읽어오기만 가능
			fos = new FileOutputStream("Ex05_to.txt");//자동생성됨
//			FileOutputStream fos = new FileOutputStream("to.txt",true); 
//			FileOutputStream fos = new FileOutputStream("c:\\x\\to.txt");//폴더는 자동생성되지 않음//폴더까지는 생성해야 가능
			//자료를 내보내기만 할 수 있음 
			//실행하기도 전에 오류 확인 가능//RuntimeException 없음
			while(true) {
				i = fis.read(); //from.txt의 첫글자 읽음 //H의 아스키코드값 72 출력
				if(i==-1) {//파일의 맨 끝에는 EOF(상태) 들어있음//-1
					break;
				}
				System.out.print((char)i); 
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //오류 경로 추적
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //연결다리 끊어야 함 //try 내의 지역변수여서 사용 못함 //try문 밖으로 꺼내야 함
			try { 
				fis.close(); //cannot be resolved//unhandled//initialized 오류
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}

/*
FileNotFoundException이 발생되는 이유
new FileInputStream : 파일이 없을 때
new FileOutputStream : 폴더가 없을 때
new FileOutputStream("to.txt",false); //파일 없으면 생성/파일 있으면 교체//false 생략 가능 
new FileOutputStream("to.txt",true); //파일 없으면 생성/파일 있으면 추가
RuntimeException 오류 : 프로그래머의 실수
RuntimeException 없으면 예외처리 필수
 */
