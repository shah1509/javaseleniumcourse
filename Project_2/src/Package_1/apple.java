package Package_1;

public class apple extends fruit {
	public apple() {
		this (2,3);
		System.out.println("child default");
	}
	public apple(int a) {
		this ();
		System.out.println("child one para");
	}
	public apple(int a, int b) {
		super (4,5);
		System.out.println("child two para");
	}
	public apple(int a, int b, int c) {
		this (1);
		System.out.println("child three para");
	}
	
	public static void main(String[] args) {
		apple obj=new apple(11,12,13);
	}

}
