/*class Example 
{
	//Static variable...
	static int a=10;
	static int b=20;
	//non-static Variable...
	int x=20;
	int y=30;
	
	public static void main(String[] args) 
	{
		//local variable...
		int p=50;
		int q=30;
	}
}*/
//...................................................................
/*
7 variables are declared:-a,b,x,y,args,p and q.
5 variables are provided memory:-a,b,args,p and q...
Note:-
	The instance variable are not provided memory because we have not created object from this class example..

*/
//........................................................................
/*
Identify how many variables are declare in this program how many variables are provided memory?....
*/
//.....................................................
/*class Example1
{
	//Static variable..
	static int a=10;
	static int b=20;
	//non-static variable...
	int x=20;
	int y=30;
	public static void main(String[]args){//Parameter variable....
		//Local variable.....
		int p=30;
		int q=40;
		Example1 ex1=new Example1();
	}
}*/
//...............................................
/*
8 variables are declare:-a,b,x,y,args,p,q,ex1..
All 8 varibles are provided memory:-
a,b,args,p,q,ex1,x,y...
*/
//..................................................................
/*.....................................................................
class Example1
{
	//static variable..
	static int a=10;
	static int b=20;
	//non-static variable..
	int x=30;
	int y=40;
	
	public static void main (String[]args){//parameter variable
		//local variable...
		int p=50;
		int q=20;
		Example1 ex1=new Example1();
		Example1 ex2=new Example1();
		m1(40);
	}
	static void m1(int m){
		int n=40;
	}
	static void m2(int s,int t){
		int u=v=70;
	}
}..................................................................*/
/*.................................................................
15 variables are declare:-a,b,x,y,args,p,q,ex1,ex2,m,n,s,t,u,v...
s,t,u,v are not provided memory ,because m2 method is not called..
memory are:-
	a,b,args,p,q
	ex1,x,y
	ex2,x,y
	m,n.
................................................................*/
/*
class Example1
{
	static int a=10;
	static int b=20;
	public static void main(String[]args){
		System.out.println(a);
		System.out.println(Example1.a);
		Example1 ex1=new Example1();
		System.out.println(ex1.a);
		Example1 ex2=null;
		System.out.println(ex2.a);
	}
}*/
/*.....................................................................
In a program we can access in 4 ways..
1.directly by its name:- sopln(a);
2.by using class name reference:-sopln(Example1.a);
3.by using object reference :-sopln(ex1.a);
4.by using null reference variable:-
									Example ex2=null;
									sopln(ex2.a);
...................................................................*/
/*class Example1
{
	static int a=10;
	static void m1(){
		System.out.println("m1"+a);
	}
	static void m2(){
		System.out.println("m2"+a);
	}
	public static void main (String[]args){
		System.out.println("from"+a);
		m1();
		m2();
	}
}*/
/*...............................................
Static variable memory is common to all methods mean the
same static variable memory is accessed from all methods
........................................................*/
