//overiding method 
class Account
	{
		String name;
		protected double balance;

		Account(String str, double amt)
		{
			name = str;
			balance = amt;
		}
		String getName()
		{
			return name;
		}
		double getBalance()
		{
			return balance;
		}
		void deposit(double amt)
		{
			balance += amt;
			System.out.println("Depositing :" +amt);
		}
		void withdraw(double amt)
		{
			balance -= amt;
			System.out.println("Withdrawing  :" +amt);
		}
	}
	class SavingsAccount extends Account
	{
		double interestRate;
	
		SavingsAccount(String str, double amt, double rate)
		{
			super(str, amt);
			interestRate=rate;
		}
	}
	
	class CheckingAccount extends Account
	{
			double overDraft;
			CheckingAccount(String str, double amt)
		{
			super(str, amt);
		}
	
		CheckingAccount(String str,double amt, double draft)
		{
			super(str, amt);
			overDraft = draft;
		}
	
		void withdraw(double amt)
		{
			System.out.println("Overdraft Amount : " + overDraft);
			if(amt <= balance)
			{
				balance -= amt;
				System.out.println("Withdrawing : " +amt);
			}
			else if ((amt> balance)&& (amt>(balance+overDraft)))
			{
				System.out.println("Sorry ! you cannot withdraw");
			}
			else 
			{
				double result = amt - balance;
				overDraft -= result;
				balance=0;
				System.out.println("Withdrawing: " + amt);
				System.out.println("Current Overdraft Amount: " + overDraft);
			}
		}
	}
			
			class AccountTest
			{
				public static void main(String [] args)
				{
					SavingsAccount sAccountObj = new SavingsAccount("john",500,4);
					System.out.println("\n Savings Account Details");
					System.out.println("----------------------");
					System.out.println("" + sAccountObj.getName() + " has an initial Balance of: " + sAccountObj.getBalance());
					sAccountObj.deposit(200);
					sAccountObj.withdraw(200);
					System.out.println("" + sAccountObj.getName() + " at the end of transaction has a Balance of :" + sAccountObj.getBalance());
			
					System.out.println("\n Checking Account Details ");
					System.out.println("---------------------");
					CheckingAccount cAccountObj = new CheckingAccount("nikita",200,200);
					System.out.println("" + cAccountObj.getName() + " has a initial Balance of :" + cAccountObj.getBalance());
					cAccountObj.deposit(200);
					cAccountObj.withdraw(500);
					System.out.println("" + cAccountObj.getName() + " at the end of transaction has a Balance of :" + cAccountObj.getBalance());
				}
			}