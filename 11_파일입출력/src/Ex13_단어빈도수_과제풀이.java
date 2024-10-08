import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex13_단어빈도수_과제풀이 {
	public static void main(String[] args) throws IOException {
		
		//연결다리 생성
		BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));
		
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		String line;
		int i;
		int lineCount=0;
		while(true) {
			
			if((line = br.readLine())!=null) { //맨 끝을 만나지 않았으면 계속 반복해라
				//line : 한줄 들어가 있음
				lineCount++;
				String[] word = line.split(" "); //공백으로 분리시켜 word 배열에 넣어라
				for(i=0;i<word.length;i++) {
					word[i] = word[i].replace(",", ""); //쉼표 지우기	
					word[i] = word[i].replace("'", ""); //' 지우기
					if(hm.containsKey(word[i])) {
						Integer v = hm.get(word[i]); //value를 가져오기
						hm.put(word[i], v+1);
					}else { //처음 들어왔으면 1로 초기화
						hm.put(word[i], 1);
					}
				}//for문 끝
			}else {
				break;
			}
		}//while 끝
		System.out.println("전체 라인 수:"+lineCount);
		Set<String> set = hm.keySet();
		//System.out.println("set:"+set);
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+":"+hm.get(key));
		}
	}
}
