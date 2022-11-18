package Package_1;

public class fruit {
	public fruit() {
		this (1,2,3);
		System.out.println("parent default");
	}
	public fruit(int a) {
		this ();
		System.out.println("parent one para");
	}
	public fruit(int a, int b) {
		this (5);
		System.out.println("parent two para");
	}
	public fruit(int a, int b, int c) {
		System.out.println("parent three para");
	}
	
}
