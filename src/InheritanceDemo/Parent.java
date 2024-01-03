package InheritanceDemo;

class Parent {
	void test()
	{
		System.out.println("This is the test method in the parent class");
	}

}

class Child extends Parent{
	
}

class Main{
	public static void main(String[]args)
	{
		Child C1=new Child();
		C1.test();
		
		Parent P1=new Parent();
		P1.test();
	}
	
}