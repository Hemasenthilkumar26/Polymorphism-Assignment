package assignment.polymorphismAssignment;

class BankInfo {
	public void saving()
	{
		System.out.println("Saving Amount");
	}
	public void fixed()
	{
		System.out.println("Fixed Amount");
	}
	public void deposit()
	{
		System.out.println("Deposit Amount");
	}
}
class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Amount is debited");
	}
}
public class MethodOverride{
public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.deposit();
		bank.fixed();

	}
}
