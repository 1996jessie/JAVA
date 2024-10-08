import java.util.StringTokenizer; //java util //import 필요

public class Ex13_StringTokenizer {
	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("20 24/02|01,1 2:02",", :"); 
		//첫번째 문자열을 두번째 문자열로 분리(두번째 문자열에 여러개 써도 됨)//구분자 아무 것도 없으면 공백으로 구분
		System.out.println("str:"+str); //참조값 출력
		int count = str.countTokens(); //몇 토큰로 분리?
		System.out.println("count:"+count);
		
		while(str.hasMoreTokens()) { //nextToken과 세트
			//분리시킬만한 토큰이 있는지?>> boolean 리턴 //true 
			//아직도 남았는지? //true //출력
			//아직도 남았는지? //없다 //false //끝
			String s = str.nextToken();
			System.out.println("s:"+s);
		}
		System.out.println("--------------------------");
		
//		"3+8+7+2" "+" 합계
		int sum=0;
		StringTokenizer str2 = new StringTokenizer("3+8+7+2", "+");
		while(str2.hasMoreTokens()) {
			String s2 = str2.nextToken();
//			System.out.println("s2:"+s2);
			sum += Integer.parseInt(s2); //문자를 숫자로 변환 
		}
		System.out.println("sum:"+sum);
		System.out.println("----------------------");
		System.out.println();
		
		String s = "3+8+7+2";
		int i;
		sum = 0;
		String[] result = s.split("\\+"); //메타문자
		System.out.println("방의 개수:"+result.length);
		for(i=0;i<result.length;i++) {
			System.out.println(result[i]);
			sum += Integer.parseInt(result[i]);
		}
		System.out.println("sum:"+sum);
		System.out.println();
		
		sum=0;
		
		String[] arr = {"민아:70","아이유:80","최강창민:90"};
		for(i=0;i<arr.length;i++ ) {
			StringTokenizer str3 = new StringTokenizer(arr[i],":");
			while(str3.hasMoreTokens()) {
				str3.nextToken(); //"민아"는 필요없음//날려버림
				String s3 = str3.nextToken(); //70
				sum += Integer.parseInt(s3);
			}
		}
		System.out.println("합계:" +sum);
		
		sum=0;
		for(i=0;i<arr.length;i++) {
			String[] result1 = arr[i].split(":");
			sum += Integer.parseInt(result1[1]); //0번방 : 이름 //1번방 : 점수
		}
		System.out.println("합계:"+sum);
		
		
//		String[] arr = {"민아:70","아이유:80","최강창민:90"};
//		String[] arr = new StringTokenizer({"민아:70","아이유:80","최강창민:90"},":");
	//	while(arr.hasMoreTokens()) {
//			String[] a = arr.nextToken();
//		}
		
	}
}
