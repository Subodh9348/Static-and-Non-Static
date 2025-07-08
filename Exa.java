class T2
{
	static int a=20;
	int x=10;
	static void m1(){
	int a=15;
		 System.out.println(a);
	}
	void m2(){
		x=16;
	}
}


class Example3 
{
	public static void main(String [] args) 
	{
		T2 ex1=new T2();
		T2 ex2=new T2();
		T2.m1();
		
		System.out.println(ex1.a+""+ex2.a);
		ex1.m2();
		System.out.println(ex1.a+""+ex2.a);
		
		System.out.println(ex1.x+""+ex2.x);
		ex2.m2();
		System.out.println(ex1.a+""+ex2.x);
		
		
	}
}


