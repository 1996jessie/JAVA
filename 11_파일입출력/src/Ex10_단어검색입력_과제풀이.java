import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex10_단어검색입력_과제풀이 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String str;
		String line;
		int input; 
		boolean flag;
		BufferedReader kb = null;
		BufferedWriter out = null;
		BufferedReader in = null;
		while(true) {
			flag = false; //매번 초기화
			System.out.println("1.단어입력 2.단어검색 3.종료");
			input = sc.nextInt();
			
			switch(input) {
			
			case 1: 
				//키보드와 연결해서 입력받기
				kb = new BufferedReader(new InputStreamReader(System.in)); //스트림 형성
				System.out.println("단어/뜻 입력>>");
				str = kb.readLine(); //예외처리 throws //try/catch 해도 됨
				
				//voca.txt에 쓰기
				out = new BufferedWriter(new FileWriter("voca.txt",true)); //IOException 문제 발생 >> throws로 해결
				//false : 없으면 생성/있으면 교체(default) /true : 없으면 생성/있으면 추가
				out.write(str);
				out.write("\r\n"); //r : 맨 앞으로/n: 한 칸 아래
				out.close(); //출력 //flush도 가능한데 예외처리를 main에 해서 finally 쓸 수 없음 > 여기서 연결 끊어야 함
				
				break;
				
			case 2:
				//기보드와 연결
				System.out.println("검색 단어 입력>>");
				kb = new BufferedReader(new InputStreamReader(System.in));
				str = kb.readLine();
				
				//읽어오기
				in = new BufferedReader(new FileReader("voca.txt"));
				//한줄한줄 읽어서 비교를 반복
				while((line = in.readLine()) != null) { //EoF = null
					//분리하기
					String[] tokens = line.split("/");
					if(tokens[0].equalsIgnoreCase(str)) { //0번방과 입력한 단어가 같은지 //대소문자 상관없이
						System.out.println("단어>"+tokens[0]);
						System.out.println("단어의 뜻>"+tokens[1]);
						flag = true;
					}
				}
				if(flag == false) { 
					System.out.println("찾는 단어 없습니다.");
				}
				break;
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				if(kb != null) {  //null이 아니라는 건 스트림 형성이 되었다는 뜻
					kb.close(); //스트림 끊어내기
				}if(in != null) {
					in.close();
				}
				System.exit(0); //강제종료
				break;
				
			default : 
				System.out.println("1~3만 입력 가능");
			}
		}
	}
}
