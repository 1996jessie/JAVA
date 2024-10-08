import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_FileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fos = new FileOutputStream("Ex06_data.txt");
			bos = new BufferedOutputStream(fos,5); //buffer
//			bos = new BufferedOutputStream(new FileOutputStream("data.txt"),5);
			//BufferedOutputStream(OutpitStream out,int size) 생성자 사용
			//공간 다 차면 data.txt로 내보내기
			int i,a;
			for(i=1;i<10;i++) {
				bos.write(i+48); //'0'의 아스키코드 : 48
			}	
			bos.flush(); //buffer에 남아있는거 다 내보내라 //이거 없으면 5개만 콘솔에 출력됨
			
//			data.txt에서 읽어와서 콘솔창에 출력
			bis = new BufferedInputStream(new FileInputStream("Ex06_data.txt"),5);
//			fis = new FileInputStream("data.txt");
			while((a=bis.read())!=-1) {
				System.out.print((char)a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close(); //2차스트림 닫으면 1차스트림도 같이 닫힘 //이때 buffer에 남아있던 것 data로 넘어옴
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
스트림 : 자료의 입출력을 도와주는 중간매개체 역할
단방향 : 읽기/쓰기 동시에 되지 않음
FIFO 구조 (first in first out)
문자스트림 / 바이트스트림
바이트스트림 : 알파벳. 숫자. 특수문자 입출력 가능
문자스트림은 바이트스트림 포함
문자스트림 : 한글. 알파벳, 숫자, 특수문자 입출력 가능
1차 스트림 : 목표지점에 직접 연결됨
2차 스트림 : 1차스트림 통해서 가공하기 위함(보조적인 역할)
buffer : 입출력 속도를 높이기 위한 임시저장소
사이즈는 마음대로 지정할 수 있음(기본값 : 8192)
buffer와 1차스트림은 비슷한 형태여야 함
 */

