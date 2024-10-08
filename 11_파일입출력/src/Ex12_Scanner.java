import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_Scanner {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//Scanner(InputStream source);
		int num, sum = 0;
		try {
			Scanner sc = new Scanner(new File("Ex12_input.txt")); //java와 input.txt 연결
			
			sc.useDelimiter(",");
			while(sc.hasNextInt()) {
				num = sc.nextInt();
				System.out.println(num);
				sum += num;
			}
			System.out.println("sum:"+sum);
			sc.close(); //안정적으로 종료
		} catch (FileNotFoundException e) { //생성자마다 적절한 예외처리 필요
			
			e.printStackTrace();
		}
		
	}
}
