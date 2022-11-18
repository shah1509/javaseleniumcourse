package Package_1;

public class vowel extends alphabet{
	public void n1() {
		super.m4(0, 0, 0);
		super.m1();
		super.m2(0);
		super.m3(0, 0);
		this.n2(7);
		this.n4(4,5,6);
		this.n3(2,3);
		System.out.println("child default");
	}
	public void n2(int a) {
		System.out.println("child one para");
	}
	public void n3(int a, int b) {
		System.out.println("child two para");
	}
	public void n4(int a, int b, int c) {
		System.out.println("child three para");
	}
	public static void main(String[] args) {
		vowel obj=new vowel();
		obj.n1();
	}

}
