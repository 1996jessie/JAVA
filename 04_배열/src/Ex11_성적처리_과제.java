import java.util.Scanner;

public class Ex11_성적처리_과제 {
	public static void main(String[] args) { //1,2,3,4,5 반복하고 5번 누르면 프로그램 종료하도록
		Scanner sc = new Scanner(System.in);
		int num;
		int studentNum;
		int i,j, temp;
		int sum=0, max, min;
		//int[] scores = new int[0]; //일단 방의 개수가 하나도 없다고 초기화(방은 없지만 주소(참조값)는 생김)
		//scores : 참조값을 담는 참조변수 //무조건 4byte
		int[] scores = null; //null : 아무것도 없음을 의미  //=:넣어라
		System.out.println(scores);

		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("번호 선택");
			num = sc.nextInt();

			//			if(num == 5) {
			//				break; //while 반복문 빠져나감
			switch(num) {
			case 1 : System.out.println("학생수=>");
			studentNum = sc.nextInt();
			scores = new int[studentNum]; //참조변수에 맨 처음 방 0개짜리의 주소 대신 새로운 주소 담아라
			break; 

			case 2 : 
//				if(scores.length ==0) { //1,2번을 하지 않았다는 뜻
				if(scores == null) { // 아직 배열이 만들어지지 않았다면	 //==:같다
					System.out.println("1.학생수입력부터 하세요.");
					continue; //for문 안 돌고 빠져나감
				}
				for(i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]:") ;
					scores[i] = sc.nextInt();
				}
				break;

			case 3 : 
//				if(scores.length ==0) { //1,2번을 하지 않았다는 뜻
				if(scores == null) {
					System.out.println("1.학생수|2.점수입력부터 하세요.");
					continue; //for문 안 돌고 빠져나감
				}
				for(i=0;i<scores.length; i++) { //시작부터 1을 거치지 않고 3을 선택하면 초기화 안됨 >> 맨 위에 scores 선언해야 함
					System.out.println("scores["+i+"]"+scores[i]); 
				}
				break;

			case 4 : 
//				if(scores.length == 0) { //1,2번을 하지 않았다는 뜻
				if(scores == null) {
					System.out.println("1.학생수입력부터 하세요.");
					continue; //for문 안 돌고 빠져나감
				}
				sum = scores[0];
				max= scores[0];
				min= scores[0];
				//min=max=sum=scores[0]; //한번에도 가능

				for(i=1;i<scores.length;i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
					if(min > scores[i]) {  //else if 안됨 why)elseif 쓰면 if문이 거짓일 때만 내려옴
						min = scores[i];
					}
				}
				System.out.println("최고점수:"+max);
				System.out.println("최하점수:"+min);
				System.out.println("합계:"+sum);
				System.out.println("평균:"+sum/scores.length);

				for(i=0;i<scores.length-1;i++) { //기준은 천천히
					for(j=i+1;j<scores.length;j++) { //비교대상은 빨리
						if(scores[i] > scores[j]) {
							temp = scores[j];
							scores[j] = scores[i];
							scores[i] = temp;
						}
					}
				}System.out.println("정렬한 결과");
				for(i=0;i<scores.length;i++ ) {
					System.out.print(scores[i]+" ");
				}
				System.out.println();
				break;

			case 5 : System.out.println("프로그램을 종료합니다.");
			System.exit(0); //무한반복을 강제로 종료할 때 

			default : System.out.println("1~5만 가능합니다.");
			} 


		}

	}
}


/*
 * 1번 선택 후 학생 수 입력하면 학생수만큼의 방 개수 만들기
 * 2번 선택하면 0번방부터 넣고싶은 점수 배열 등장 (학생수까지 다 입력하면 다음 단계로)
 * 3번 선택하면 리스트 주르륵
 * 4번 선택하면 최고 최하 평균 합계 정렬한결과 나오도록
 * 7번 선택하면 "1~5만 가능합니다." 출력
 * 5번 선택하면 강제종료
 * 1번 안하고 다른거부터 하면 "1학생수,2점수입력부터 진행하세요." 출력
 */
