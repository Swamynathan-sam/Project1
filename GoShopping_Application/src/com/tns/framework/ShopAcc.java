package com.tns.framework;

public abstract class ShopAcc
{
	protected int accNo;
	protected String accNm;
	protected float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.setAccNo(accNo);
		this.setAccNm(accNm);
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Product booked and charges are : "+charges);
	}
	void items(float charges)
	{
		System.out.println("Items delivered with charges : "+charges);
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
}