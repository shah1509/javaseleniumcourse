package Package_1;

public class Const {
	public Const() {
		this(1,2,322,433);
		System.out.println("default");
	}
	public Const(int a) {
		this ();
		System.out.println("one para");
	}
	public Const(int a, int b) {
		this (1,2,3);
		System.out.println("two para");
	}
	public Const(int a, int b, int c) {
		this (1);
		System.out.println("three para");
	}
	public Const(int a, int b, int c, int d) {
		System.out.println("four para");
	}	
	public static void main(String[] args) {
		Const obj=new Const(1,2);
	}

}
