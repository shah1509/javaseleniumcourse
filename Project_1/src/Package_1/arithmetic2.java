package Package_1;

public class arithmetic2 // (((((10*2)+2)-2)-2)/2)
{
	static int a=10;
	static int b=2;
	
	public int multi(int a, int b)
	{
		int c=a*b;
		System.out.println("mutli result is "+c);
		return c;
	}
	public int sum(int multi, int b)
	{
		int d=multi+b;
		System.out.println("sum result is "+d);
		return d;
	}
	public int sub(int sum, int b)
	{
		int f=sum-b;
		System.out.println("sum result is "+f);
		return f;
	}
	public void dev(int sub, int b)
	{
		int g=sub/b;
		System.out.println("sum result is "+g);
	}
	public static void main(String[] args) {
		arithmetic2 ob=new arithmetic2();
		int multiresult=ob.multi(a, b);
		int sumresult=ob.sum(multiresult, b);
		int subresult0=ob.sub(sumresult, b);
		int subresult1=ob.sub(subresult0, b);
		ob.dev(subresult1, b);
				
	}
}
