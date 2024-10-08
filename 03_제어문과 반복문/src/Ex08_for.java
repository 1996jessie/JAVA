
public class Ex08_for {
	public static void main(String[] args) {
	
		int i, j;
		for(i=1;i<=3;i++) { //이중for문
			for(j=1;j<=2;j++) {
				System.out.println(i+","+j);
				
			}//안쪽 for
		}//바깥쪽 for
		
		for(i=2;i<=9;i++) {
			System.out.println("***"+i+"단***");
			for(j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("--------------------------------");
		}
				
			
	}
}
