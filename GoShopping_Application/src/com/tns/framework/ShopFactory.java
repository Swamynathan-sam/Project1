package com.tns.framework;

import com.tns.application.GSNormalAcc;

public abstract class ShopFactory 
{
	public abstract PrimeAcc getNewPrimeAccountAcc(int accNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharge);

}