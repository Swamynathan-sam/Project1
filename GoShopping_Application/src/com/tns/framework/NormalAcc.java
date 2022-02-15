package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{
	final private float deliveryCharge=50;
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		//this.deliveryCharge = deliveryCharge;
	}

	public void bookProduct(float deliveryCharge)
	{
		System.out.println("charges are: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
				+ charges + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}