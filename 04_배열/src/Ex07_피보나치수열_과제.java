
public class Ex07_피보나치수열_과제 { // 10개의 피보나치 수열 출력
	public static void main(String[] args) {
		int[] num= new int[10];
		num[0]=1;
		num[1]=2;
		int i;

////////////for문 풀이		
//		for(i=2;i<num.length;i++) { //2번방부터 채워야 함
//			num[i] = num[i-2] + num[i-1]; //2번방 = 0번방+1번방 //3번방=1번방+2번방
//		}
		
/////////////while문 풀이		
		i=2;
		while(true) {
			num[i] = num[i-2] + num[i-1];
			i++;
			if(i==num.length) {
				break;
			}
		}
		
		for(i=0;i<num.length;i++) { //출력은 0번방부터 해야 맨 위에서 지정한 0번방, 1번방도 출력됨
			System.out.print(num[i]+" ");	
		}
	}
}