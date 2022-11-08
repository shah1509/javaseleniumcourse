package Package_1;

public class Student {
int rollnumber;
int age;

public void display1(){
	System.out.println("welcome to all of you");
}
public void display2() {
	System.out.println("automation is very easy");
}
public static void main(String[] args) {
	Student akash=new Student();
	akash.display1();
	akash.display2();
	akash.rollnumber=9;
	System.out.println(akash.rollnumber);
	akash.age=22;
	System.out.println(akash.age);
	
			
	
}
}
