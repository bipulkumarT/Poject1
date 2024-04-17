package test;

public class CallConst {
	
	int a;
	static int b=5;
	
	public CallConst(int a)
	{
		this.a=a;
	}
	
	public int c1()
	{
		 a = a+1;
		 return a;
	}

}

