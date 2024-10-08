
public class Ex03 {
	public static void main(String[] args) {
		String s = null;
		try {
			//System.out.println(s.length()); //new NullPointerException()
			System.out.println(3/0); //new ArithmeticException();
			//Exception e= new NullPointerException();
			//Exception e= new ArithmeticException();
		}catch(NullPointerException e) { 
			System.out.println("NullPointerException:"+e);;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:"+e);
		}catch(Exception e) { //다 잡는 catch는 맨 뒤로
			System.out.println("Exception e:"+e);
		}
	}
}
	
/*
 예외마다 하고 싶은게 따로 있으면 각각의 catch
 이때 exception은 맨 뒤에
 예외처리만이 목적이면 exception 하나만 있어도 됨
 */
