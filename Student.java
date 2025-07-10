class Student 
{
	int sno;
	String name;
	void setSno(int sno){
		this.sno=sno;
	}
	int getSno(){
		return this.sno;
	}
	void setName(String name){
		this.name=name;
	}
	String getSname(){
		return this.name;
	}
	void display(){
		System.out.println(sno+""+name);
	}
	
	
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setSno(101);
		s1.setName("sn");
		System.out.println(s1.getSno());
		System.out.println(s1.getSname());
		System.out.println("Hello World!");
	}
}
