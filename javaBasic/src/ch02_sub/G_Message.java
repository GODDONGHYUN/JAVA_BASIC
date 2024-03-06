package ch02_sub;

public interface G_Message {
	
	public static final String GREETING_MESSAGE = "반갑습니다.";
	public static final String GOODBYE_MESSAGE = "수고하셨습니다";
	
	// public abstract void method1 (); 주석을 풀게되면 interfacesub 클래스에서 오류가 발생하게 되는데,
   // public abstract void method2 ();  interfacesub 클래스에서 메서드를 구현을 안해서 오류가 뜨는거임
//                                      그래서 오버라이딩 해서 구현 해줘야함

}