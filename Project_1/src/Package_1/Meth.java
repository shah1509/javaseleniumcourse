package Package_1;

public class Meth {
	public void m1() {
		this.m4(1, 2, 3);
		System.out.println("default");
		this.m5(1, 111, 222, 333);
		this.m2(1);
		this.m3(1, 2);
	}
	public void m2(int a) {
		System.out.println("one para");
	}
	public void m3(int a, int b) {		
		System.out.println("two para");
	}
	public void m4(int a, int b, int c) {
		System.out.println("three para");
	}
	public void m5(int a, int b, int c, int d) {
		System.out.println("four para");
	}

	public static void main(String[] args) {
		Meth obj=new Meth();
		obj.m1();
	}
}
