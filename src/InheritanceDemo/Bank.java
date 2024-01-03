package InheritanceDemo;

public class Bank {
	 void BranchName ()
	{
		System.out.println("This is main branch or parent class....");
	}
	 void GuideLines() {
		 System.out.println("Guidelines should be followed by every bank");
	  
	 }

}

class UrbanBank extends Bank{
	void Account()
	{
		System.out.println("This is UrbanBank which comes under Bank or child class of bank class...");
	}
}
	
class RuralBank extends Bank{
	void Loan()
	{
		System.out.println("This is RuralBank which comes under Bank or child class of bank class...");
	}
}
