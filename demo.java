class Demo
{
	int j;
	Demo(int j)
	{
		this.j=j;
	}
	void get()
	{
		j=20;
		System.out.println("the value of j"+j);
	}
	public static void main(String []args)
	{
		Demo ref=new Demo(6);
	}
}

