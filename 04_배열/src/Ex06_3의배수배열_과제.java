public class Ex06_3의배수배열_과제 {   // 10개의 3의 배수 배열 출력
	public static void main(String[] args) {
		int[] arr= new int[10]; //10개의 방 만들기
		int i = 1;
		int index = 0; //방 번호 규정
		while (true) {
			if(i%3==0) {
				arr[index] = i; // 증가하는 값과 방번호가 각각 증가하도록 //3의 배수인 i값을 index에 넣어라
				index++;
				if(index==arr.length) { //마지막 방에 다 넣으면=방 번호가 배열의 길이와 같아지면=방번호가 10이면 반복문을 빠져나가라
					break;
				}
			}i++;
		}for(i=0;i<arr.length;i++) { //다 넣었다면 출력해라
			System.out.print(arr[i]+" ");
		}
	}


}