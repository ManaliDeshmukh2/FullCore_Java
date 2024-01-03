package InheritanceDemo;

public class HDFCBank extends UrbanBank{
	void Saving() 
	{
		System.out.println("This is HDFCBank which comes under UrbanBank or child class of UrbanBank class...");
		BranchName();
		GuideLines();
		Account();
	}
}

class SBI extends UrbanBank{
	void Deposit()
	{
		System.out.println("This is SBIBank which comes under UrbanBank or child class of UrbanBank class...");
		BranchName();
		GuideLines();
		Account();
		
	}
	
}