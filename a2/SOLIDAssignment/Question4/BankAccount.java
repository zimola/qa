public class BankAccount
{
	protected float balance;
	protected float exchangeRate = 1;

	public float GetBalance()
	{
		return balance;
	}

	public void Credit(float amount)
	{
		balance += amount;
	}

	public void Debit(float amount)
	{
		balance -= amount;
	}
}