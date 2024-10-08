
public class Ex14_for {
	public static void main(String[] args) {
		int i;
		int sum = 0;

		//1에서 100의 합을 10 단위로 출력
		for(i=1;i<=100;i++) {
			sum += i;
			if(i%10==0) { //10의 배수인가?
				System.out.println("1~"+i+" : "+sum);
			}
		}System.out.println();

		//1에서 100까지의 숫자 중 10개씩의 합계 출력
		sum = 0;
		for(i=1;i<=100;i++) {
			sum += i;
			if(i%10==0)  {//10의 배수인가?
				System.out.println(i-9+"~"+i+" : "+sum); //뒤의 수보다 9 작은 숫자가 앞에 들어가야 함
				sum = 0; //합계가 들어있는 변수를 다시 초기화
				//초기화 하면 그 다음엔 11부터 sum
				//20까지의 합 출력 후 다시 초기화 후 21부터 sum (반복)
			}
		}
	}
}
