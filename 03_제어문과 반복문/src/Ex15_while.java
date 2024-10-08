
public class Ex15_while {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println();

		i=1; 
		for (;;) { //자리는 있어야 함
			System.out.println(i);
			if(i>=5) // 종료 조건
				break;
			i++;
		}System.out.println("---------------------");
		i=1;
		while(i<=5) {
			System.out.println(i);
			i++; // i+=2 등 넣어서 원하는 만큼 증가시킬 수 있음 
			//조건식 참이면 {} 안으로 들어와서 출력 후 증감식 만남, 증감식 후 다시 조건식 가서 반복
			//증감식 후 조건식 거짓이면 {} 빠져나감 >> 증가한 상태에서 빠져나감
			//항상 참이면 무한루프, 항상 거짓이면 출력안됨
		}System.out.println("while문 밖:" + i);
		System.out.println();

		i=1;
		do { //일단 들어와라  //일단 반복문 안으로 들어온 다음 출력 하고 증감 후 비교해서 거짓이니까 {} 빠져나감
			System.out.println(i);
			i++;
		}while(i<=5); //그 다음에 비교 >> 참이면 또 do 안으로 들어옴 //거짓이면 빠져나가서 아랫줄 출력
		System.out.println("do~while문 밖:" + i);
	}
}

/*
초기식;
while(조건식) { //조건식이 참이면 {} 안으로 들어간다. //먼저 조건 비교
	반복할 문장;
	증감식;
}

초기식;
do {
	반복할 문장;
	증감식;
}while(조건식); //조건식이 참이면 {} 안으로 들어간다. //나중에 조건 비교
 */
