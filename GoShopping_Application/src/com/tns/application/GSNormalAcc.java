package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float deliveryCharge) {
		System.out.println("dear normal user, Your Charges are: "+charges+" with delivary charge is: "+deliveryCharge);
		//super.bookProduct(deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
