class  NonStatic 
{
	/*int x=10;
	public static void main(String[] args) 
	{
		
		System.out.println(x);//CE:-Non static variable x can't be referenced from a static context.
								//we must access NSV only by using object reference..
	}*/
	//..........................................................
	/*int x=10;
	public static void main(String[] args) 
	{
		NonStatic ns= new NonStatic();
		System.out.println(ns.x);
	}*/
	//...............................................................
	/*
	int x=10;
	public static void main (String[]args){
		NonStatic ns1=new NonStatic();
		NonStatic ns2=new NonStatic();
		System.out.println(ns1.x);
		System.out.println(ns2.x);
		
	}*/
	//.................................................................
	static int a=10;
	int x=20;
	public static void main(String[]args){
		NonStatic ns1=new NonStatic();
		NonStatic ns2=new NonStatic();
		System.out.println(ns1.a+""+ns2.a);
		System.out.println(ns1.x+""+ns2.x);
		ns1.a=15;
		ns1.x=16;
		System.out.println(ns1.a+""+ns2.a);//static variable modification is effected to all object accesses same memory.						
		System.out.println(ns1.x+""+ns2.x);//Non Static variable modification is not effected to other objects ,
											//because every object has its own copy of memory..
		
		
	}
	
	
}
