package ch06;

public class VariantParam {
	//자료형 ... 변수 = 가변사이즈 매개변수, 변수가 배열참조 변수가 됨
	//같은 자료형의 매개변수의 갯수에 관계없이 처리
	//매개변수들이 배열로 저장됨
	static void print(String ... n) { //n이 가변형 매개변수
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
	}
	
	public static void main(String[] args) {
		print("Java");
		print("Java","program");
		print("Java","program","jsp");
		print("Java","program","jsp","spring");
	}
	
//	static void print(String a) {
//		System.out.println(a);
//	}
//	
//	static void print(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
//
//	static void print(String a, String b, String c) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
//	
//	static void print(String a, String b, String c, String d) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//	}
}
