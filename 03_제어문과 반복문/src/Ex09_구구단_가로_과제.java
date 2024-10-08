
public class Ex09_구구단_가로_과제 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			System.out.println();
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	
}

//빨리 출력되는 걸 안쪽 for문에 써야 함
