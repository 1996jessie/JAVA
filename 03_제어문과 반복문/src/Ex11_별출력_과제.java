
public class Ex11_별출력_과제 {
	public static void main(String[] args) {

		int i,j;
		for(i=0;i<5;i++ ) {
			for(j=5;j>i;j--) {
				System.out.print("*"); 
			} 
			/*
			 for(k=0;k<=i;k++) { //굳이 공백 출력 안해도 됨
				System.out.print(" ");

			 */
			System.out.println();
		}

	}
}



