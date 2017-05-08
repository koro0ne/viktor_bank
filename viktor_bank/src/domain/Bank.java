package domain;

import java.util.ArrayList;

public class Bank
{
	private ArrayList<BankAccount> bankAccounts;

	public ArrayList<BankAccount> getBankAccounts()
	{
		return bankAccounts;
	}

	public void setBankAccounts(ArrayList<BankAccount> bankAccounts)
	{
		this.bankAccounts = bankAccounts;
	}

	public Bank()
	{
		bankAccounts = new ArrayList<>();
	}
}
