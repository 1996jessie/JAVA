package Video;

import java.util.Vector;

public class VideoShop {
	
	private Vector<String> v = new Vector<String>();
	public VideoShop() {
		v.addElement("어벤져스"); //0
		v.addElement("라이온킹"); //1
		v.addElement("스파이더맨"); //2
	}
	public synchronized String lendVideo() throws InterruptedException {
		Thread t = Thread.currentThread();
		if(v.size()==0) {
			System.out.println(t.getName()+" : 번호표 받음");
			wait(); //throw
			System.out.println(t.getName()+" : 다음 순서");
		}
		int size = v.size(); //3개
		String str = v.remove(size-1);
		return str;
	}
	public synchronized void returnVideo(String video) {
		v.addElement(video);
		notify(); //<->wait : 깨어나라 //sleep은 알아서 깨어남/wait은 notify 해야 깨어남
	}
}


/*
wait/sleep : notrunnable 상태 
 */
