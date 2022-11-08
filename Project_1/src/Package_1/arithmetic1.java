package Package_1;

public class arithmetic1 // (((((10+2)+2)-2)*2)/2)
{
	static int a=10;
	static int b=2;
	
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int sum, int b)
	{
		int d=sum-b;
		System.out.println("sub result is "+d);
		return d;
	}
	public int multi(int sub, int b)
	{
		int e=sub*b;
		System.out.println("multiplication result is "+e);
		return e;
	}
	public void dev(int multi, int b)
	{
		int f=multi/b;
		System.out.println("division result is "+f);
		}
	
	public static void main(String[] args) {
		arithmetic1 ob=new arithmetic1();
		int sumresult0=ob.sum(a,b);
		int sumresult1=ob.sum(sumresult0,b);
		int subresult=ob.sub(sumresult1, b);
		int multiresult=ob.multi(subresult, b);
		ob.dev(multiresult, b);
				
	}
}
