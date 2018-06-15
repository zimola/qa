public class USDollarAccount extends BankAccount
{

	public void Credit(float amount)
	{
		balance += amount * exchangeRate;
	}

	public void Debit(float amount)
	{
		balance -= amount * exchangeRate;
	}
	
	public float getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	
}