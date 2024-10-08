
public class Ex13_짝수구구단_과제 {
	public static void main(String[] args) {
		int i, j;
		for(i=2;i<=9;i++) {
			if(i%2==0) {
				for(j=1;j<=9;j++) {
					System.out.println(i+"*"+j+"="+i*j); 
					if(i==j) {
						break;
					}	
				}System.out.println("-----------------");
			}
		}

		/*
		 for(i=2;i<=9;i++) {
			if(i%2==1) 
				break; //홀수면 break >> 바깥쪽 for문을 빠져나감 
			for(j=1;j<=9;j++) {

				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
			System.out.println();
		} //2단만 출력됨
		 */

		for(i=2;i<=9;i++) {
			if(i%2==1) 
				continue; // j를 만나지 않고 바로 i++로 감
			for(j=1;j<=9;j++) {
				if(i<j)
					break; //안쪽 for문 빠져나감 
				//continue도 가능하지만 계속 비교해야 해서 출력하는데 시간 오래 걸림
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
}

