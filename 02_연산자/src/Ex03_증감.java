
public class Ex03_증감 {
	public static void main(String[] args) {
		int a=5, b=5, aa, bb;
		System.out.println("a="+a);
		//a = a + 1;
		//a += 1;
		//a++; // 1 증가 연산자(2 이상은 사용 불가)
		++a; // 단독으로 쓰일 때는 ++ 위치 상관 없음
		System.out.println("a="+a);
		
		// 다른 연산자와 쓸 때는 ++ 위치 차이 발생
		aa = ++a; //변수 앞 : 먼저 >> a를 1 증가 후 그 값을 aa에 대입
		System.out.println("a="+a+" aa="+aa);
		aa = a++; //변수 뒤 : 나중에 >> a를 먼저 aa에 대입하고 그 다음에 a를 1 증가
		System.out.println("a="+a+" aa="+aa);
		
		System.out.println("b="+b);
		//b = b-1;
		//b -= 1;
		//b--;
		//--b;
		System.out.println("b="+b);
		
		bb = --b; //변수 앞 : 먼저 >> b를 1 감소 후 그 값을 bb에 대입
		System.out.println("b="+b+" bb="+bb);
		bb = b--; //변수 뒤 : 나중 >> b를 먼저 bb에 대입하고 그 다음에 b를 1 감소
		System.out.println("b="+b+" bb="+bb);
		
		int i = 10;
		 // 단독으로 사용할 때만 syso 안에서 단독으로 사용할 때 다름
		System.out.println(i);
		System.out.println(i++); //콘솔 = i++
		//10을 콘솔에 먼저 출력한 다음 11로 증가
		System.out.println(++i); //콘솔 = ++i
		//증가한 11에 1을 증가한 뒤 그 값(12)을 콘솔에 출력
		System.out.println(++i);
		//12에 1을 증가한 뒤 그 값(13)을 콘솔에 출력
		System.out.println(i++);
		//13을 콘솔에 출력한 다음 14로 증가
		System.out.println(i);
		//14를 출력
		
		int j = 10;
		 // 단독으로 사용할 때만 syso 안에서 단독으로 사용할 때 다름
		System.out.println(j);
		System.out.println(j--); //콘솔 = j--
		//10을 콘솔에 먼저 출력한 다음 9로 감소
		System.out.println(--j); //콘솔 = --j
		//감소한 9에 1을 감소한 뒤 그 값(8)을 콘솔에 출력
		System.out.println(--j);
		//8에 1을 감소한 뒤 그 값(7)을 콘솔에 출력
		System.out.println(j--);
		//7을 콘솔에 출력한 다음 6으로 감소
		System.out.println(j);
		//6을 출력
		
	}

}
