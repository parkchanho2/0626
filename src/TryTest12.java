/*
   
 */
public class TryTest12 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(7/0); //예외 오류 발생
			System.out.println(4);
		}catch(NullPointerException ne) { // 블록 실행 안됨
			System.out.println("예외 메시지: " + ne.getMessage());
			ne.printStackTrace();
		}catch(Exception e) { // 실행됨.
			System.out.println("예외 메세지: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
