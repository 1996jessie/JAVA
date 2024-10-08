import java.util.Scanner;

public class Ex11_성적처리 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int num;
		int student=0;
		int i=0;
		int j=0;
		int temp;
		int[] score = null;
		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("번호 선택>");
			num = sc.nextInt();
	
			switch(num) {
			case 1: System.out.println("학생수>");
			student = sc.nextInt();
			score = new int[student];
			break;
			
			case 2: 
				if(score == null) {
					System.out.println("1학생수,2점수입력부터 진행하세요.");
					continue;
				}
				for(i=0;i<student;i++) {
					System.out.println("score["+i+"]>");
					score[i] = sc.nextInt();
				} 
				break;
				
			case 3: 
				if(score == null) {
					System.out.println("1학생수,2점수입력부터 진행하세요.");
					continue;
				}
				for(i=0;i<score.length;i++) {
				System.out.println("num["+i+"]:"+score[i]);
				}
				break;

			case 4: 
				if(score == null) {
					System.out.println("1학생수,2점수입력부터 진행하세요.");
					continue;
				}
				
				int max, min;
				max = score[0];
				min = score[0];
				int sum = 0;
				double avg;
					
				for(i=0;i<score.length;i++) {
					if(max < score[i]) { 
						max = score[i];
					}
				}
				for(i=0;i<score.length;i++) {
					if(min > score[i]) {
						min = score[i];
					}
				}
				for(i=0;i<score.length;i++) {
					sum += score[i];
				}
				avg = (double)sum/score.length;
				
				for(i=0;i<score.length-1;i++) { 
					for(j=i+1;j<score.length;j++) { 
						if(score[i]>score[j]) { 
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}

				System.out.println("최고점수:"+max);
				System.out.println("최하점수:"+min);
				System.out.println("합계:"+sum);
				System.out.printf("평균:%.2f",avg);
				System.out.println();
				System.out.println("정렬한 결과");
				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+" ");
				}
				System.out.println();
				break;

			case 5: System.out.println("프로그램을 종료합니다.");
			System.exit(0); 
			default : System.out.println("1~5만 가능합니다.");
			} 


		}
	}
}