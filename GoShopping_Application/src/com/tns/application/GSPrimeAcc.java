package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	final static private float charges=0;
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	public void bookProduct(float charges)
	{
		System.out.println("Dearprime user , your product charges are: "+charges);
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
