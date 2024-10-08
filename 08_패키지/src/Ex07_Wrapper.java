public class Ex07_Wrapper {
	public static void main(String[] args) {

		int[] n = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i < n.length ; i++) {
			sum += n[i]; // sum = 1+2+3+4+5
		}
		System.out.println("sum:" + sum);

		sum = 0;
		String sum2="";
		String[] n2 = {"1","2","3","4","5"};
		//"1"+"2"+"3"+"4"+"5" => 12345 "1"=>1 "2"=>2
		for(int i = 0; i < n2.length ; i++) {
			sum2 += n2[i]; // sum = 1+2+3+4+5
		}
		System.out.println("sum2:" + sum2);

		for (int i = 0; i < n2.length; i++) {
			//sum += Integer.valueOf(n2[i]); // 1 2
			sum += Integer.parseInt(n2[i]);
		}
		System.out.println("sum:"+sum);

		sum = 0;
		String[] str = {"민아:70","아이유:80","최강창민:90"};
		int i;
		int index;
		String sub;
		for(i=0;i<str.length;i++) {
//			index = str[i].indexOf(":"); // 2 3 4
//			sub = str[i].substring(index+1);
//			sum += Integer.parseInt(sub);

			sum += Integer.parseInt(str[i].substring(str[i].indexOf(":")+1));
		}
		System.out.println("sum:"+sum);
		
		System.out.println();
		sum = 0;
		for(i=0;i<str.length;i++) {
			String[] arr = str[i].split(":"); // 민아:70
			sum += Integer.parseInt(arr[1]);
		}
		System.out.println("sum:"+sum);
		
	}
}




