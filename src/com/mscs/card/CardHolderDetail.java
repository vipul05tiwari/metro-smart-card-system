package com.mscs.card;

import java.util.Date;

/**
 * {@link CardHolderDetail} holds detail for card holder.
 * 
 * @author vipul
 * @Date 20-Dec-2015
 */
public class CardHolderDetail 
{
	
	private String name;
	private Date dateOfBirth;
	private String mobileNumber;
		
	public CardHolderDetail(String name, Date dateOfBirth, String mobileNumber) 
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNumber() 
	{
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "CardHolderDetail [name=" + name + ", dateOfBirth=" + dateOfBirth + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	
}
