package domain;

public class BankAccount
{
	private int customer_id;
	private String name;
	private int credit;

	public int getCustomer_id()
	{
		return customer_id;
	}

	public String getName()
	{
		return name;
	}

	public int getCredit()
	{
		return credit;
	}

	public void setCustomer_id(int customer_id)
	{
		this.customer_id = customer_id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCredit(int credit)
	{
		this.credit = credit;
	}

	public BankAccount(int customer_id, String name, int credit)
	{
		this.customer_id = customer_id;
		this.name = name;
		this.credit = credit;
	}

}
