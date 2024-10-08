public class Ex08_Wrapper {
	public static void main(String[] args) {

		String[] str = {"20","50","3.5","80"};
		//int i = Integer.parseInt("3.5"); // new NumberFormatException()
		int i,sum=0;
		for(i=0;i<str.length;i++) {
			try {
				sum  += Integer.parseInt(str[i]); // new NumberFormatException()
			}catch(NumberFormatException e) {
				System.out.println(i+"번 방 정수 변환 불가");
			}
		}
		
		System.out.println("sum:" + sum);
		
	}
}