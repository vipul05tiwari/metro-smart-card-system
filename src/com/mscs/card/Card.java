package com.mscs.card;

/**
 * {@link Card} is used to represent instance of Metro card. Represent information like 
 * card number, balance, etc.
 * 
 * @author vipul
 * @Date 20 Dec 2015
 */
public class Card 
{

	private final String cardNumber;
	
	private double balance;
	
	private CardHolderDetail cardHolderDetail;
	
	public Card(CardHolderDetail cardHolderDetail, String cardNumber, double balance)
	{
		this.cardHolderDetail = cardHolderDetail;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	
	public String getCardNumber() 
	{
		return cardNumber;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void updateBalance(double balance) 
	{
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", balance=" + balance + ", cardHolderDetail=" + cardHolderDetail
				+ "]";
	}
	
}
