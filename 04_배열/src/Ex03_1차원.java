
public class Ex03_1차원 {
	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		//score 변수 안에는 79(첫번째)의 주소만 들어감 >> score : 배열명
		
		int sum = score[0]+score[1]+score[2]+score[3]+score[4]+score[5]+score[6];
		System.out.println("sum="+sum);
		
		sum=0;
		sum = sum + score[0]; 
		sum = sum + score[1];
		sum = sum + score[2];
		sum = sum + score[3];
		sum = sum + score[4];
		sum = sum + score[5];
		sum = sum + score[6];
		System.out.println("sum="+sum);
		
		sum=0;
		int i;
		System.out.println("반복문");
		for(i=0;i<score.length;i++) {
			sum += score[i]; //sum = sum + score[i]도 가능
		}
		System.out.println("sum="+sum);
		System.out.println(sum/score.length);
		System.out.println();
		
		System.out.printf("평균:%.2f\n",(double)sum/score.length);
		System.out.println();
		
		int max, min;
		//int[] score = {79,88,91,33,100,55,95};
		max = score[0]; //79 //일단 넣어두고 비교 시작
		for(i=1;i<score.length;i++) {
			if(max < score[i]) { //score[i]가 더 크면 max값 바뀜 >> 바뀐 값이 새로운 max >> 마지막까지 다 했을 때 max값이 출력됨
				max = score[i];
			}
		}System.out.println("max : " + max);
		System.out.println();
		
		min = score[0];
		for(i=1;i<score.length;i++) {
			if(min > score[i]) {
				min = score[i];
			}
		}System.out.println("min : "+ min);
		

		
		
		
		
		
		
	}
}	



/*
배열명 안에는 참조값(=첫 방의 주소)이 들어온다
*/