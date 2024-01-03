package InheritanceDemo;

public class JSKBBank extends RuralBank {
	void Withdrow()
	{
		System.out.println("This is JSKBBank which comes under RuralBank or child class of RuralBank class...");
		BranchName();
		GuideLines();
		Loan();
		
		
	}

}
class NABADBank extends RuralBank{
	void Balance()
	{
		System.out.println("This is NABADBank which comes under RuralBank or child class of RuralBank class...");
		BranchName();
		GuideLines();
		Loan();
		
	}
}